public class ArrayBidimensionalOperaciones {
    // la suma de dos arreglos bidimensionales se realiza sumando cada elemento del
    // recorrido de la primera matriz
    // con cada elemento de la segunda

    public static void main(String[] args) {
        System.out.println("Polo homosexual");
        int[][] a = {
                { 1, 2 }, { 3, 4 }
        };
        int[][] b = {
                { 5, 6 }, { 7, 8 }
        };
        int sumaF = 0, sumaC = 0;
        int[][] z = new int[2][2];
        int[][] x = new int[2][2];
        for (int i = 0; i < x.length; i++) {
            System.out.println("");
            for (int y = 0; y < x.length; y++) {
                x[i][y] = a[i][y] + b[i][y];
                System.out.print(x[i][y] + " ");
            }
        }
        System.out.println("");
        for (int m = 0; m < x.length; m++) {
            System.out.println("");
            for (int p = 0; p < x.length; p++) {
                z[m][p] = b[m][p] - a[m][p];
                System.out.print(z[m][p] + " ");
            }
        }

    }
}
