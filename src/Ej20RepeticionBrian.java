import java.util.Scanner;
/**
 *
 * @author brian
 */
public class Ej20RepeticionBrian {

    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
    1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
    idénticas. Crear un programa que permita introducir un cuadrado por
    teclado y determine si este cuadrado es mágico o no. El programa deberá
    comprobar que los números introducidos son correctos, es decir, están
    entre el 1 y el 9.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                do {
                    System.out.println("Ingrese número del 1 al 9 en la posición ["+i+","+j+"]");
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] < 1 || matriz[i][j] > 9)
                        System.out.println("Erroneo, vuelva a ingresar");
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);

            }

        }

        int sumaDiag1=0;
        int sumaDiag2=0;
        boolean iguales=true;

        for (int i = 0; i < matriz.length; i++) {
            sumaDiag1 += matriz[i][i];
        }

        for (int i = 0; i < matriz.length; i++) {
            sumaDiag2 += matriz[i][matriz.length-1-i];
        }

        if (sumaDiag1==sumaDiag2) {
            int sumaFila;
            int[] vector = new int[matriz.length];
            int i=0;
            for(int[] fila: matriz) {
                sumaFila=0;
                for (int elemento: fila) {
                    sumaFila+=elemento;
                }

                if (sumaFila!=sumaDiag1) {
                    iguales=false;
                    break;
                }
            }

            if (iguales){
                int sumaCol=0;
                for(int[] fila: matriz) {
                    sumaCol+=fila[0];

                }

                if (sumaCol!=sumaDiag1) {
                    iguales=false;
                }
            }
        } else {
            iguales=false;
        }

        if (iguales)
            System.out.println("El cuadrado SI es mágico");
        else
            System.out.println("El cuadrado NO es mágico");

    }

}
