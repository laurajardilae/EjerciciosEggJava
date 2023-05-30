import java.util.Scanner;

/*
Crear un programa que dado un numero determine si es par o impar.
 */
public class Ej06ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int num = entrada.nextInt();
        if(num%2==0){
            System.out.println("El numero es par");

        }else{
            System.out.println("El numero es impar");
        }
    }
}
