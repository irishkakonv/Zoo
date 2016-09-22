package com.niit.zoo;

import com.niit.zoo.animals.Animal;
import com.niit.zoo.animals.Herbivore;
import com.niit.zoo.animals.Horse;
import com.niit.zoo.food.Meat;
import com.niit.zoo.food.Vegetable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Михаил Чугунов on 22.09.2016.
 */
public class HorseTest {

    private Animal horse;
    private String name;
    private int weight;

    @Before
    public void setUp() {
        name = "Bucephalus";
        weight = 500;
        horse = new Horse(name, weight);
    }

    @Test
    public void testHorseHasName() {
        assertEquals(name, horse.getName());
    }

    @Test
    public void testHorseHasWeight() {
        assertEquals(weight, horse.getWeight(), 0.0);
    }

    @Test
    public void testHorseHasVoice() {
        assertNotNull(horse.getSoundFile());
        assertEquals("horse.wav", horse.getSoundFile());
    }

    @Test
    public void testHorseGainsWeightOnFreshVegetables() {
        horse.eat(new Vegetable(10));

        assertTrue(weight < horse.getWeight());
    }

    @Test
    public void testHorseLosesWeightOnTurnedVegetables() {
        Vegetable food = new Vegetable(10);
        food.setFresh(false);
        horse.eat(food);

        assertTrue(weight > horse.getWeight());
    }

    @Test
    public void testHorseLosesWeightOnMeat() {
        horse.eat(new Meat(100));

        assertTrue(weight > horse.getWeight());
    }

    @Test
    public void testHorseIsHerbivore() {
        assertTrue(horse instanceof Herbivore);
    }

    @Test
    public void soundTest() throws InterruptedException {
        horse.makeSound();
        Thread.sleep(2000);
    }

}
