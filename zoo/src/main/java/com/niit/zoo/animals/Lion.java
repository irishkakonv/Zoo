package com.niit.zoo.animals;

import com.niit.zoo.Player;
import com.niit.zoo.food.Food;
import com.niit.zoo.food.Meat;
import com.niit.zoo.food.Vegetable;

public class Lion extends Carnivore{
    public Lion(String name, double weight) {
       super(name, weight);
        this.soundFile = "lion.wav";
    }

    @Override
    protected void doEat(Food food) {
        if (food instanceof Meat) {
            weight += food.getNutricity();
        }
        if (food instanceof Vegetable) {
            weight -= food.getNutricity();
        }
    }
}
