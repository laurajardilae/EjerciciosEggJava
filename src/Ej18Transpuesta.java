import java.util.Arrays;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ej18Transpuesta {
    public static void main(String[] args) {
        int matrix[][]=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=(int)(Math.random()*(10-(-10)))-10; //random me entrega un double que debo convertir en int
            }
        }
        System.out.println("La matriz es: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("La matriz transpuesta es: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println("");
        }
    }

}
