package ua.hillel.homeworks.hm16;

import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10) + 11);
            System.out.println(array[i]);
        }

        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            System.out.println(sum / array.length);
        }
    }
}


