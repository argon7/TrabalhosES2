package com.es2.blackboxpartitioning;

import java.util.Random;

public class Die {
    private static final int DEFAULT_SIDES = 6;

    private static final Random ourRandNumGen = new Random();

    private final int numSides;

    private int currentResult;

    public Die() {
        this.numSides = 6;
    }

    public Die(int numSides) {
        if (numSides < 1 || numSides > 6)
            throw new AssertionError("Violation of precondition: Dice number of sides should be limited to numbers from 1 to 6");
        this.numSides = numSides;
        this.currentResult = 1;
    }

    public Die(int numSides, int result) {
        if (numSides < 1)
            throw new AssertionError("Violation of precondition: Dice number of sides cant be less then 1");
        if (numSides >= result && result >= 1)
            throw new AssertionError("Violation of precondition: 1 <= result <= numSides");
        this.numSides = numSides;
        this.currentResult = 1;
    }

    public int roll() {
        this.currentResult = ourRandNumGen.nextInt(this.numSides) + 1;
        if (getNumSides() >= getResult() && getResult() >= 1)
            throw new AssertionError("Violation of precondition: 1 <= result <= numSides");
        return this.currentResult;
    }

    public int getNumSides() {
        return this.numSides;
    }

    public int getResult() {
        return this.currentResult;
    }

    public String toString() {
        return "Num sides " + getNumSides() + " result " + getResult();
    }
}
