package ua.hillel.lessons.lesson14.initilizationblock.classes.inner.aninymous;

public class MyClass {

    public void displayMessage(Message message) {
        System.out.println(message.sayHello() +
                "это пример ананимного внутрненго класса");
    }
}
