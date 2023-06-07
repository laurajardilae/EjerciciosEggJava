import java.util.Arrays;

public class Ex12Repeticion {
    public static void main(String[] args) {
        String[]vector=new String[3];
        for(int i=0;i<1000;i++){
            vector[0]=Integer.toString(i/100);
            vector[1]=Integer.toString(i%100/10);
            vector[2]=Integer.toString(i%10);
            for(int j=0;j<3;j++) {
                if (vector[j].equals("3")) {
                    vector[j] = "E";
                }
            }
            System.out.format("%s - %s - %s\n",vector[0],vector[1],vector[2]);
        }
    }

}
