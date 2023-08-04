package ua.hillel.lessons.lesson8.oop.polimorfizm;

public class PolimorfizmExample {
    public static void main(String[] args) {
//        System.out.println(add());
        System.out.println(add(5,9));
        System.out.println(add("6", "b"));


    }

    public static int add (int a, int b) {
        return a+b;
    }
    public static String add(String a, String b){
        return a+b;
    }

}
