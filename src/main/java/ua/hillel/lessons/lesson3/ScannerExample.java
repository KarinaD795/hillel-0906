package ua.hillel.lessons.lesson3;

import ua.hillel.lessons.lesson1.MyFirstClass;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        method1();


    }
    public static void method3(){
        System.out.println("Enter your phrase");
        Scanner scanner= new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println("You enter phrase " + phrase);


    }

        public static void method2() {
            System.out.println("Enter any two digit");
            Scanner scanner = new Scanner(System.in);
            int numberIn1 = scanner.nextInt();
            int numberIn2 = scanner.nextInt();
            int result = numberIn1+ numberIn2;
            System.out.println(result);

        }


        public static void method1() {
            System.out.println("Enter any digit from 1 to 18");
            Scanner scanner = new Scanner(System.in);
            int numberIn = scanner.nextInt();
            int result = numberIn+100;
            System.out.println("Your enter " + numberIn);
            System.out.println("Result " + result);

        }



    }

