package ua.hillel.homeworks.hm_18;

public class Launch{
    public static void main(String[] args) {
        Client individualPerson = new Individuals(50);
        individualPerson.add(1000);
        individualPerson.get(10);
        individualPerson.rest();
        individualPerson.about();

        Client juridicalPerson = new Juridical(10);
        juridicalPerson.add(500);
        juridicalPerson.get(100);
        juridicalPerson.rest();
        juridicalPerson.about();

        Client entrepreneur = new Entrepreneurs(200);
        entrepreneur.add(2000);
        entrepreneur.get(10);
        entrepreneur.rest();
        entrepreneur.about();
    }
}
