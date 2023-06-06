import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
public class Ex07Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, contador = 1,  num;
        double suma = 0;
        Integer min = null, max = null;
        System.out.println("Ingrese la cantidad de numeros");
        cantidad = entrada.nextInt();


        /*while (contador<=cantidad){
            System.out.format("Ingrese el %d numero: ",contador);
            num= entrada.nextInt();
            if(contador==1){
                max=num;
                min=num;
            }

            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }

            suma+=num;
            contador++;
        };*/
        do {
            System.out.format("Ingrese el %d numero", contador);
            num = entrada.nextInt();
            if (contador == 1) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            suma += num;
            contador++;
        }
        while (contador <= cantidad);

        System.out.println("El promedio es: " + (suma / cantidad));
        System.out.println("El numero mayor es: " + max);
        System.out.println("El numero menor es: " + min);
    }
}

/*

 */