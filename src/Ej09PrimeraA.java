/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */

import javax.swing.*;

public class Ej09PrimeraA {
    public static void main(String[] args) {
        String frase = (JOptionPane.showInputDialog("Ingresa una frase")).toLowerCase();
        boolean respuesta=letraA(frase);
        if(respuesta==true){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    public static boolean letraA(String frase){
        boolean retorno = frase.substring(0,1).equals("a");
        return retorno;
    }
}
