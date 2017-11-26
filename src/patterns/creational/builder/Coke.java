package patterns.creational.builder;

/**
 * Created by gaurav on 26/11/17.
 */
public class Coke extends Drink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public float getPrice() {
        return 35;
    }
}
