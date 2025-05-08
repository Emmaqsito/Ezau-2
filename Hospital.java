// el hospital general vida sana tiene reportes en 3 areas: urgencias, pediatria
// y cirujia
// los datos estan organizados en matrices que representan el numero de unidades
// consum en 3 insumos: cubrebocas, guantes y jeringas
//suma las 3 matrices para obtener la matriz total del consumo
//determinar cual de las 3 areas tuvo mas consumos
//determinar cual de las 3 areas tuvo menos
//determinar el mes en que se consumieron más insumos
public class Hospital {
    public static void main(String[] args) {
        int[][] a = {
                { 120, 300, 250 }, { 150, 320, 260 }, { 170, 310, 240 }
        };
        int[][] b = {
                { 80, 150, 100 }, { 90, 170, 120 }, { 100, 160, 110 }
        };
        int[][] c = {
                { 200, 400, 300 }, { 210, 410, 310 }, { 220, 420, 320 }
        };
        int[][] x = new int[3][3];
        int t = 0, p = 0, l = 0, k = 0, hg = 0, ha = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            if (i == 0) {
                t = t + a[0][i] + b[0][i] + c[0][i];
                ha = ha + a[1][i] + b[1][i] + c[1][i];
                hg = hg + a[2][i] + b[2][i] + c[2][i];
            } else if (i == 1) {
                t = t + a[0][i] + b[0][i] + c[0][i];
                ha = ha + a[1][i] + b[1][i] + c[1][i];
                hg = hg + a[2][i] + b[2][i] + c[2][i];
            } else {
                t = t + a[0][i] + b[0][i] + c[0][i];
                ha = ha + a[1][i] + b[1][i] + c[1][i];
                hg = hg + a[2][i] + b[2][i] + c[2][i];
            }
            for (int j = 0; j < 3; j++) {
                p++;
                p = p + a[i][j];
                l = l + b[i][j];
                k = k + c[i][j];
                x[i][j] = a[i][j] + b[i][j] + c[i][j];
                System.out.print(x[i][j] + " ");
            }

        }
        System.out.println("");
        if (t > ha && t > hg) {
            System.out.println("Mes Enero:" + t);
        } else if (ha > t && ha > hg) {
            System.out.println("mes Feb" + ha);
        } else {
            System.out.println("mes Mar" + hg);
        }
        if (t < ha && t < hg) {
            System.out.println("mes enero" + t);
        } else if (ha < t && ha < hg) {
            System.out.println("mes feb" + ha);
        } else {
            System.out.println("mes marzo" + hg);
        }
        System.out.println("Total Urgencias: " + p);
        System.out.println("Total Pediatria " + l);
        System.out.println("Total Cirugia: " + k);
    }
}