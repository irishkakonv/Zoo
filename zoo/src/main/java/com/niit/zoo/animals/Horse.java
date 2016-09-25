package com.niit.zoo.animals;

import com.niit.zoo.Player;
import com.niit.zoo.food.Food;
import com.niit.zoo.food.Meat;
import com.niit.zoo.food.Vegetable;

/**
 * Created by irishkakonv on 22.09.16.
 */
public class Horse extends Herbivore {
    String soundFile = "horse.wav";

    public Horse(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat(Food food) {
        double weight = super.getWeight();
        if (food instanceof Vegetable){
            if (food.getFresh() == true) {
                weight += food.getI();
            } else {
                weight -= food.getI();
            }
        }
        if (food instanceof Meat){
            weight -= food.getI();
        }
        super.setWeight(weight);
    }

    public void makeSound() {
        Player.play(soundFile);
    }

    public String getSoundFile() {
        return soundFile;
    }
}
