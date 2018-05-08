package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AdditionalIngredientsPizzaOrderDecorator  extends AbstractPizzaOrderDecorator{

    List<String>ingredients=new ArrayList<>();

    public AdditionalIngredientsPizzaOrderDecorator(PizzaOrder pizzaOrder, List<String> ingredients) {
        super(pizzaOrder);
        this.ingredients = ingredients;
    }


    public List<String> getIngredientsList(){
        for(String ingredient: ingredients){
           // System.out.print(ingredient+", ");
        }
        return ingredients;
    }

    @Override

    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(2.5*ingredients.size()));
    }
    @Override
    public String getDescription(){
        return super.getDescription()+" + "+ getIngredientsList();
    }
}
