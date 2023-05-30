import java.util.Scanner;

public class Ej11Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1,num2,resultado;
        System.out.println("Ingresa dos numeros");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        menu(num1,num2);
    }

    public static void menu(int num1, int num2) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        do {
            System.out.println("MENÚ\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElige una opción");
            opc= entrada.nextInt();
            switch(opc) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }while(opc!=5);


    }
}
