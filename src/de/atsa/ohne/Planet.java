package de.atsa.ohne;

/**
 * <pre>
 *     Enhält Namen, Gewicht und Radius eines Planet
 * </pre>
 */
public class Planet {
    private String name;
    private double masse ;
    private double radius;
    /** echte Werte folgen */
//    private double abstand;
//
//    public Planet(String name, double masse, double radius, double abstand) {
//        this.name = name;
//        /** masse inkg */
//        this.masse = masse;
//        /** radius in Meter */
//        this.radius = radius;
//        this.abstand = abstand;
//    }

    public Planet(String name, double masse, double radius) {
        this.name = name;
        /** masse inkg */
        this.masse = masse;
        /** radius in Meter */
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

//    public double getAbstand() {
//        return abstand;
//    }

    @Override
    public String toString() {
        return name;
    }
}
