package ua.hillel.homeworks.hm25;

import java.util.Arrays;
import java.util.Scanner;


public class Burger extends Order {
    public Burger(int initBurgerPrice) {
        super(initBurgerPrice);
    }

    @Override
    void add() {
        String order;
        String stop;

        System.out.println("Please choose your ingredients");
        this.showIngredients();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter any ingredient");
            order = scanner.next();
            System.out.println("Please enter count");
            number = scanner.nextInt();

            System.out.println("Anything else ? - Yes/No");
            stop = scanner.next();
        } while ("Yes".equalsIgnoreCase(stop));

        selectIngredients(order);
    }

    private void selectIngredients(String order) {
        IngredientsPriceEnum ingredients = IngredientsPriceEnum.valueOf(order);

        switch (ingredients){
            case SAUCE :
                IngredientsPriceEnum.valueOf("SAUCE").equals(IngredientsPriceEnum.SAUCE);
                totalPrice = number * IngredientsPriceEnum.SAUCE.getPrice();
                System.out.println(number + " " + IngredientsPriceEnum.SAUCE + " With price " + IngredientsPriceEnum.SAUCE.getPrice());
                System.out.println("Total Price : " + (totalPrice + price));
                break;
            case CHEESE:
                IngredientsPriceEnum.valueOf("CHEESE").equals(IngredientsPriceEnum.CHEESE);
                totalPrice = number * IngredientsPriceEnum.CHEESE.getPrice();
                System.out.println(number + " " + IngredientsPriceEnum.CHEESE + " With price " + IngredientsPriceEnum.CHEESE.getPrice());
                System.out.println("Total Price : " + (totalPrice + price));
                break;
            case CUTLET:
                IngredientsPriceEnum.valueOf("CUTLET").equals(IngredientsPriceEnum.CUTLET);
                totalPrice = number * IngredientsPriceEnum.CUTLET.getPrice();
                System.out.println(number + " " + IngredientsPriceEnum.CUTLET + " With price " + IngredientsPriceEnum.CUTLET.getPrice());
                System.out.println("Total Price : " + (totalPrice + price));
                break;
            default:
                System.out.println("Incorrect order");
                break;
        }
    }

    private void showIngredients() {
        System.out.println(Arrays.toString(IngredientsPriceEnum.values()));
    }

}

