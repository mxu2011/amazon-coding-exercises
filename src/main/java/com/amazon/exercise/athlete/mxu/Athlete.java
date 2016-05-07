package com.amazon.exercise.athlete.mxu;

/**
 * Created by Martin on 5/6/2016.
 */
public class Athlete {
    private int mass;
    private int strength;

    public Athlete (int mass, int strength) {
        this.mass = mass;
        this.strength = strength;
    }

    public int getMass() {
        return this.mass;
    }

    public int getStrength() {
        return this.strength;
    }
}