import java.util.Scanner;

public class EvaluacionAlumnos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes serán evaluados? ");
        int cantidadEstudiantes = entrada.nextInt();

        float[] notas = new float[cantidadEstudiantes];
        int aprobados = 0;
        int reprobados = 0;
        float total = 0;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingresa la calificación del estudiante " + (i + 1));
            float nota = entrada.nextFloat();

            if (nota >= 0 && nota <= 100) {
                notas[i] = nota;
                total += nota;

                if (nota >= 70) {
                    aprobados++;
                } else {
                    reprobados++;
                }

            } else {
                System.out.println("¿Calificación inválida. Debe estar entre 0 y 100.");
                i--; 
            }
        }

        float promedio = total / cantidadEstudiantes;

        System.out.println("Promedio general: " + promedio);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);
    }
}
