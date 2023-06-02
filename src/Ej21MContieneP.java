/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */

import java.util.Scanner;

public class Ej21MContieneP {
    public static void main(String[] args) {
        int M[][]=new int[10][10], P[][]=new int[3][3];
        for(int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                M[i][j]=(int)(Math.random()*50);
            }
        }
        verMatriz(M,10,'M');
        rellenarMatriz(P);
        verMatriz(P,3,'P');
        MContieneAP(M,P);
    }
    public static void verMatriz(int matrix[][],int N,char nombre){
        System.out.format("La matriz %c es:\n",nombre);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void rellenarMatriz(int matrix[][]){
        Scanner entrada= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format("Ingrese el numero de la posición [%d][%d] de la matriz P: ", i, j);
                matrix[i][j] = entrada.nextInt();
            }
        }
        System.out.println("");
    }
    public static void MContieneAP(int M[][], int P[][]){
        boolean contiene=true,encontrada=false;
        int fila,columna; //Posicion inicio de P si SI esta en M
        int iP=0, jP=0; //Estas variables me permitiran recorrer P
        for (int i = 0; i < 8; i++) {  //Recorro M hasta el 7 porque hasta ahí me cabe una matriz de 3x3
            for (int j = 0; j < 8; j++) {
                //Si localizo un elemento en M que coincida con el primer elemento de P entro al ciclo
                if(M[i][j]==P[iP][jP]){
                    fila=i; //Guardo en estas variables la posición inicial de P en M
                    columna=j;
                    //Ejecutare 2 bucles que van a comparar la submatriz de M que inicia en [fila][columna] con P
                    for (int f = fila; f < (fila+3); f++) {
                        for (int c = columna; c < (columna+3); c++) {
                            //puse como requisito que sea true para el caso de que el primer numero sea igual pero el siguiente sea diferente
                            //entonces una vez el programa encuentre que es diferente contiene sea falso ya no puede volver a ser verdadero
                            if(M[f][c]==P[iP][jP]&&contiene==true){
                                contiene=true;
                                jP++;
                            }
                            else{
                                contiene=false; //pero esto probablemente se solucione si en else pongo un break que me saque del ciclo (tocaria probar)
                            }
                        }
                        jP=0;
                        iP++;
                    }
                    if(contiene){
                        System.out.println("Encontré tu submatriz! Inicia en la posición:");
                        System.out.println("Fila ["+fila+"] Columna ["+columna+"]");
                        encontrada=true;
                    }
                    jP=0;
                    iP=0;
                    fila=0;
                    columna=0;
                    contiene=true;
                }
            }
        }
        if(!encontrada){
            System.out.println("La matriz M NO contiene la matriz P");
        }
    }
}
