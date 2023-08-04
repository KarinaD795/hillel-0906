package ua.hillel.lessons.lesson7;

public class SplitExmpl {

    public static void main(String[] args) {
        String str = " Hello my name is Max";
        String [] words = str.split(" ");
        for(String W : words) {
            System.out.println(W);
        }
    }
}
