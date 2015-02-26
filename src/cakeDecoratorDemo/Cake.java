package cakeDecoratorDemo;

/**
 * This is the base abstract class, or "Component", for the example.
 * @author sburton
 */
public abstract class Cake {
    protected String description;
    
    public String getDescription() {
        return description;
    }
    
    public abstract double getCost();
}
