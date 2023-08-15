package ua.hillel.homeworks.hm_16;

public abstract class Vehicle {
    private String brand;
    private String name;
    private int year;
    private int doors;

    public String getBrand() {
        return this.brand;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int getDoors() {
        return this.doors;
    }

public Vehicle(String brand, String name, int year, int doors) {
        this.brand = brand;
        this.name = name;
        this.year = year;
        this.doors = doors;
    }

    abstract void start();

    abstract void stop();
}
