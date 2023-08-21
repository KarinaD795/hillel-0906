package ua.hillel.homeworks.hm_18;

public class Launch{
    public static void main(String[] args) {
        Client individualPerson = new Individuals();
        individualPerson.add(1000);
        individualPerson.get(10);
        individualPerson.rest();
        individualPerson.about();

        Client juridicalPerson = new Juridical();
        juridicalPerson.add(500);
        juridicalPerson.get(100);
        juridicalPerson.rest();
        juridicalPerson.about();

        Client entrepreneur = new Entrepreneurs();
        entrepreneur.add(2000);
        entrepreneur.get(10);
        entrepreneur.rest();
        entrepreneur.about();
    }
}
