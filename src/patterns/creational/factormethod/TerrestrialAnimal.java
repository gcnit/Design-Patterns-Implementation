package patterns.creational.factormethod;

/**
 * Created by gaurav on 26/11/17.
 */
public class TerrestrialAnimal implements Animal {

    @Override
    public void move() {
        System.out.println("Walking");
    }
}
