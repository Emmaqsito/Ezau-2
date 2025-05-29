package Calculadora;

public class Rectangulo {

    public int calcularArea(int base, int altura) {
        return base * altura;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public int calcularArea(int lado) {
        return lado * lado;
    }

    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo();
        Rectangulo rect2 = new Rectangulo();
        Rectangulo rect3 = new Rectangulo();

        int areaEnteros = rect1.calcularArea(5, 3);
        double areaDecimales = rect2.calcularArea(2.5, 4.2);
        int areaCuadrado = rect3.calcularArea(4);

        System.out.println("Área con enteros: " + areaEnteros);
        System.out.println("Área con decimales: " + areaDecimales);
        System.out.println("Área de un cuadrado : " + areaCuadrado);
    }
}
