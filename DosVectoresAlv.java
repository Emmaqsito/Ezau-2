import java.util.Scanner;

public class DosVectoresAlv {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float l = 0;
        float o = 0;
        int y = 0, u = 0;
        System.out.println("Cuantos");
        int x = read.nextInt();
        read.nextLine();
        String a[] = new String[x];
        float b[] = new float[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Nombre");
            a[i] = read.nextLine();
            System.out.println("Valor");
            b[i] = read.nextFloat();
        }
        for (int n = 0; n < x; n++) {
            if (b[n] > l) {
                l = b[n];
                y = n;
            }
        }
        for (int k = 0; k < x; k++) {
            if (b[k] < o) {
                o = b[k];
                u = k;
            }
        }
        System.out.println("Grande" + b[y]);
        System.out.println("Chico" + b[u]);
    }
}
