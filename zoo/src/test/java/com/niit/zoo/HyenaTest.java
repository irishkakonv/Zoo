package com.niit.zoo;

import com.niit.zoo.animals.Animal;
import com.niit.zoo.animals.Hyena;
import com.niit.zoo.animals.Omnivore;
import com.niit.zoo.food.Meat;
import com.niit.zoo.food.Vegetable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Михаил Чугунов on 22.09.2016.
 */
public class HyenaTest {

    private Animal hyena;
    private String name;
    private int weight;

    @Before
    public void setUp() {
        name = "Jinja";
        weight = 65;
        hyena = new Hyena(name, weight);
    }

    @Test
    public void testHyenaHasName() {
        assertEquals(name, hyena.getName());
    }

    @Test
    public void testHyenaHasWeight() {
        assertEquals(weight, hyena.getWeight(), 0.0);
    }

    @Test
    public void testHyenaHasVoice() {
        assertNotNull(hyena.getSoundFile());
        assertEquals("hyena.wav", hyena.getSoundFile());
    }

    @Test
    public void testHyenaGainsWeightOnFreshVegetables() {
        hyena.eat(new Vegetable(10));

        assertTrue(weight < hyena.getWeight());
    }

    @Test
    public void testHyenaLosesWeightOnTurnedVegetables() {
        Vegetable food = new Vegetable(10);
        food.setFresh(false);
        hyena.eat(food);

        assertTrue(weight > hyena.getWeight());
    }

    @Test
    public void testHyenaGainsWeightOnFreshMeat() {
        hyena.eat(new Meat(100));

        assertTrue(weight < hyena.getWeight());
    }

    @Test
    public void testHyenaLosesWeightOnTurnedMeat() {
        Meat food = new Meat(100);
        food.setFresh(false);
        hyena.eat(food);

        assertTrue(weight > hyena.getWeight());
    }

    @Test
    public void testHyenaIsOmnivore() {
        assertTrue(hyena instanceof Omnivore);
    }

    @Test
    public void soundTest() throws InterruptedException {
        hyena.makeSound();
        Thread.sleep(5000);
    }
}
