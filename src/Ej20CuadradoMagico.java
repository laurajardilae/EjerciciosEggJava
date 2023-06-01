import java.util.Scanner;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
public class Ej20CuadradoMagico {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        rellenarMatriz(matrix);
        verMatriz(matrix);
        boolean filas,columnas,diagppal,diagsecun;
        filas=sumaFilas(matrix);
        columnas=sumaColumnas(matrix);
        diagppal=sumaDiagonalppal(matrix);
        diagsecun=sumaDiagonalsecun(matrix);
        if (filas&columnas&diagppal&diagsecun){
            System.out.println("El cuadrado es mágico");
        }else {
            System.out.println("El cuadrado no es mágico");
        }
    }
    public static void rellenarMatriz(int matrix[][]){
        Scanner entrada= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.format("Ingrese el numero de la posición [%d][%d]: ",i,j);
                    matrix[i][j]= entrada.nextInt();
                }while(matrix[i][j]<0||9<matrix[i][j]);
            }
        }
    }

    public static void verMatriz(int matrix[][]){
        System.out.println("La matriz es:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static boolean sumaFilas(int matrix[][]){
        boolean filas=true;
        int suma=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma+=matrix[i][j];
            }
            if (filas){
                filas=(suma==15);
                suma=0;
            }
        }
        return filas;
    }
    public static boolean sumaColumnas(int matrix[][]){
        boolean columnas=true;
        int suma=0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                suma+=matrix[i][j];
            }
            if (columnas){
                columnas=(suma==15);
                suma=0;
            }
        }
        return columnas;
    }

    public static boolean sumaDiagonalppal(int matrix[][]) {
        boolean diagonales;
        int suma = 0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (i == j) {
                    suma += matrix[i][j];
                }
            }
        }
        diagonales = (suma == 15);
        return diagonales;
    }

    public static boolean sumaDiagonalsecun(int matrix[][]) {
        boolean diagonales;
        int suma = 0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (i+j==2) {
                    suma += matrix[i][j];
                }
            }
        }
        diagonales = (suma == 15);
        return diagonales;
    }

}
