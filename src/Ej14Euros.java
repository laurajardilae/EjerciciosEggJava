import java.util.Scanner;

public class Ej14Euros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros: ");
        double euros = entrada.nextDouble();
        System.out.println("Seleccione la moneda a la que desea hacer la conversión");
        System.out.println("1. Libras\n2. Pesos\n3. Yenes");
        int moneda = entrada.nextInt();
        convertir(euros,moneda);
    }
    public static void convertir(double euros, int moneda){
        double resultado;
        switch(moneda){
            case 1:
                resultado = euros*0.86;
                System.out.println(euros + " euros equivalen a " + resultado + " libras.");
                break;
            case 2:
                resultado = euros*1.28611;
                System.out.println(euros + " euros equivalen a " + resultado + " pesos.");
                break;
            case 3:
                resultado = euros*129.852;
                System.out.println(euros + " euros equivalen a " + resultado + " yenes.");
                break;
            default:
                System.out.println("Opción inválida");
        }

    }
}
