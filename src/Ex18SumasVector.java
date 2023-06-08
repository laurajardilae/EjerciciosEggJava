/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
import java.util.Scanner;

public class Ex18SumasVector {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int N=entrada.nextInt();
        double vector[]=new double[N];
        llenarVector(vector);
        //verVector(vector);
        System.out.println("La suma es " + sumarVector(vector));
    }
    public static void llenarVector(double vector[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los elementos del vector: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i]= entrada.nextDouble();
        }
    }
    public static void verVector(double vector[]){
        for (double elemento: vector) {
            System.out.print(elemento+" ");
        }
        System.out.println("");
    }
    public static double sumarVector(double vector[]){
        double suma=0;
        for (double elemento: vector) {
            suma+=elemento;
        }
        return suma;
    }
}
