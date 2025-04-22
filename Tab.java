import java.util.Scanner;

public class Tab {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i = 0, n = 0, y = 0, x = 0;
        System.out.println("Valor de N: ");
        n = read.nextInt();
        System.out.println("Numero de iteraciones: ");
        x = read.nextInt();
        System.out.println("Valor inicial: ");
        i = read.nextInt();
        int z[] = new int[x];
        for (int a = 0; a < x; a++) {
            y = (i * i) + (i * 2) + 3;
            i = i + 1;
            z[a] = y;
        }
        for (int f = 0; f < x; f++) {
            System.out.println("Resultado: " + z[f]);
        }
    }
}
