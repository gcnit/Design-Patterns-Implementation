package patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaurav on 26/11/17.
 */
public class Meal {
    String mealName;
    private List<FoodItem> foodItems = new ArrayList<>();

    Meal(String mealName) {
        this.mealName = mealName;
    }

    public void addItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public float getTotalCost() {
        float totalCost = 0.0f;
        for (FoodItem foodItem : foodItems) {
            totalCost += foodItem.getPrice();
        }
        return totalCost;
    }

    public void display() {
        System.out.println(mealName);
        for (FoodItem foodItem : foodItems) {
            System.out.println(foodItem.getName() + "\t" + foodItem.getPacking().getName() + "\t" + foodItem.getPrice());
        }
        System.out.println("Total Cost:\t" + getTotalCost() + "\n");
    }
}
