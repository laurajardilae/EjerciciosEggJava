/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

import java.util.Scanner;

public class Ej04Grados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados");
        double centigrados = entrada.nextDouble();
        double farenheit = 32 + ((9 * centigrados) / 5);
        System.out.println("La temperatura en grados Farenheit es: " + farenheit);

    }
}
