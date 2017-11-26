package patterns.creational.builder;

/**
 * Created by gaurav on 26/11/17.
 */
public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public float getPrice() {
        return 100;
    }
}
