import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
public class Ex04Romano {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        if(1<=num&&num<=3){
            for(int i=0;i<num;i++){
                System.out.print("l");
            }
        }else if(num==4) {
            System.out.println("lV");
        }else if(num>=5&&num<=8){
            System.out.print("V");
            for(int i=0;i<(num-5);i++){
                System.out.print("l");
            }
        }else if(num==9) {
            System.out.println("lX");
        }
        else if(num==10) {
            System.out.println("X");
        }
    }
}
