package ua.hillel.lessons.lesson1;

public class PostPrefix {
    public static void main(String[] args) {
        int n = 2;
        int a = 2 * n++;
        System.out.println(a);

        int k = 2;
        int b = 2 * ++k;
        System.out.println(b);


    }
}
