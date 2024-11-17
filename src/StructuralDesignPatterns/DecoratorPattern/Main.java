package StructuralDesignPatterns.DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        orderPizza(new PizzaMargherita());
        orderPizza(new PizzaHawaiian());
        orderPizza(new PizzaPepperoni());
        orderPizza(new PizzaWithExtraCheese(new PizzaPepperoni()));
    }

    public static void orderPizza(Pizza pizza) {
        System.out.println(
                "You have ordered a " + pizza.getName() + " pizza. The toppings are " + pizza.getToppings() + ".");
    }

}
