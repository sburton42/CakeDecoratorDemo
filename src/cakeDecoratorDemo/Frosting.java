package cakeDecoratorDemo;

/**
 * This is an example of a decorator class. It wraps another kind of cake.
 * @author sburton
 */
public class Frosting extends ToppingDecorator {
    private Cake cake;
    
    public Frosting(Cake cake) {
        this.cake = cake;
    }
    
    @Override
    public String getDescription() {
        return cake.getDescription() + ", Frosted";
    }
    
    @Override
    public double getCost() {
        return 5.00 + cake.getCost();
    }
}
