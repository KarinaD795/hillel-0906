package ua.hillel.lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FifoPriority {

    static Queue<Integer> integerPriorityQueueQueue= new PriorityQueue<>();

    public static void main(String[] args) {
        linkedListQueueAdd();
        linkedListQueueIsEmpty();
    }

    static void linkedListQueueIsEmpty() {
        while (!integerPriorityQueueQueue.isEmpty()){
            System.out.println(integerPriorityQueueQueue.poll()+ "");
        }
    }

    static void linkedListQueueAdd(){
        integerPriorityQueueQueue.add(3);
        integerPriorityQueueQueue.add(2);
        integerPriorityQueueQueue.add(1);
    }
}
