package ua.hillel.lessons.lesson14.initilizationblock.classes.inner;

public class Outer {

    int num;
     void showInner(){
         InnerDemo innerDemo = new InnerDemo();
         innerDemo.print();
     }

    private class InnerDemo{
        public void print(){
            System.out.println("Єто внутреній класс");
        }
    }
}
