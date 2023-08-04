package ua.hillel.homeworks.hm4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        showEnteredNumber();
    }

    public static void showEnteredNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1, 2 or 3");
        int value = scanner.nextInt();

        if (value == 1 || value == 2 || value == 3) {
            System.out.println("You entered the number " + value );
        } else {
            System.out.println("You entered the number not equal to 1,2 or 3");
        }
    }
}
