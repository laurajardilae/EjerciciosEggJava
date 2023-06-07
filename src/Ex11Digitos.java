import javax.swing.*;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
public class Ex11Digitos {
    public static void main(String[] args) {
        int numero,digitos=1;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        while(numero>=10) {
            numero/=10;
            digitos++;
        }
        System.out.format("El numero tiene %d digito(s)",digitos);
    }
}
