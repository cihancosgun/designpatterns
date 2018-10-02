/*
Builder pattern builds a complex object using simple objects and using a step by step approach. 
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
A Builder class builds the final object step by step. This builder is independent of other objects.

Oluşturucu modeli, basit nesneleri kullanarak ve adım adım yaklaşımı kullanarak karmaşık bir nesne oluşturur.
Bu desen modeli, kalıp bir nesne oluşturmanın en iyi yollarından birini sağladığı için, yaratılış deseninin altında gelir.
Bir Builder sınıfı, son nesneyi adım adım oluşturur. Bu oluşturucu diğer nesnelerden bağımsızdır.
 */
package builderpattern;

import builderpattern.meal.Meal;
import builderpattern.meal.MealBuilder;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}
