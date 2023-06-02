import java.util.Scanner;

/**
 *
 * @author imolero
 */
public class Ej17Repeticion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("ingrese la longitud del vector: ");
        n = scan.nextInt();
        int[] vector = new int[n];
        int[] resultado = new int[5];

        for (int i = 0; i < 5; i++){
            resultado[i] = 0;
        }

        for (int i = 0; i < n; i++){
            vector[i] = (int) (Math.random()*15000);
            //    System.out.println(vector[i]);
        }

        for (int i = 0; i < n; i++) {
            /*
            if (vector[i] / 10 == 0) {
                resultado[0]++;
            } else if (vector[i] / 100 == 0) {
                resultado[1]++;
            } else if (vector[i] / 1000 == 0) {
                resultado[2]++;
            } else if (vector[i] / 10000 == 0) {
                resultado[3]++;
            } else if (vector[i] / 100000 == 0) {
                resultado[4]++;
            } 
            */
            for (int j = 0; j < 5; j++){
                if (vector[i] / (int)Math.pow(10, j + 1) == 0) {
                    resultado[j]++;
                    break;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("para " + (i+1) + " digitos: " + resultado[i]);
        }
    }

}