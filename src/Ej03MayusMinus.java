import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
public class Ej03MayusMinus {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = entrada.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());

    }
}
