package patterns.creational.abstractfactory;

/**
 * Created by gaurav on 26/11/17.
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
