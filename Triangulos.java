import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, suma;
        
        System.out.print("Ingrese el primer número: ");
        a = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        b = scanner.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        c = scanner.nextDouble();
        
        double sum = a + b;
        
        if (c >= sum) {
            System.out.println("No es triangulo");
        } else {
            double z = c * c;
            suma = a * a + b * b;
            
            if (z == suma) {
                System.out.println("Triangulo rectangulo");
            } else if (z > suma) {
                System.out.println("Triangulo obtusangulo");
            } else {
                System.out.println("Triangulo acutangulo");
            }
        }
        
        scanner.close();
    }
}