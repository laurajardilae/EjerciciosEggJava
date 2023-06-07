import java.util.Scanner;

/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
 */
public class Ex09RestasSucesivas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dividendo,divisor;
        System.out.println("Ingrese el numero que desea dividir y posteriormente el divisor");
        dividendo= entrada.nextInt();
        divisor=entrada.nextInt();
        divisionResta(dividendo,divisor);

    }
    public static void divisionResta(int dividendo, int divisor){
        int cosiente=0;
        while(dividendo>=divisor){
            dividendo-=divisor;
            cosiente++;
        }
        System.out.format("El numero cabe %d veces y sobra %d",cosiente,dividendo);
    }
}
