package ua.hillel.homeworks.hm_18;

public abstract class Client {

    abstract void add(int amount);

    abstract void get(int amount);

    abstract void rest();

    abstract void about();

    public double calculatePercent(int amount, double fee) {
        return amount * fee / 100;
    }
}
