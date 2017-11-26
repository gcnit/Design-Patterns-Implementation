package patterns.creational.builder;

/**
 * Created by gaurav on 26/11/17.
 */
public abstract class Burger implements FoodItem {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
