package patterns.creational.factormethod;

/**
 * Created by gaurav on 26/11/17.
 */
public class AquaticAnimal implements Animal {

    @Override
    public void move() {
        System.out.println("Swimming");
    }
}
