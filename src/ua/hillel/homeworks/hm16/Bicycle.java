package ua.hillel.homeworks.hm16;

public class Bicycle extends Vehicle {
    public Bicycle(String brand, String name, int year, int pedals) {
        super(brand, name, year, pedals);
    }

    @Override
    void start() {
        System.out.println("Поездка на велосипеде " + this.getBrand() + " началась. У велосипеда " + this.getDoors() + " педали");
    }

    @Override
    void stop() {
        System.out.println("Поездка на велосипеде " + this.getBrand() + " завершена.");
    }
}
