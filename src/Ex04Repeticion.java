import java.util.Scanner;

public class Ex04Repeticion {
    public static void main(String[] args) {

        String conversion = "";

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero  = leer.nextInt();
        String numeroEnString = "";
        numeroEnString += numero;
        String conversionRomano = "";
        String[][] romanLetters = {{},{"","I","II","III","IV","V","VI","VII","VIII","IX"},{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},{"","M","MM","MMM"}};
        for (int i = 0; i < numeroEnString.length(); i++) {
            conversionRomano += romanLetters[numeroEnString.length()-i][Integer.parseInt(numeroEnString.substring(i, i+1))];

        }
        System.out.println("el numero es " + conversionRomano   );
    }
}
