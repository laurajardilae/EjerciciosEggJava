import java.util.Random;
import java.util.Scanner;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
public class Ex23SopaDeLetra {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String palabra;

        String sopa[][]=new String[20][20];
        for (int i = 0; i < 5; i++) {
            do{
                System.out.println("Ingrese una palabra");
                palabra= entrada.nextLine().toUpperCase();
            }while(palabra.length()<3&&palabra.length()>5);
            anadirPalabra(palabra,sopa);
        }
        rellenarVacios(sopa);
        verMatriz(sopa);
    }
   public static void anadirPalabra(String palabra, String[][] matrix){
        Random aleatorio=new Random();
        int fila= aleatorio.nextInt(20);
        int columna= aleatorio.nextInt(20-palabra.length());
        for (int j = 0; j < palabra.length(); j++) {
            matrix[fila][columna+j]=palabra.substring(j,(j+1));
        }
    }
    public static void verMatriz(String[][] matrix){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void rellenarVacios(String[][] matrix){
        Random aleatorio=new Random();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(matrix[i][j]==null){
                    matrix[i][j]=Integer.toString(aleatorio.nextInt(10));
                }
            }
        }
    }
}
