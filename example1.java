//los metodos son bloques de codigo que realizan una tarea en especifico, con la caracteristica que son reutilizables
//los metodos se clasifican  dacuerdo a los siguientes criterios
//metodo que no devuelve valor
public class example1 {
    public static void metodoSinRetorno() {
        System.out.println("Este es un método que no devuelve valor.");
    }

    public static void main(String[] args) {
        metodoSinRetorno();
        int resultado = metodoConRetorno();
        System.out.println("El resultado del método con retorno es: " + resultado);
        metodoConParametros(5, 10);
        metodoConParametrosYSinRetorno(5, 5);
    }

    // metodo que devuelve valor
    public static int metodoConRetorno() {
        System.out.println("Este es un método que devuelve valor.");
        return 42;
    }

    // metodos con parametros pero sin valor de retorno de valor
    public static void metodoConParametros(int a, int b) {
        System.out.println("Suma de " + a + " y " + b + " es: " + (a + b));
    }
    // metodos con parametros y sin valor de retorno

    public static void metodoConParametrosYSinRetorno(int a, int b) {
        System.out.println("Multiplicación de " + a + " y " + b + " es: " + (a * b));
    }

}
// tarea: matematicas basicas, estadisticas y financieras, organizar el codigo
// creando clases independientes
// cada una con sus propios metodos, y que el sistema permita al usuario elegir
// que tipo de operacion desea
// basicas: a y b, operaciones estadisticas:5 numeros: promedio, mediana,moda