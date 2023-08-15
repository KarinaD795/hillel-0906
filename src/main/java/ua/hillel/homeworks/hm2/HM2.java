package ua.hillel.homeworks.hm2;

import java.util.Scanner;

public class HM2 {
    public static void main(String[] args) {

        Scanner numbersScanner = new Scanner(System.in);
        System.out.println("Enter any 2 numbers");
        int firstValue = numbersScanner.nextInt();
        int secondValue = numbersScanner.nextInt();
        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = nameScanner.nextLine();
        int result = firstValue + secondValue;
        System.out.println(userName + " " + result);

    }
}
