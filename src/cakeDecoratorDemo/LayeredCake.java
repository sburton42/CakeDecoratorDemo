package cakeDecoratorDemo;

/**
 * This is an example of a concrete base cake.
 * @author sburton
 */
public class LayeredCake extends Cake {
    public LayeredCake() {
        description = "Layered Cake";
    }
    
    @Override
    public double getCost() {
        return 25.00;
    }
}
