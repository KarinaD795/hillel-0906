package ua.hillel.homeworks.hm_16;

public class Car extends Vehicle {
    private int doors;

    private int getDoors() {
        return this.doors;
    }

    public Car(String brand, String name, int year, int doors) {
        super(brand, name, year);
        this.doors = doors;
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
