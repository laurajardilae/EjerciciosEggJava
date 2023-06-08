/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
public class Ex19CompararVectores {
    public static void main(String[] args) {
        int v1[]={0,3,2};
        int v2[]={0,1,2};
        boolean iguales=false;
        if(v1.length== v2.length){
            for (int i = 0; i < v1.length; i++) {
                if(v1[i]==v2[i]){
                    iguales=true;
                }else {
                    iguales=false;
                    break;
                }
            }
        }
        System.out.println("Los dos vectores son iguales: "+iguales);
    }

}
