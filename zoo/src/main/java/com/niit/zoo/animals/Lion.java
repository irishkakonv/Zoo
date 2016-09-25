package com.niit.zoo.animals;

import com.niit.zoo.Player;
import com.niit.zoo.food.Food;
import com.niit.zoo.food.Meat;
import com.niit.zoo.food.Vegetable;

/**
 * Created by irishkakonv on 23.09.16.
 */
public class Lion extends Carnivore{
//    private String name;
//    private double weight;
    private String soundFile = "lion.wav";

    public Lion(String name, double weight) {
       super(name, weight);
    }

    @Override
    public String getSoundFile() {
        return soundFile;
    }

    @Override
    public void eat(Food food) {
        double weight = super.getWeight();
        if (food instanceof Vegetable){
            weight -= food.getI();
        }
        if (food instanceof Meat){
            if (food.getFresh() == true) {
                weight += food.getI();
            } else {
                weight -= food.getI();
            }
        }
        super.setWeight(weight);
    }

    public void makeSound() {
        Player.play(soundFile);
    }
}
