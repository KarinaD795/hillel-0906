package ua.hillel.homeworks.hm19;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6};
        int addedNumber = 7;

        arr = pushToArray(arr, addedNumber);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] pushToArray (int[] array, int addedNumber) {
        int newArray[] = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            newArray[array.length] = addedNumber;
        }

        return newArray;
    }
}
