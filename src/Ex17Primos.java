import javax.swing.*;

/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
public class Ex17Primos {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        boolean respuesta=esPrimo(num);
        System.out.println("El numero es primo: "+respuesta);
    }
    public static boolean esPrimo(int num){
        boolean bool=true;
        for (int i = 2; i <= (num/2); i++) {
            if(num%i==0){
                bool=false;
                break;
            }
        }
    return bool;
    }
}
