package com.niit.zoo;

import com.niit.zoo.animals.*;
import com.niit.zoo.food.Meat;
import com.niit.zoo.food.Vegetable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Михаил Чугунов on 22.09.2016.
 */
public class LionTest {

    private Animal lion;
    private String name;
    private int weight;

    @Before
    public void setUp() {
        name = "Simba";
        weight = 600;
        lion = new Lion(name, weight);
    }

    @Test
    public void testLionHasName() {
        assertEquals(name, lion.getName());
    }

    @Test
    public void testLionHasWeight() {
        assertEquals(weight, lion.getWeight(), 0.0);
    }

    @Test
    public void testLionHasVoice() {
        assertNotNull(lion.getSoundFile());
        assertEquals("lion.wav", lion.getSoundFile());
    }

    @Test
    public void testLionLosesWeightOnVegetables() {
        Vegetable food = new Vegetable(10);
        lion.eat(food);

        assertTrue(weight > lion.getWeight());
    }

    @Test
    public void testLionGainsWeightOnFreshMeat() {
        lion.eat(new Meat(100));

        assertTrue(weight < lion.getWeight());
    }

    @Test
    public void testLionLosesWeightOnTurnedMeat() {
        Meat food = new Meat(100);
        food.setFresh(false);
        lion.eat(food);

        assertTrue(weight > lion.getWeight());
    }

    @Test
    public void testLionIsCarnivore() {
        assertTrue(lion instanceof Carnivore);
    }

    @Test
    public void soundTest() throws InterruptedException {
        lion.makeSound();
        Thread.sleep(2000);
    }
}
