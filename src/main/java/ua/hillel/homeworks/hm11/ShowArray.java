package ua.hillel.homeworks.hm11;

public class ShowArray {
    public static void main(String[] args) {
        showEqualTriangle(5);
    }

    public static void showEqualTriangle(int rowsNumber) {
        for (int i = 0; i < rowsNumber; i++) {
            for (int spaceNumber = rowsNumber; spaceNumber > i; spaceNumber--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//        for (int i = 0; i < n; i++) {
//            for (int k = 0; k < n; k++) {
//                if (k>i) {
//                    System.out.print(" " + " ");
//                } else {
//                    System.out.print(" * ");
//                }
//            }
//
//
//            System.out.println();
//        }
//    }
//}