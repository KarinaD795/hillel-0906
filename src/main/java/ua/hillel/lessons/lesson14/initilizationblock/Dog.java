package ua.hillel.lessons.lesson14.initilizationblock;

public class Dog {

    private String name;
    private String breed;
    private int age;



    public void setName(String name) {
        this.name = name;
    }


    public static String getLastName() {
        return lastName;
    }

    {
        System.out.println("Hello world");
        name = "Rex";
        breed="Putin";
        age=80;
    }

    static String lastName;
    static
        {
        System.out.println("Hello world From static block");
        lastName= "Rexovich";
    }

    public Dog() {
    }

      public Dog(String name, String breed, int age) {
        this.name=name;
        this.breed =breed;
        this.age=age;
      }

    public String getName() {
        return name;
    }

    public String getBreed(){
        return breed;

    }


    public int getAge() {
            return age;
        }
    }

