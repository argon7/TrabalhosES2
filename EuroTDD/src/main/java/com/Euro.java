package com;

public class Euro {

    int euro;

    public Euro(double e) {
        this.euro = (int)Math.round(e * 100.0D);
    }

    public String toString() {
        return String.format("EUR %.2f", this.euro / 100.0D);
    }

    public boolean equals(Object e2) {
        return (e2 instanceof Euro && this.euro == ((Euro)e2).euro);
    }

    public Euro minus(Euro oneEuro) {
        return new Euro((this.euro - oneEuro.euro));
    }
}