package emma;

import java.util.Scanner;

public class Principal_Matematicas {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame un número: ");
        double valor_1 = leer.nextDouble();

        System.out.print("Dame otro número: ");
        double valor_2 = leer.nextDouble();

        Aritmetica operacion = new Aritmetica("Creando un objeto", valor_1, valor_2);

        operacion.multiplicar();
        operacion.dividir();

        double suma_1 = Aritmetica.sumar(valor_1, valor_2);
        System.out.println("Suma = " + suma_1);
    }
}
