package design_patterns_theory.Creational.builder;

import design_patterns_theory.Creational.builder.drinks.Coke;
import design_patterns_theory.Creational.builder.drinks.Pepsi;
import design_patterns_theory.Creational.builder.meals.ChickenBurger;
import design_patterns_theory.Creational.builder.meals.VegBurger;

/// Builder pattern builds a complex object using simple objects and using a step-by-step approach.
// This type of design pattern comes under creational pattern as this pattern provides
// one of the best ways to create an object.
//
//A Builder class builds the final object step by step. This builder is independent of other objects.

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
