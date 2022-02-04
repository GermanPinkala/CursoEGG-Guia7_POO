package tp7eje10;

import java.util.Arrays;

public class Tp7eje10 {

    public static void main(String[] args) {

        int tamArrayA = 50;
        int tamArrayB = 20;

        double[] arregloA = new double[tamArrayA];
        double[] arregloB = new double[tamArrayB];

        double numAleatorio;
        
        System.out.print("Números sin ordenar array A: ");

        for (int i = 0; i < tamArrayA; i++) {
            arregloA[i] = Math.random() * 101;
            System.out.printf("%.2f - ", arregloA[i]);
        }

        System.out.println("");
        Arrays.sort(arregloA);

        for (int i = 0; i < tamArrayB; i++) {

            if (i < 10) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = 0.5;
            }

        }

        System.out.print("Números arreglo A: ");

        for (int i = 0; i < tamArrayA; i++) {

            System.out.printf("%.2f - ", arregloA[i]);

        }
        System.out.println("");
        System.out.print("Números arreglo B: ");

        for (int i = 0; i < tamArrayB; i++) {

            System.out.printf("%.2f - ", arregloB[i]);

        }
        System.out.println("");

    }

    
}
