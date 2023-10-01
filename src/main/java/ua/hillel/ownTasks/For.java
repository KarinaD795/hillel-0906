package ua.hillel.ownTasks;

public class For {
    public static void main(String[] args) {
        forEachExampleWithArray();
    }
    public static void forEachExampleWithArray() {
        int[] arr = {2, 4, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
