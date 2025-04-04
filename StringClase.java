
import java.util.Scanner;

public class StringClase {//realiza un programa que solite el nombre de un cliente, el tipo de cliente y el monto compradp

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name, clientTipe;
        String oro = "Oro";
        String platino = "Platino";
        String bronce = "Bronce";
        float price, finalprice = 0, discount = 0;

        System.out.println("Nombre del cliente: ");
        name = read.nextLine();

        System.out.println("Tipo de cliente: ");
        clientTipe = read.nextLine();

        System.out.println("Monto de compra: ");
        price = read.nextFloat();

        if (clientTipe.equalsIgnoreCase(oro)) {
            System.out.println("Tipo de cliente: Oro");
            discount = (float) (price * .10);
            finalprice = (float) (price - discount);
            
        } else {
            if (clientTipe.equalsIgnoreCase(platino)) {
                System.out.println("Tipo de cliente: Platino");
                discount = (float) (price * .20);
                finalprice = (float) (price - discount);
            } else {
                if (clientTipe.equalsIgnoreCase(bronce)) {
                    System.out.println("Tipo de cliente: Bronce");
                    discount = (float) (price * .30);
                    finalprice = (float) (price - discount);
                } else {
                    System.out.println("Tipo de cliente no identificado");
                }
            }
        }
        System.out.println("Nombre del cliente: " + name);
        System.out.println("Descuento:" + discount);
        System.out.println("Precio final:" + finalprice);
    }
}

