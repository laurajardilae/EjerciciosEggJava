import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
public class Ex22SumaMatriz {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Random aleatorio=new Random();
        System.out.println("Ingresa el numero de filas y columnas de la matriz: ");
        int N= entrada.nextInt();
        int M= entrada.nextInt();
        int matrix[][]=new int[N][M];
        int suma=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j]= aleatorio.nextInt(50);
                suma+=matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("La suma es: "+suma);
    }

}
