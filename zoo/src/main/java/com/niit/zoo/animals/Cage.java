package com.niit.zoo.animals;

/**
 * Created by irishkakonv on 23.09.16.
 */
public class Cage {
    private int i;
    private Animal animal;
    private boolean releaseInhabitant;

    public Cage(int i) {
        this.i = i;
    }

    public boolean putAnimal(Animal Animal) {
        releaseInhabitant = false;
        if(i > Animal.getWeight()) {
            this.animal = Animal;
            releaseInhabitant = true;
        } else {
            this.animal = null;
        }
        return releaseInhabitant;
    }

    public Animal whoLivesHere() {
        return animal;
    }

    public boolean releaseInhabitant() {
        double weight = animal.getWeight();
        if(i > weight) {
            releaseInhabitant = true;
        } else {
            releaseInhabitant = false;
        }
        return releaseInhabitant;
    }
}
