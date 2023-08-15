package ua.hillel.homeworks.hm16;

public class Car extends Vehicle {

    public Car(String brand, String name, int year, int doors) {
        super(brand, name, year, doors);
    }

    @Override
    void start() {
        System.out.println("Двигатель автомобиля " + this.getBrand() + " запущен. У авто " + this.getDoors() + " двери!");
    }

    @Override
    void stop() {
        System.out.println("Двигатель автомобиля " + this.getBrand() + " остановлен");
    }
}
