package DesignPattern.DecoratorDesign;

public class PizzaOrder {
    public static void main(String[] args)
    {
        BasePizza mashroomPizza = new Mashroom(new ExtraCheese(new MageritaPizza()));
        System.out.println("Your pizza order cost: "+ mashroomPizza.cost());
    }
}
