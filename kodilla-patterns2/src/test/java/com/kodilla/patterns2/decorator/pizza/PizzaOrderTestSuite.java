package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testShouldGetCostPizzaHamExtraCheeseOnion() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new HamPizzaDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new OnionPizzaDecorator(pizza);
        //When
        BigDecimal pizzaCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(23), pizzaCost);
    }

    @Test
    public void testShouldGetDescriptionPizzaHamChickenExtraCheeseExtraCheeseMushrooms() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new HamPizzaDecorator(pizza);
        pizza = new ChickenPizzaDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new MushroomsPizzaDecorator(pizza);
        //When
        String pizzaDescription = pizza.getDescription();
        System.out.println(pizzaDescription);
        //Then
        assertEquals("Dough | Tomato Sauce | Cheese\n" +
                "Ham\n" +
                "Chicken\n" +
                "Extra Cheese\n" +
                "Extra Cheese\n" +
                "Mushrooms", pizzaDescription);
    }
}
