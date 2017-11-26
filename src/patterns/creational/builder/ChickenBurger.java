package patterns.creational.builder;

/**
 * Created by gaurav on 26/11/17.
 */
public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public float getPrice() {
        return 140;
    }
}
