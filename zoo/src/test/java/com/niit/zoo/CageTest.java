package com.niit.zoo;

import com.niit.zoo.animals.Cage;
import com.niit.zoo.animals.Hyena;
import com.niit.zoo.animals.Lion;
import com.niit.zoo.food.Meat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Михаил Чугунов on 22.09.2016.
 */
public class CageTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testPutAnimal() throws Exception {
        Cage cage = new Cage(500);
        Hyena jinja = new Hyena("Jinja", 65);
        boolean result = cage.putAnimal(jinja);

        assertTrue(result);
        assertEquals(jinja, cage.whoLivesHere());
    }

    @Test
    public void testPutAnimalFailsIfAnimalIsTooBig() {
        Cage cage = new Cage(50);
        Lion simba = new Lion("Simba", 650);
        boolean result = cage.putAnimal(simba);

        assertFalse(result);
        assertEquals(null, cage.whoLivesHere());
    }

    @Test
    public void testReleaseInhabitant() throws Exception {
        Cage cage = new Cage(500);
        Hyena jinja = new Hyena("Jinja", 65);
        cage.putAnimal(jinja);

        boolean result = cage.releaseInhabitant();

        assertTrue(result);
    }

    @Test
    public void testReleaseInhabitantFailsIfAnimalIsOverfed() {
        Cage cage = new Cage(70);
        Hyena jinja = new Hyena("Jinja", 65);
        cage.putAnimal(jinja);
        jinja.eat(new Meat(100));

        boolean result = cage.releaseInhabitant();

        assertFalse(result);
    }
}