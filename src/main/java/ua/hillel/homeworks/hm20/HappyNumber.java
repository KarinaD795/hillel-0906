package ua.hillel.homeworks.hm20;

public class HappyNumber {
    public static void main(String[] args) {
        int [] arr = { 1, 2, 4, 5, 6, 7, 3, 9, 8, 10 };

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == 3) {
                System.out.println("Вот счастливое число " + arr[i] + "!");
                break;
            }
        }
    }
}
