package Calculadora;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Double[] numeros = new Double[5];

        System.out.println("Ingresa 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double media = calcularMedia(numeros);
        double mediana = calcularMediana(numeros);
        String moda = calcularModa(numeros);

        System.out.println("Media: " + media);
        System.out.println("Mediana: " + mediana);
        System.out.println("Moda: " + moda);
    }

    public static double calcularMedia(Double[] array) {
        double suma = 0;
        for (double num : array) {
            suma += num;
        }
        return suma / array.length;
    }

    public static double calcularMediana(Double[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static String calcularModa(Double[] array) {
        HashMap<Double, Integer> frecuencias = new HashMap<>();

        for (double num : array) {
            frecuencias.put(num, frecuencias.getOrDefault(num, 0) + 1);
        }

        int maxFrecuencia = 0;
        for (int frecuencia : frecuencias.values()) {
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
            }
        }

        StringBuilder modas = new StringBuilder();
        for (double num : frecuencias.keySet()) {
            if (frecuencias.get(num) == maxFrecuencia) {
                if (modas.length() > 0) {
                    modas.append(", ");
                }
                modas.append(num);
            }
        }

        return modas.toString();
    }
}
