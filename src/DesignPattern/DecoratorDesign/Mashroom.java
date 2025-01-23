package DesignPattern.DecoratorDesign;

public class Mashroom extends Topping{

    BasePizza basePizza;

    public Mashroom(BasePizza Pizza) {
        this.basePizza = Pizza;
    }


    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return basePizza.cost() + 40;
    }

}
