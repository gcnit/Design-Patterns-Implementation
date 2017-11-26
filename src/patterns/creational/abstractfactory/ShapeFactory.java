package patterns.creational.abstractfactory;

/**
 * Created by gaurav on 26/11/17.
 */
public class ShapeFactory extends AbstractFactory {

    public Shape getShape(String shape) {
        switch (shape.toLowerCase()) {
            case "triangle":
                return new Triangle();
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
