import javax.swing.*;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
public class Ej10LimitePositivo {
    public static void main(String[] args) {
        int num, limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un limite positivo"));
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }while(num<limite);

    }


}
