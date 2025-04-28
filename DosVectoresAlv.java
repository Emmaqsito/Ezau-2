
import java.util.Scanner;

public class DosVectoresAlv {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float l = 0, o = 0, sum = 0, prom = 0;
        int y = 0, u = 0;
        System.out.println("Cuantos");
        int x = read.nextInt();
        String a[] = new String[x];
        float b[] = new float[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Nombre");
            read.nextLine();
            a[i] = read.nextLine();
            System.out.println("Valor");
            b[i] = read.nextFloat();
            sum += b[i];
        }
        for (int n = 0; n < x; n++) {
            if (b[n] > l) {
                l = b[n];
                y = n;
            }
        }
        o = l;
        for (int k = 0; k < x; k++) {
            if (b[k] < o) {
                o = b[k];
                u = k;
            }
        }
        prom = sum / x;
        System.out.println("Promedio: " + prom);
        System.out.println("Producto mas caro: " + a[y] + " " + b[y]);
        System.out.println("Producto mas barato: " + a[u] + " " + b[u]);

        System.out.println("¿Quieres buscar un producto? (si/no)");
        String respuesta = read.next();
        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("¿Qué producto quieres buscar?");
            read.nextLine();
            String buscar = read.nextLine();
            boolean encontrado = false;
            for (int d = 0; d < x; d++) {
                if (a[d].equalsIgnoreCase(buscar)) {
                    System.out.println("Producto encontrado: " + a[d] + " cuesta " + b[d]);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Producto no encontrado.");
            }
            System.out.println("¿Quieres buscar otro producto? (si/no)");
            respuesta = read.next();
        }
    }
}
