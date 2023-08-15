package ua.hillel.homeworks.hm9;

public class MultiplicationTable {
    public static void main(String[] args) {
        int valueMultiplier = 3;
        int resultProduct;

        for (int i=1; i<=10; i++) {
          resultProduct = Math.multiplyExact(valueMultiplier, i);
          System.out.println(valueMultiplier + "*" + i + "=" + resultProduct);
        }
    }
}
