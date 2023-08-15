package ua.hillel.lessons.lesson14.initilizationblock.classes.inner;

public class LocalMethodOuter {

    void myLocalMethod() {
        int num = 888;

        class MethodInnerClass {
            public void print() {
                System.out.println("Это внутренний класс метода " + num);
            }

        }
        MethodInnerClass methodInnerClass= new MethodInnerClass();
        methodInnerClass.print();
    }
}