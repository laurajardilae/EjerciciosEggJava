import javax.swing.*;

/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar.*/
public class Ex13Escalera {
    public static void main(String[] args) {
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura de la escalera"));
        for(int i=1;i<=altura;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
