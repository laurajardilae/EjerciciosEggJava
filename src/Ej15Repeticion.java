import java.util.Arrays;

/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class Ej15Repeticion {
    public static void main(String[] args) {
        int vector[]=new int[100];
        for(int i=0;i<100;i++){
            vector[i]=i+1;
        }
        System.out.println(Arrays.toString(vector));
       System.out.print("{");
        for(int i=99;i>=0;i--){
            System.out.print(vector[i]+", ");
        }
        System.out.println("}");
    }
}
