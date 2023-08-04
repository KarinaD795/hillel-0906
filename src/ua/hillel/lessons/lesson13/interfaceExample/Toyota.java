package ua.hillel.lessons.lesson13.interfaceExample;

public class Toyota implements Car{
    @Override
    public void passengerPlaces() {
        System.out.println("4 places_");

    }

    @Override
    public void pricePerKilometr() {
        System.out.println("price per kilometr -10$_");

    }

    @Override
    public void getPassenger() {
        System.out.println("get passenger_");

    }

    @Override
    public void passengerPay() {
        System.out.println();

    }
}
