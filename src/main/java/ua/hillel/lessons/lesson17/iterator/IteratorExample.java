package ua.hillel.lessons.lesson17.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        iteratorExmpl();


    }



static void iteratorExmpl() {
    List<Integer> inetgerList= new LinkedList<>();
    inetgerList.add(1);
    inetgerList.add(2);
    inetgerList.add(3);
    inetgerList.add(4);
    inetgerList.add(5);

    Iterator<Integer> integerIterator= inetgerList.iterator();
    while (integerIterator.hasNext()) {
        Integer nextInteger= integerIterator.next();
        if (nextInteger.equals(2)){
            integerIterator.remove();
        }
        System.out.println(nextInteger);
    }
    System.out.println(inetgerList);

}
}
