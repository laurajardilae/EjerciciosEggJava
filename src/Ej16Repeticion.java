import java.util.Arrays;
import java.util.Scanner;

/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
public class Ej16Repeticion {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de elementos ");
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int vector[] = new int[N];
        for(int i=0;i<N;i++){
            vector[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(vector));
        System.out.println("Ingrese el numero a buscar");
        int num = entrada.nextInt();
        int contador=0;
        for(int i=0;i<N;i++){
            if(vector[i]==num){
                System.out.println("El numero se encuentra en la posición " + i);
                contador++;
            }
        }
        if (contador>1){
            System.out.println("El numero se encuentra repetido");
        }
    }
}
