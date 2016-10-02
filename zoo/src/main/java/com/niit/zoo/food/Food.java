package com.niit.zoo.food;

public class Food {
    protected boolean fresh = true;
    protected double nutricity = 0.0;

    protected Food(int nutricity) {
        this.nutricity = nutricity;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public boolean getFresh() {
        return  fresh;
    }

    public double getNutricity() {
        if (nutricity < 0) return 0.0;
        return nutricity;
    }
}
