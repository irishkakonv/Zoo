package com.niit.zoo.food;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Михаил Чугунов on 22.09.2016.
 */
public class FoodTest {
    @Test
    public void testNegativeNutricityIsIgnored() {
        Food food = new Meat(-12);

        assertEquals(0, food.getNutricity(), 0.0);
    }
}