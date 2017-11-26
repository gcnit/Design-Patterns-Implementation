package demo.creational;

import patterns.creational.factormethod.Animal;
import patterns.creational.factormethod.AnimalFactory;

/**
 * Created by gaurav on 26/11/17.
 */
public class FactorMethodDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimal("terrestrial");
        Animal animal2 = animalFactory.getAnimal("aquatic");
        Animal animal3 = animalFactory.getAnimal("ariel");

        animal1.move();
        animal2.move();
        animal3.move();
    }
}
