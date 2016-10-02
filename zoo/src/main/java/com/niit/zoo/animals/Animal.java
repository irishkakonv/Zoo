package com.niit.zoo.animals;

import com.niit.zoo.Player;
import com.niit.zoo.food.Food;
import com.niit.zoo.food.Vegetable;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected String soundFile;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (Double.compare(animal.weight, weight) != 0) return false;
        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return soundFile != null ? soundFile.equals(animal.soundFile) : animal.soundFile == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (soundFile != null ? soundFile.hashCode() : 0);
        return result;
    }

    protected Animal(String name, double weigth) {
        this.name = name;
        this.weight = weigth;
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

    protected abstract void doEat(Food food);

    public void eat(Food food) {
        if (!food.getFresh()) {
            this.weight -= food.getNutricity();
        } else {
            doEat(food);
        }
    }

    public void makeSound() {
        Player.play(soundFile);
    }
}
