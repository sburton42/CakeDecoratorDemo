package cakeDecoratorDemo;

/**
 * Creates a few different cakes.
 * 
 * @author sburton
 */
public class CakeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // just a plain old cake
        Cake cake1 = new LayeredCake();
        System.out.println(cake1.getDescription() + " - $" + cake1.getCost());

        // a frosted, layered cake
        Cake cake2 = new LayeredCake(); // start with a cake
        cake2 = new Frosting(cake2); // add frosting
        System.out.println(cake2.getDescription() + " - $" + cake2.getCost());

        // another way to declare the same cake as cake2
        Cake cake2alt = new Frosting(new LayeredCake());
        System.out.println(cake2alt.getDescription() + " - $" + cake2alt.getCost());
     
        // TODO: Write code here to declared a double frosted cake with nuts!
    }
    
}
