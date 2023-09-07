package ua.hillel.homeworks.hm25;

public enum IngredientsPriceEnum {
    SAUCE (10),
    CHEESE (20),
    CUTLET (30);

    IngredientsPriceEnum(int price) {
        this.price = price;
    }

   int getPrice() {
        return price;
    }

    int price;
}
