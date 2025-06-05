package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Operaciones Básicas");
        System.out.println("2. Operaciones Aritméticas");
        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                CalculadoraBasica.iniciar();
                break;
            case 2:
                OperacionesAritmeticas.iniciar();
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}

