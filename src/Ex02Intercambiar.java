/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,

49
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class Ex02Intercambiar {
    public static void main(String[] args) {
        int A,B,C,D,aux;
        A=1;
        B=2;
        C=3;
        D=4;

        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.format("A=%d\nB=%d\nC=%d\nD=%d\n",A,B,C,D);
    }

}
