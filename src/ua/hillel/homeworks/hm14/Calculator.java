package ua.hillel.homeworks.hm14;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation= getOperation();
        int answer= calc(num1,num2, operation);
        System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + answer);
    }


    public static int getInt() {
        System.out.println("Enter number:");
        return scanner.nextInt();
    }

    public static char getOperation(){
        System.out.println("Enter operation:");
        return scanner.next().charAt(0);
    }

    public static int calc (int num1, int num2, char operation) {
         int answer;

         switch (operation) {
             case '+': answer = num1 + num2;
                break;
             case '-': answer = num1 - num2;
                break;
             case '*': answer = num1 * num2;
                break;
             case '/': answer = num1 / num2;
                break;
             default:
                 answer = calc(num1, num2, getOperation());
            }
            return answer;
         }
    }


