public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("large");
//        coke.printItem();
//
//        Item avocado = new Item("avocado","Topping", 1.50);
//        avocado.printItem();
//
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("Bacon", "cheese", "mayo");
//        burger.printItem();

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("Bacon", "cheese", "mayo");
        regularMeal.setDrinkSize("large");
        regularMeal.printItemizedList();
    }
}
