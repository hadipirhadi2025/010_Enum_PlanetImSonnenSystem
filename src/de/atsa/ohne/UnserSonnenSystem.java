package de.atsa.ohne;

/**
 * <pre>
 *     Unser Sonnensxstem mit den 8 Planeten
 *     TODO; Sonne aufnehmen, Planet-Klasse: Abstände zur Sonne (mit und max), Umlaufgeschwindigkeit
 * </pre>
 */
public class UnserSonnenSystem {
//    public static final Planet ERDE = new Planet("ERDE", 5.976e24, 6.37814e6,1);
//    public static final Planet Mars = new Planet("Mars",6.421e23, 3.3972e6,2 );
//    public static final Planet URANUS = new Planet("URANUS",8.686e25, 2.5559e7,4);
//    public static final Planet VENUS = new Planet("VENUS", 4.869e24, 6.0518e6,0.5);
//    public static final Planet JUPITER = new Planet("JUPITER", 1.9e27, 7.1492e7,3);
//    public static final Planet MERKUR = new Planet("MERKUR", 3.303e23, 2.4397e6,0.25);
//    public static final Planet SATURN = new Planet("SATURN", 5.688e26, 6.0268e7,3);
//    public static final Planet NEPTUN = new Planet("NEPTUN", 1.024e26, 2.4746e7,7);
    public static final Planet ERDE = new Planet("ERDE", 5.976e24, 6.37814e6);
    public static final Planet Mars = new Planet("Mars",6.421e23, 3.3972e6 );
    public static final Planet URANUS = new Planet("URANUS",8.686e25, 2.5559e7);
    public static final Planet VENUS = new Planet("VENUS", 4.869e24, 6.0518e6);
    public static final Planet JUPITER = new Planet("JUPITER", 1.9e27, 7.1492e7);
    public static final Planet MERKUR = new Planet("MERKUR", 3.303e23, 2.4397e6);
    public static final Planet SATURN = new Planet("SATURN", 5.688e26, 6.0268e7);
    public static final Planet NEPTUN = new Planet("NEPTUN", 1.024e26, 2.4746e7);

    public static final Planet[] PLANETEN = {MERKUR, VENUS, ERDE, Mars, JUPITER, SATURN,URANUS,NEPTUN};

    private UnserSonnenSystem(){}
}
