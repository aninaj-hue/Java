package tema1_17;

import tema1_14.GeneratorIntRandom;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[47];
        for (int i = 0; i < array.length; i++) {
            array[i] = GeneratorIntRandom.generare();
        }
        afisare(array);
        Arrays.sort(array);
        afisare(array);
    }

    public static void afisare(int[] array) {
        System.out.println("");
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

}