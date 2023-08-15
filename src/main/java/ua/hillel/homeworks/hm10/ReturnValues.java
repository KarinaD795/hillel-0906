package ua.hillel.homeworks.hm10;


public class ReturnValues {
    public static void main(String[] args) {
        System.out.println(defineMinValue(7, 3));
    }

    public static int defineMinValue(int firstValue, int secondValue) {
        if (firstValue < secondValue) {
            return firstValue;
        }

        return secondValue;
    }
}