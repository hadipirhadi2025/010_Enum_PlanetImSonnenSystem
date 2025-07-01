package de.atsa.mit.loesung;

/**
 * <pre>
 *     enum: Nur eine Begrenzte Anzahl von Objekten diese Typs
 *     enum: alle Objekte diese Typs werden sofort hier erstellt.
 *     enum-Elemente sind public static und final
 *
 *     enum erstellt:
 *     public static final PlanetImSonnensystem MERKUR = new PlanetImSonnensystem("MERKUR",3.303e23, 2.4397e6);
 *              private String name;
 *               private PlanetImSonnensystem(String name. double masse, double radius){
 *     enum: Template und Referenztyp (wie class)
 *
 * </pre>
 *
 */
public enum PlanetImSonnensystem {
    MERKUR(3.303e23, 2.4397e6),
    VENUS(4.869e24, 6.0518e6),
    ERDE(5.976e24, 6.37814e6),
    MARS(6.421e23, 3.3972e6),
    JUPITER(1.9e27, 7.1492e7),
    SATURN(5.688e26, 6.0268e7),
    URANUS(8.686e25, 2.5559e7),
    NEPTUN(1.024e26, 2.4746e7);
    /** in kg */
    private double masse;
    /** in m */
    private double radius;

    public static final double G = 6.673e-11;

    /**
     * Jeder Konstruktor in einem enum ist private (kann weggelassen werden)
     * @param masse in kg
     * @param radius in m
     */
    private PlanetImSonnensystem(double masse, double radius){
        this.masse = masse;
        this.radius = radius;
    }

    public double berechnenOberflaechenSchwerkraft(){
        return G * masse/ (radius * radius);
    }

    public  double berechnenGavitation(double gewicht){
        return gewicht * berechnenOberflaechenSchwerkraft();
    }
}
