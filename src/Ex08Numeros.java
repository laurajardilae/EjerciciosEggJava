import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
public class Ex08Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,leidos=0,pares=0,impares=0;
        do {
            System.out.println("Ingrese un numero");
            num= entrada.nextInt();
            leidos++;
            if(num<0){
                continue;
            }
            if(num%2==0){
                pares++;
            }else{
                impares++;
            }
        }while(!(num%5==0));
        System.out.println("Numeros ingresados: "+leidos);
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
    }
}
