package ua.hillel.homeworks.hm3;

import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) {
        checkEnteredNumber();
    }

    public static void checkEnteredNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int value = scanner.nextInt();

        if (value == 1) {
            System.out.println("You entered the number 1");
        } else {
            System.out.println("You entered the number not equal 1");
        }
    }
}
