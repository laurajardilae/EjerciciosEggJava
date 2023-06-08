import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class Ex16Edades {
    public static void main(String[] args) {
        ingresar();


    }
    public static void ingresar(){
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("¿Desea ingresar una nueva persona? (Si/No): ");
            respuesta= leer.nextLine().toLowerCase();
            System.out.println(respuesta);
            if(respuesta.equals("si")){
                mayoriaDeEdad();
            }else if (respuesta.equals("no")) {
                System.out.println("Hasta luego");
            }else{
                System.out.println("Ingrese una respuesta válida");
            }
        }while(!respuesta.equals("no"));
    }
    public static void mayoriaDeEdad(){
        Scanner leer = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad: ");
        edad= leer.nextInt();
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else if (edad>=0||edad<18) {
            System.out.println("Es menor de edad");
        }else {
            System.out.println("La edad ingresada no es válida");
        }

    }

}
