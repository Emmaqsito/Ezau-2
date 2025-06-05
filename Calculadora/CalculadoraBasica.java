package Calculadora;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Número 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nSelecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: División entre cero.");
                    return;
                }
                resultado = num1 / num2;
                System.out.println("Resultado de la división: " + resultado);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}

