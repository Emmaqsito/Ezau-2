package Calculadora;

//pago generico padre, efectivo, tarjeta, transferencia, etc.
public class Pagos {
    class Pago {
        void procesarPago() {
            System.out.println("Procesando pago genérico");
        }
    }

    class Efectivo extends Pago {
        @Override
        void procesarPago() {
            System.out.println("Procesando pago en efectivo");
        }
    }

    class Tarjeta extends Pago {
        @Override
        void procesarPago() {
            System.out.println("Procesando pago con tarjeta");
        }
    }

    class Transferencia extends Pago {
        @Override
        void procesarPago() {
            System.out.println("Procesando pago por transferencia");
        }
    }

    public static void main(String[] args) {
        Pagos pagos = new Pagos();
        Pago pago = pagos.new Pago();
        Pago pagoEfectivo = pagos.new Efectivo();
        Pago pagoTarjeta = pagos.new Tarjeta();
        Pago pagoTransferencia = pagos.new Transferencia();

        pago.procesarPago();
        pagoEfectivo.procesarPago();
        pagoTarjeta.procesarPago();
        pagoTransferencia.procesarPago();
    }
}
