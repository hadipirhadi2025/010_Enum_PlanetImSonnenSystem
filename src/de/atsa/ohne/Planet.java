package de.atsa.ohne;

/**
 * Enhält Namen, Gewicht und Radius eines Planeten
 */
public class Planet {

    private String name;
    /** masse in kg */
    private double masse;
    /** radius in Meter */
    private double radius;


    public Planet(String name, double masse, double radius) {
        this.name = name;
        this.masse = masse;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getMasse() {
        return masse;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return name;
    }
}
