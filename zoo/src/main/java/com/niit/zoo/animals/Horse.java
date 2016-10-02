package com.niit.zoo.animals;

import com.niit.zoo.Player;
import com.niit.zoo.food.Food;
import com.niit.zoo.food.Meat;
import com.niit.zoo.food.Vegetable;

public class Horse extends Herbivore {

    public Horse(String name, int weight) {
        super(name, weight);
        this.soundFile = "horse.wav";
    }

    @Override
    protected void doEat(Food food) {
        if (food instanceof Vegetable) {
            weight += food.getNutricity();
        }
        if (food instanceof Meat) {
            weight -= food.getNutricity();
        }
    }

}
