import java.util.Scanner;

class Calculadora {
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }
}

class VistaConsola {
    private Scanner scanner = new Scanner(System.in);

    public double leerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public int leerOpcion() {
        System.out.println("\nSelecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    public void mostrarResultado(String operacion, double resultado) {
        System.out.println("Resultado de la " + operacion + ": " + resultado);
    }

}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        VistaConsola vista = new VistaConsola();

        double num1 = vista.leerNumero("Ingresa el primer número: ");
        double num2 = vista.leerNumero("Ingresa el segundo número: ");
        int opcion = vista.leerOpcion();
            switch (opcion) {
                case 1:
                    vista.mostrarResultado("suma", calc.sumar(num1, num2));
                    break;
                case 2:
                    vista.mostrarResultado("resta", calc.restar(num1, num2));
                    break;
                case 3:
                    vista.mostrarResultado("multiplicación", calc.multiplicar(num1, num2));
                    break;
                case 4:
                    vista.mostrarResultado("división", calc.dividir(num1, num2));
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 4.");
                    break;
            }
        
        }
    }

