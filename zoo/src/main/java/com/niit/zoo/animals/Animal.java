package com.niit.zoo.animals;

import com.niit.zoo.Player;
import com.niit.zoo.food.Food;
import com.niit.zoo.food.Vegetable;

/**
 * Created by irishkakonv on 22.09.16.
 */
public class Animal {
    private String name;
    private double weight;
    private String soundFile;

    public Animal(String name, double weigth) {
        this.name = name;
        this.weight = weigth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getSoundFile() {
        return soundFile;
    }


    public void eat(Food f) {}

    public void makeSound() {}
}
