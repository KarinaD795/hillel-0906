package ua.hillel.lessons.lesson4switchExample;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        condition();
    }

    public static void condition1 () {
        System.out.println("Enter 1, 2 ,3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        if (number==1) {
            System.out.println("You entered 1");
        } else if (number==2) {
            System.out.println("You entered 2");
        }else if (number==3) {
            System.out.println("You enered 3");
        } else{
            System.out.println("you entered another value");
        }
    }
    public static void condition () {
        System.out.println("Enter 1, 2 ,3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Ypu entered 1");
                break;
            case 2:
                System.out.println("you entered 2");
                break;
            case 3:
                System.out.println("you entered 3");
                break;
            default:
                System.out.println("you entered another value");
        }

    }
    public static void switchConditionStr () {
        System.out.println("Enter month");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();

        switch (month) {
            case "January":
                System.out.println("You entered January");
                break;
            case "Feb":
                System.out.println("You entered Feb");
                break;
            case "March" :
                System.out.println("You entered March");
                break;
            default:
                System.out.println("You entered another value");
        }

        }


}
