import java.util.Arrays;
import java.util.Scanner;

/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y

52
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
public class Ex21NotasEgg {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cantidadAlumnos=10;
        double promedios[]=new double[cantidadAlumnos];
        int aprobados=0, reprobados=0;
        double practico1,practico2,integrador1, integrador2;
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese la nota del primer practico del alumno "+(i+1));
            practico1= entrada.nextDouble();
            System.out.println("Ingrese la nota del segundo practico del alumno "+(i+1));
            practico2= entrada.nextDouble();
            System.out.println("Ingrese la nota del primer integrador del alumno "+(i+1));
            integrador1= entrada.nextDouble();
            System.out.println("Ingrese la nota del segundo integrador del alumno "+(i+1));
            integrador2= entrada.nextDouble();
            promedios[i]=(practico1*0.1)+(practico2*0.15)+(integrador1*0.25)+(integrador2*0.5);
            if(promedios[i]>=7){
                aprobados++;
            }else if(promedios[i]<7){
                reprobados++;
            }
        }
        System.out.println(Arrays.toString(promedios));
        System.out.printf("Aprobados: %d\nReprobados: %d",aprobados,reprobados);
    }
}
