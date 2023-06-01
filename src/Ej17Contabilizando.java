/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ej17Contabilizando {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = entrada.nextInt();
        int vector[] = new int[N];
        for(int i=0;i<N;i++){
            vector[i]=(int)(Math.random()*100000);
        }
        System.out.println(Arrays.toString(vector));
        int und=0,dosd=0,tresd=0,cuatrod=0,cincod=0;
        for(int i=0;i<N;i++){
            if (vector[i]>=0&&vector[i]<=9){
                und++;
            }else if (vector[i]>=10&&vector[i]<=99) {
                dosd++;
            }else if (vector[i]>=100&&vector[i]<=999) {
                tresd++;
            }else if (vector[i]>=1000&&vector[i]<=9999) {
                cuatrod++;
            }else if (vector[i]>=10000&&vector[i]<=99999) {
                cincod++;
            }
        }
        System.out.println("1 dígito: " + und);
        System.out.println("2 dígitos: " + dosd);
        System.out.println("3 dígitos: " + tresd);
        System.out.println("4 dígitos: " + cuatrod);
        System.out.println("5 dígitos: " + cincod);

    }
}
