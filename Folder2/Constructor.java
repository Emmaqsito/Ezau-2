package Folder2;

import java.util.Scanner;

public class Constructor {
    private String nombre;
    private String grupo;
    private double promedio;

    public Constructor(String nombre, String grupo, double promedio) {
        this.grupo = grupo;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del alumno " + nombre);
        System.out.println("Grupo del alumno " + grupo);
        System.out.println("Promedio del alumno " + promedio);
    }

    public void verificarAprobacion() {
        if (promedio >= 6.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Nombre");
        String name = read.nextLine();
        System.out.println("Grupo");
        String group = read.nextLine();
        System.out.println("Prom");
        double prom = read.nextDouble();
        Constructor alumno1 = new Constructor(name, group, prom);
        alumno1.mostrarDatos();
        alumno1.verificarAprobacion();
    }
}
