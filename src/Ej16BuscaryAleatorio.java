import java.util.Arrays;
import java.util.Scanner;

/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
public class Ej16BuscaryAleatorio {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int N = entrada.nextInt();
        int vector[] = new int[N];
        for(int i=0;i<N;i++){
            vector[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(vector));
        System.out.println("¿Qué numero desea buscar?");
        int num,repetido=0;
        num= entrada.nextInt();
        for(int i=0;i<N;i++){
            if(vector[i]==num){
                System.out.println("El numero se ubica en la posición " +i);
                repetido++;
            }
        }
        if(repetido>1){
            System.out.println("El numero se encuentra repetido en el vector");
        }
    }


}
