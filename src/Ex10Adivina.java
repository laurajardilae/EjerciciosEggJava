import java.util.Random;
import java.util.Scanner;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
public class Ex10Adivina {
    public static void main(String[] args) {
        Random aleatorio=new Random();
        Scanner entrada=new Scanner(System.in);
        int num1,num2,secreto,usu;
        num1=aleatorio.nextInt(11);
        num2=aleatorio.nextInt(11);
        secreto=num1*num2;

        do{
            System.out.println("Ingresa el numero secreto");
            usu= entrada.nextInt();
            if (secreto<usu){
                System.out.println("Intenta un numero mas chico\n");
            }else if(secreto>usu){
                System.out.println("Intenta un numero mas grande\n");
            }

        }while(usu!=secreto);
        System.out.println("Adivinaste!");

    }
}
