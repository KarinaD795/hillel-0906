package ua.hillel.lessons.lesson17.dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class Lifo {

    static Deque<Integer>dequeList= new LinkedList<>();

    public static void main(String[] args) {
        linkedListDequeuePush();

    }


    static void linkedListDequeuePush(){
        dequeList.push(1);
        dequeList.push(2);
        dequeList.push(3);
        dequeList.push(4);
    }
}
