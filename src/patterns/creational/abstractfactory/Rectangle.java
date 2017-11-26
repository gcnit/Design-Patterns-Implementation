package patterns.creational.abstractfactory;

/**
 * Created by gaurav on 26/11/17.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
