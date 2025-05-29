package matematicas;

import java.util.Scanner;

public class PrincipalMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame un número: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Dame otro número: ");
        double valor2 = scanner.nextDouble();

        double suma = Aritmetica.sumar(valor1, valor2);
        double multiplicacion = Aritmetica.multiplicar(valor1, valor2);
        double division = Aritmetica.dividir(valor1, valor2);

        System.out.println("Suma = " + suma);
        System.out.println("Multiplicación = " + multiplicacion);
        System.out.println("División = " + division);
    }
}

