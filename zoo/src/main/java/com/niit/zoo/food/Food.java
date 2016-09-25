package com.niit.zoo.food;

/**
 * Created by irishkakonv on 23.09.16.
 */
public class Food {
    int i;
    public boolean fresh = true;
    double nutricity = 0.0;

    public Food(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public boolean getFresh() {
        return  fresh;
    }

    public double getNutricity() {
        return nutricity;
    }
}
