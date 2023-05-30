import java.util.Scanner;

public class Ej01Sumarr {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los numeros que quieres sumar:");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int suma=sumar(num1,num2);
        System.out.println("La suma es "+suma);
    }
    public static int sumar(int num1, int num2){
        int resultado=num1+num2;
        return resultado;
    }
}
