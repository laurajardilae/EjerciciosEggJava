/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
import javax.swing.*;

public class Ex03Vocal {
    public static void main(String[] args) {
        String letra;
        do{
            letra= JOptionPane.showInputDialog("Ingrese una letra").toLowerCase();
        }while(letra.length()>1);
        esVocal(letra);
    }

    public static boolean esVocal(String letra){
        boolean vocal=false;
        String vocales[]={"a","e","i","o","u"};
        for(int i=0;i<5;i++) {
            if(letra.equals(vocales[i])){
                vocal = true;
                System.out.println("La letra ingresada es una vocal");
                break;
            }
        }
        if(!vocal){
            System.out.println("La letra ingresada no es una vocal");
        }
        return vocal;
    }
}
