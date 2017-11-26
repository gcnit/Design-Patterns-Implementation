package patterns.creational.abstractfactory;

/**
 * Created by gaurav on 26/11/17.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
            default:
                return null;
        }

    }
}
