/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
public class Ex12ContadorE {

    public static void main(String[] args) {
        String dig1,dig2,dig3;
        String numCadena="";
        for(int i=0;i<1000;i++){
            dig1=Integer.toString(i/100);
            dig2=Integer.toString(i%100/10);
            dig3=Integer.toString(i%10);
            if(dig3.equals("3")){
                dig3="E";
            }
            if(dig2.equals("3")){
                dig2="E";
            }
            if(dig1.equals("3")){
                dig1="E";
            }
            System.out.format("%s - %s - %s\n",dig1,dig2,dig3);

        }
    }
}
