package ua.hillel.lessons.lesson9.oop.polimorfizm.overload;

public class Dog extends Animal {
    public void aboutDog(){
        sayAnimalName("Dog");
    }

    public void sound(){
        System.out.println("Animal voice");
    }
}
