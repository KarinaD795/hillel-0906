package ua.hillel.lessons.lesson14.initilizationblock;

public class VarArgsExample {
    public static void main(String[] args) {
        String names= namesHandler("Alex ", "Kostya ", "Oleg ");
        System.out.println(names);
    }

    static String namesHandler(String ...name) {
        String str =null;
        for (String n : name) {
            str +=n.toUpperCase();
        }
        return str;

    }

    static String namesHandler (String name1, String name2, String name3) {
        return name1.toUpperCase() + name2.toUpperCase() + name3.toUpperCase();
    }
}
