package matematicas;

public class Aritmetica {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }
}

