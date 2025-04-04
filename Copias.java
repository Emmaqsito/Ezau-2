
import java.util.Scanner;

public class Copias {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float a, b;
        System.out.println("Cantidad de copias");
        a = read.nextFloat();
        if (a <= 100) {
            b = (float) (a * .50);
        } else {
            if (a > 100 && a <= 200) {
                b = (float) (a * .35);
            } else {
                if (a > 200 && a <= 500) {
                    b = (float) (a * .25);
                } else {
                    b = (float) (a * .20);
                }
            }
        }
        System.out.println("Precio: " + b);
    }
}
