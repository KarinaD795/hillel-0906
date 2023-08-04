package ua.hillel.ForTest;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        luckyNumber(array);
    }

    public static void luckyNumber(int[] array2) {
        for (int j = 0; j < array2.length; j++) {
            if (array2[j] == 3) {
                System.out.println("Вот счастливое число!");
                break;
            }
            System.out.println(array2[j]);
        }
    }
}





