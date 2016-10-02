package com.niit.zoo.animals;

import com.niit.zoo.Player;
import com.niit.zoo.food.Food;
import com.niit.zoo.food.Meat;
import com.niit.zoo.food.Vegetable;

public class Hyena extends Omnivore{
    public Hyena(String name, double weigth) {
        super(name, weigth);
        this.soundFile = "hyena.wav";
    }

    @Override
    protected void doEat(Food food) {
        weight += food.getNutricity();
    }
}
