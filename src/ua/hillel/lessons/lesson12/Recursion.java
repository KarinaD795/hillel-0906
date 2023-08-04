package ua.hillel.lessons.lesson12;

public class Recursion {
    public static void main(String[] args) {
//        int a = factorial(3);
//        System.out.println(a);
//        int i= factorialRecursion(3);
//        System.out.println(i);

//        int[] a = {8, 3, 2};
//        for (int i = 1; i < 2; i++) {
//            a[0] *= a[i];
//        }
//        System.out.println(a[0]);
//    }
//}
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                case 2:
                case 4:
                    System.out.println(i + 1);
                    break;
            }
        }
    }

}



//        String text = "Maks good coder!";
//        int x = text.length();
//        switch (x) {
//            case (14):
//                System.out.println(++x * 2);
//                break;
//
//            case (16):
//                System.out.println(x++ * 2);
//                break;
//
//            default:
//                System.out.println(x);
//                break;
//        }
//    }
//}

//
//    static int factorialRecursion(int x) {
//        int result;
//        if (x<1) {
//            return 1;
//        }
//        result=factorialRecursion(x-1)*x;
//        return result;
//
//    }
//
//    public static int factorial(int x) {
//        int result = 1;
//        for (int i = 1; i <= x; i++){
//            result *= i;
//            // 1=1*1;
//            // 1=1*2;
//            // 2= 2*3;
//    }
//         return result;
//
//    }
//}

