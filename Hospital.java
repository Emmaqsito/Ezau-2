public class Hospital {
    public static void main(String[] args) {
        int[][] urgencias = {
                { 120, 300, 250 }, { 150, 320, 260 }, { 170, 310, 240 }
        };
        int[][] pediatria = {
                { 80, 150, 100 }, { 90, 170, 120 }, { 100, 160, 110 }
        };
        int[][] cirugia = {
                { 200, 400, 300 }, { 210, 410, 310 }, { 220, 420, 320 }
        };

        int[][] total = new int[3][3];
        int[] consumoPorArea = new int[3];
        int[] consumoPorMes = new int[3];

        for (int mes = 0; mes < 3; mes++) {
            for (int insumo = 0; insumo < 3; insumo++) {
                total[mes][insumo] = urgencias[mes][insumo] + pediatria[mes][insumo] + cirugia[mes][insumo];

                consumoPorMes[mes] += total[mes][insumo];
                consumoPorArea[0] += urgencias[mes][insumo];
                consumoPorArea[1] += pediatria[mes][insumo];
                consumoPorArea[2] += cirugia[mes][insumo];
            }
        }

        System.out.println("Suma: ");
        for (int[] fila : total) {
            for (int val : fila) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        String[] nombresAreas = { "Urgencias", "Pediatría", "Cirugía" };
        int maxArea = 0, minArea = 0;
        for (int i = 0; i < 3; i++) {
            if (consumoPorArea[i] > consumoPorArea[maxArea])
                maxArea = i;
            if (consumoPorArea[i] < consumoPorArea[minArea])
                minArea = i;
        }

        String[] nombresMeses = { "Enero", "Febrero", "Marzo" };
        int maxMes = 0;
        for (int i = 1; i < 3; i++) {
            if (consumoPorMes[i] > consumoPorMes[maxMes])
                maxMes = i;
        }

        System.out.println("\nConsumo total por área:");
        for (int i = 0; i < 3; i++) {
            System.out.println(nombresAreas[i] + ": " + consumoPorArea[i]);
        }

        System.out.println("\nÁrea con más consumo: " + nombresAreas[maxArea]);
        System.out.println("Área con menos consumo: " + nombresAreas[minArea]);
        System.out.println("Mes con más consumo: " + nombresMeses[maxMes] + " " + consumoPorMes[maxMes]);
    }
}
