import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Ex06Estatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantas estaturas desea ingresar?");
        int estaturas = entrada.nextInt();
        double promedioTotal=0,estatura;
        int chiquitos=0;

        for(int i=0;i<estaturas;i++){
            System.out.println("Ingrese la estatura numero " + (i+1)+ " en metros.");
            estatura= entrada.nextDouble();
            promedioTotal+=estatura;
            if(estatura<1.60){
                chiquitos++;
            }
        }
        System.out.println("El promedio general de estatura es: " + (promedioTotal/estaturas));
        System.out.println(chiquitos+" persona(s) miden menos de 1.60mts");

    }
}
