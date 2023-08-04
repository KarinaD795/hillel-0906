package ua.hillel.lessons.lesson5.methods;

public class NewMethoswithParam {
    public static void main(String[] args) {
       sum(5,10);
       sayName("Kolya", "Alex");
       sayNameAndAge("Alex", 35);


    }

    public  static void sayNameAndAge (String name1, int age ){
        if (age==33) {
            System.out.println(name1 + " " + age);
        } else {
            System.out.println("No");
        }

    }

    public  static void sayName(String name1, String name2) {
        System.out.println(name1 + " " + name2);
    }

    public static int sum (int number1, int number2){
        int result = number1+ number2;
        return result;



    }
}
