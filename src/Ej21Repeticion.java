import java.util.Scanner;

public class Ej21Repeticion {
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
        int fila,columna;
         for (int i = 0; i < 8; i++) {  //Recorro M hasta el 7 porque hasta ahí me cabe una matriz de 3x3
            for (int j = 0; j < 8; j++) {
                if(M[i][j]==P[0][0]){ //Si localizo un elemento en M que coincida con el primer elemento de P entro al ciclo
                    fila=i; //Guardo en estas variables la posición inicial de P en M
                    columna=j;
                    //Ejecutaré 2 bucles que van a comparar la submatriz de M que inicia en [fila][columna] con P
                    for (int k = 0; k < 3; k++) {
                        for (int h = 0; h < 3; h++) {
                            if(M[k+i][h+j]==P[k][h]){
                                contiene=true;
                            }
                            else{
                                contiene=false;
                                break;
                            }
                        }
                        if(contiene==false){
                            break;
                        }
                    }
                    if(contiene){
                        System.out.println("Encontré tu submatriz! Inicia en la posición:");
                        System.out.println("Fila ["+fila+"] Columna ["+columna+"]");
                        encontrada=true;
                    }
                }
            }
        }
        if(!encontrada){
            System.out.println("La matriz M NO contiene la matriz P");
        }
    }
}
