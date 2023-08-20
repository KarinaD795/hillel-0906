package ua.hillel.homeworks.hm_16;

public class Bicycle extends Vehicle {
    private int pedals;

    public int getPedals() {
        return this.pedals;
    }
    public Bicycle(String brand, String name, int year, int pedals) {
        super(brand, name, year);
        this.pedals = pedals;
    }

    @Override
    void start() {
        System.out.println("Поездка на велосипеде " + this.getBrand() + " началась. У велосипеда " + this.getPedals() + " педали");
    }

    @Override
    void stop() {
        System.out.println("Поездка на велосипеде " + this.getBrand() + " завершена.");
    }
}
