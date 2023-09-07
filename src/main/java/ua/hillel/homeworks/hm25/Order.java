package ua.hillel.homeworks.hm25;

public abstract class Order {
    protected int price;
    protected int totalPrice;
    protected int number;

    public Order(int price) {
        this.price = price;
    }

    abstract void add();

}
