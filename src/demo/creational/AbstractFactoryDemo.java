package demo.creational;

import patterns.creational.abstractfactory.*;

/**
 * Created by gaurav on 26/11/17.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");


        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape triangle = shapeFactory.getShape("triangle");

        circle.draw();
        rectangle.draw();
        triangle.draw();

        Color red = colorFactory.getColor("red");
        Color blue = colorFactory.getColor("blue");
        Color green = colorFactory.getColor("green");

        red.fill();
        blue.fill();
        green.fill();
    }
}
