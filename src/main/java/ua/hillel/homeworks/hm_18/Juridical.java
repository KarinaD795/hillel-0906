package ua.hillel.homeworks.hm_18;

public class Juridical extends Client {
    private final int fee = 1;

    public Juridical(double balance) {
        super(balance);
    }

    public int getFee() {
        return fee;
    }


    @Override
    void add(int amount) {
        System.out.println("Вы пополнили свой счет на " + amount + " $");

        this.balance += amount;
    }

    @Override
    void get(int amount) {
        System.out.println("Вы сняли со своего счета " + amount + " $ и ваша коммисия за снятие состоявляет " + getFee() + "%");

        this.balance -= amount + calculatePercent(amount, fee);
    }

    @Override
    void rest() {
        System.out.println("На вашем счету осталось " + getBalance() + " $");
    }

    @Override
    void about() {
        System.out.println("На вашем счету " + getBalance() + " $ и ваша коммисия за снятие " + getFee() + "%");
    }

}
