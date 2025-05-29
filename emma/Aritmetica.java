package emma;

public class Aritmetica {
    public double a;
    public double b;
    public double multiplicacion;
    public double division;
    public static double suma;

    public Aritmetica(String mensaje, double x, double y) {
        System.out.println(mensaje);
        a = x;
        b = y;
        multiplicacion = 0;
        division = 0;
    }

    public void multiplicar() {
        multiplicacion = a * b;
    }

    public void dividir() {
        division = a / b;
        System.out.println("División = " + division);
    }

    public static double sumar(double n, double m) {
        suma = n + m;
        return suma;
    }
}
