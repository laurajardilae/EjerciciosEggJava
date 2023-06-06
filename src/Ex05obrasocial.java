import java.util.Locale;
import java.util.Scanner;

/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
public class Ex05obrasocial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su categoria. (A/B/C)");
        String categoria = entrada.next().toUpperCase();
        System.out.println("Ingrese el valor total del costo del tratamiento: ");
        double total= entrada.nextDouble();
        switch (categoria){
            case "A":
                total=total-(total*0.5);
                break;
            case "B":
                total=total-(total*0.35);
                break;
        }
        System.out.println("Usted debe pagar: " + total);


    }
}
