package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testAdditionalIngredientsPizzaOrderGetCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        List<String> ingredients = new ArrayList<>();
        ingredients.add("onion");
        ingredients.add("mushrooms");
        ingredients.add("ham");
        pizzaOrder = new AdditionalIngredientsPizzaOrderDecorator(pizzaOrder, ingredients);

        //when
        BigDecimal calculateCost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal(22.5), calculateCost);

    }

    @Test
    public void testAdditionalIngredientsPizzaOrdergetDescription() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        List<String> ingredients = new ArrayList<>();
        ingredients.add("onion");
        ingredients.add("mushrooms");
        ingredients.add("ham");
        pizzaOrder = new AdditionalIngredientsPizzaOrderDecorator(pizzaOrder, ingredients);
        System.out.println(pizzaOrder.getDescription());

        //when
        String description=pizzaOrder.getDescription();
        //then
        assertEquals("Ingredients: cheese, tomato souse +[onion, mushrooms, ham]", description.toString());
    }


    @Test
    public void testCheeseWithAdditionalIngredientsPizzaOrderGetCost() {

        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheesePizzaOrderDecoration(pizzaOrder);
        List<String> ingredients = new ArrayList<>();
        ingredients.add("onion");
        ingredients.add("mushrooms");
        ingredients.add("ham");
        pizzaOrder = new AdditionalIngredientsPizzaOrderDecorator(pizzaOrder, ingredients);

        //when
        BigDecimal calculateCost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal(25.5), calculateCost);
    }

    @Test
    public void testCheeseWithAdditionalIngredientsPizzaOrderGetDescription() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder =new CheesePizzaOrderDecoration(pizzaOrder);
        List<String> ingredients = new ArrayList<>();
        ingredients.add("onion");
        ingredients.add("mushrooms");
        ingredients.add("ham");
        pizzaOrder = new AdditionalIngredientsPizzaOrderDecorator(pizzaOrder, ingredients);
        System.out.println(pizzaOrder.getDescription());

        //when
        String description=pizzaOrder.getDescription();
        //then
        assertEquals("Ingredients: cheese, tomato souse + extra cheese + [onion, mushrooms, ham]", description.toString());
    }
}
