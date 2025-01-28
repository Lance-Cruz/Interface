package ie.atu.week15;

import java.util.ArrayList;

public class JustApp {
    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();

        System.out.println("Welcome to Just App");
        System.out.println("You ordered...");

        //Add some items burgers, pizzas, fries, salad....
        Burger cheeseBurger = new Burger("Cheeseburger", 14.99, "cheese");
        Pizza tuna = new Pizza("Tuna Pizza", 1.99, "why");
        Pizza peperoni = new Pizza("Peperoni Pizza", 19.99, "peperoni");
        Fries french = new Fries("French Fries", 4.99, "french");
        Dessert iceCream = new Dessert("Strawberry Ice Cream", 6.99, "Strawberries");

        //Add all the orders to a collection
        items.add(cheeseBurger);
        items.add(tuna);
        items.add(peperoni);
        items.add(french);
        items.add(iceCream);

        //Display all the orders
        for (MenuItem item : items){
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
            System.out.println();
        }

        //Find the total cost of the whole order
    }
}
