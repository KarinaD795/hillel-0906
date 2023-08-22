package ua.hillel.homeworks.hm_18;

public class Individuals extends Client {
    public Individuals(double balance) {
        super(balance);
    }

    @Override
    void add(int amount) {
        System.out.println("Вы пополнили свой счет на " + amount + " $");

        this.balance += amount;
    }

    @Override
    void get(int amount) {
        System.out.println("Вы сняли со своего счета " + amount + " $");

        this.balance -= amount;
    }

    @Override
    void rest() {
        System.out.println("На вашем счету осталось " + getBalance() + " $");

    }

    @Override
    void about() {
        System.out.println("На вашем счету " + getBalance() + " и ваша коммисия за снятие 0%");
    }
}
