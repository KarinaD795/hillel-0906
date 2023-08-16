package ua.hillel.homeworks.hm_16;

public abstract class Vehicle {
    private String brand;
    private String name;
    private int year;

    public String getBrand() {
        return this.brand;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public Vehicle(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;
    }

    abstract void start();

    abstract void stop();
}
