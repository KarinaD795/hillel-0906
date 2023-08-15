package ua.hillel.lessons.lesson8;

public class Division {
    public static void main(String[] args) {
        divisionExample();

    }

    public static void divisionExample2(){
        int year; int twoDigit;
        year =2013;
        twoDigit = year % 10;
        System.out.println(twoDigit);

    }

    public static void divisionExample(){
//        9-4=5
//        5-4=1

        int n=9;
        int k=4;
        int m=n % k;
        System.out.println(m);
    }
}
