package patterns.creational.builder;

/**
 * Created by gaurav on 26/11/17.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal("Veg Meal");
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal("Non Veg Meal");
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
