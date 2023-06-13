import java.util.Arrays;
import java.util.Scanner;

public class Ex24Fibonacci {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un entero");
        int N= entrada.nextInt();
        int fibonacci[]=new int[N];
        fibo(fibonacci,N);
        System.out.println(Arrays.toString(fibonacci));
    }
    public static void fibo(int fibonacci[],int N){
        for (int i = 0; i < N; i++) {
            if(i<=1){
                fibonacci[i]=1;
            }else{
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }
        }
    }
}
