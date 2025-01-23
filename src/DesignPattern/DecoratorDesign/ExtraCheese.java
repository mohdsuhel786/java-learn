package DesignPattern.DecoratorDesign;

public class ExtraCheese extends Topping{

    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return basePizza.cost() +20;
        
    }

}
