package ua.hillel.lessons.lesson9.oop.encapsulation.car;

import ua.hillel.lessons.lesson9.oop.encapsulation.specific.Specification;

public class Bmw extends Specification{
    public static void main(String[] args) {
        Specification specification= new Specification();
//        specification.color();
//        System.out.println(specification.fuel);

    }

    public void aboutCarProtectedExample(){
        color();
        System.out.println(fuel);
    }
}
