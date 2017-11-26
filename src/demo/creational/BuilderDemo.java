package demo.creational;

import patterns.creational.builder.Meal;
import patterns.creational.builder.MealBuilder;

/**
 * Created by gaurav on 26/11/17.
 */
public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.display();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.display();
    }
}
