/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */

import java.util.Scanner;

public class Ej02Nombre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);
    }
}
