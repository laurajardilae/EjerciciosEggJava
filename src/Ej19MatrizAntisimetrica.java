/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ej19MatrizAntisimetrica {
    public static void main(String[] args) {
        int matrix[][]={{6,-2,4},{2,0,2},{-4,-2,0}};

        boolean esAntisimetrica=true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (esAntisimetrica) {
                    if (i != j) {
                        esAntisimetrica = (matrix[i][j] + matrix[j][i]) == 0;
                    }
                }
            }
        }
        System.out.println("La matriz es antisimétrica: " + esAntisimetrica);
    }
}
