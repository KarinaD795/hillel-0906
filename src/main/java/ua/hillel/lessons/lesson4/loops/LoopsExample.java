package ua.hillel.lessons.lesson4.loops;

public class LoopsExample {
    public static void main(String[] args) {
       forEachExampleWithArray2();
    }

    //    public  static void doWhileExample(){
//        int i= 1;
//        do  {
//            i++;
//            System.out.println(i +" ");
//
//        }while (i<4);
//
//    }
//    public  static void whileExample2(){
//        int i= 100;
//        while (1 <=8) {
//            System.out.println(" J,hfnysq jnxctn+" ");
//                    i= i-10;
//
//        }
//
//    }
    public static void forExample2() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Maks" + " " + i);
        }


    }

    public static void forExample() {
        for (int i = 3; i >= 3; i--) {
            System.out.println(i);
        }
    }

    public static void forExampleWithArray() {
        int[] arr = {2, 4, 6};
        for (int i : arr) {
            System.out.println(i);
        }


    }

    public static void forEachExampleWithArray() {
        int[] arr = {2, 4, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void forEachExampleWithArray2() {
        String[] arrStr = {"Alex", "Igor","Kostya"};
        for (String names : arrStr) {
            System.out.println(names+ " Petrov");
        }
    }
}


