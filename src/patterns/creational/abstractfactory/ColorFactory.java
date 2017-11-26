package patterns.creational.abstractfactory;

/**
 * Created by gaurav on 26/11/17.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        switch (color.toLowerCase()) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                return null;
        }
    }
}
