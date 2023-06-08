import java.util.Random;


/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
public class Ex20Aleatorio {
    public static void main(String[] args) {
        int vector[]=new int[5];
        llenarVector(vector);
        verVector(vector);

    }
    public static void llenarVector(int vector[]){
        Random aleatorio=new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i]= aleatorio.nextInt(101);
        }
    }
    public static void verVector(int vector[]){
        System.out.println("El vector es: ");
        for (int elemento: vector) {
            System.out.print(elemento+" ");
        }
        System.out.println("");
    }
}
