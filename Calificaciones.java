import java.util.Scanner;

public class Calificaciones {
    // realiza un programa que solicite las n calificaciones de un alumno, cuente el
    // numero de aprobados y numero
    // DE REPROBADOS, ADEMAS DE SACAR EL PROMEDIO

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int z;
        System.out.println("¿Cuantos alumnos va a evaluar?");
        z = read.nextInt();
        int ap = 0, rep = 0;
        float sum = 0, cal = 0;
        int x = 1;
        float prom = 0;
        float calificaciones[] = new float[5];
        for (int i = 0; i < z; i++) {
            System.out.println("Ingresa las calificaciones del alumno " + x + " :");
            cal = read.nextFloat();
            if (cal >= 0 && cal <= 100) {
                calificaciones[i] = cal;
                sum = sum + cal;
                x = x + 1;
                if (cal >= 70) {
                    ap = ap + 1;
                } else {
                    rep = rep + 1;
                }
            } else {
                System.out.println("Ingrese un numerp valido entre 0 y 100");
                i = i - 1;
            }
        }
        prom = sum / z;
        System.out.println("Suma total: " + sum);
        System.out.println("Promedio del grupo: " + prom);
        System.out.println("Alumnos aprobados: " + ap);
        System.out.println("Alumnos reprobados:" + rep);
    }

}
