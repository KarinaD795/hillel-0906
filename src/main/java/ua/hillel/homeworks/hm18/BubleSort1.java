package ua.hillel.homeworks.hm18;

import java.util.Arrays;

public class BubleSort1 {
    public static void main(String[] args) {
        String [] arr = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 1) {
                arr[i] = "Y";
            }
        }
        System.out.println(Arrays.toString(arr));
            }

    }

