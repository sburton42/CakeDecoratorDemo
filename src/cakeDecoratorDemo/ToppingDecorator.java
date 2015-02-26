package cakeDecoratorDemo;

/**
 * This is the Decorator "interface", although in this case it's actually
 * a base class because we want to preserve the functionality from the
 * original base class.
 * @author sburton
 */
public abstract class ToppingDecorator extends Cake {
    // force subclasses to re-implement this
    @Override
    public abstract String getDescription();
}
