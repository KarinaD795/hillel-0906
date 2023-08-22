package ua.hillel.homeworks.hm_18;

public class Entrepreneurs extends Client {
    private double fee;

    public Entrepreneurs(double balance) {
        super(balance);
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    void add(int amount) {
        System.out.println("Вы пополнили свой счет на " + amount + " $");

        if (amount >= 1000) {
            setFee(0.5);
        } else {
            setFee(1);
        }

        this.balance += amount - calculatePercent(amount, fee);
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
        System.out.println("На вашем счету " + getBalance() + " и ваша коммисия за пополнение " + getFee() + "%");
    }
}
