package ua.hillel.lessons.lesson15.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        methodAdd();
        methodGet();
        methodIndexOf();
        methodSet();
        methodRemovedByIndex();
    }

    public static List<String> myArrayList;



    public static void methodAdd(){
        List<String> myArrayList =new ArrayList<>();
        myArrayList.add("Sergey");
        myArrayList.add("Alex");
        myArrayList.add(1, "Vova");
    }

    public static void methodRemovedByIndex() {
        myArrayList.remove(1);
    }

    public static void methodSet() {
        myArrayList.set(1, "Oleg");
    }

    public static void methodIndexOf() {
        System.out.println(myArrayList.indexOf("Alex"));
        System.out.println(myArrayList.indexOf("Oleg"));
    }

    public static void methodGet(){
        String e= myArrayList.get(1);
        System.out.println(e);
    }


    public static void syntaxys(){
        List<String> myArrayList = new ArrayList<>();
        List<String>myLinkedList= new LinkedList<>();

    }

}
