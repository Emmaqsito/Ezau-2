public class ArrayBidimensional {
    // se puede imaginar un arreglo bidimensional como una tabla que tiene cierto
    // numero de renglones y
    // columnas, o como un plano con una combinacion de coordenadas x,y.
    // al tratar un arreglo que tiene dos dimensiones
    // se requieren de dos indices para identificar a cada elemento dentro de el.
    // uno de los indices indica el renglon y el seguno indica la columna
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        int a = 0;
        int b = 0;
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sum = sum + matriz[i][j];
            }
            System.out.println("Fila " + i + " " + sum);
            sum = 0;
        }
    }
}
