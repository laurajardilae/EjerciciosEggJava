import java.util.Scanner;

public class Ex15CalculadoraFunciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        double num1,num2;
        int opc;
        num1= leer.nextDouble();
        num2= leer.nextDouble();
        do {
            System.out.println("Seleccione la operación\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
            opc= leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println(sumar(num1,num2));
                    break;
                case 2:
                    System.out.println(restar(num1,num2));
                    break;
                case 3:
                    System.out.println(multiplicar(num1,num2));
                    break;
                case 4:
                    System.out.println(dividir(num1,num2));
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while(opc!=5);
    }
    public static double sumar(double num1,double num2){
        double resultado=num1+num2;
        return resultado;
    }
    public static double restar(double num1,double num2){
        double resultado=num1-num2;
        return resultado;
    }
    public static double multiplicar(double num1,double num2){
        double resultado=num1*num2;
        return resultado;
    }
    public static double dividir(double num1,double num2){
        double resultado=num1/num2;
        return resultado;
    }
}
