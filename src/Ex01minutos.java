/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */

import javax.swing.*;

public class Ex01minutos {
    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los minutos"));
        calcular(min);

    }
    public static void calcular(int min){
        int dias,horas;
        dias=1600/1440;
        horas=(1600%1440)/60;
        System.out.format("%d equivale a %d días y %d horas",min,dias,horas);
    }
}
