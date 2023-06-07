import java.util.Scanner;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
public class Ex14Familias {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int familias,hijos,edadhijo,totalhijos=0,totaledadhijos=0;
        System.out.println("Ingrese la cantidad de familias");
        familias= entrada.nextInt();
        for(int i=0;i<familias;i++){
            System.out.println("Ingrese el numero de hijos de la familia "+(i+1));
            hijos= entrada.nextInt();
            totalhijos+=hijos;
            for(int j=0;j<hijos;j++){
                System.out.println("Ingrese la edad del hijo numero "+(j+1));
                edadhijo= entrada.nextInt();
                totaledadhijos+=edadhijo;
            }
        }
        System.out.println("El promedio de edad de los hijos de todas las familias es: "+(totaledadhijos/totalhijos));
    }


}
