import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
public class Ej05Operando {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num = entrada.nextDouble();
        System.out.println("El doble del numero es: " + (num*2));
        System.out.println("El triple del numero es: " + (num*3));
        System.out.println("La raiz cuadrada del numero es: " + (Math.sqrt(num)));
    }
}
