package de.atsa.ohne;

/**
 * Unser Sonnensystem mit den 8 Planeten
 * TODO: Sonne aufnehmen, Planet-Klasse: Abstände zur Sonne (min und max), Umlaufgeschwindigkeit
 */
public class UnserSonnensystem {
    public static final Planet ERDE = new Planet("ERDE", 5.976e24 , 6.37814e6);
    public static final Planet MARS =  new Planet("Mars",6.421e23, 3.3972e6 );
    public static final Planet URANUS = new Planet("URANUS",8.686e25, 2.5559e7);
    public static final Planet VENUS = new Planet("VENUS", 4.869e24, 6.0518e6);
    public static final Planet JUPITER = new Planet("JUPITER",  1.9e27, 7.1492e7);
    public static final Planet MERKUR = new Planet("MERKUR", 3.303e23, 2.4397e6);
    public static final Planet SATURN = new Planet("SATURN", 5.688e26, 6.0268e7);
    public static final Planet NEPTUN = new Planet("NEPTUN", 1.024e26, 2.4746e7);

//    private static final Planet[] PLANETEN = {MERKUR, VENUS,ERDE, MARS, JUPITER, SATURN, URANUS, NEPTUN};

    private UnserSonnensystem(){}

    public static Planet[] planetenInReihenfolge(){
        Planet[] diePlaneten = {MERKUR,VENUS,ERDE,MARS,JUPITER,SATURN,URANUS,NEPTUN};
        return diePlaneten;
    }
//
//    public static Planet getPlanetNachbarZurSonneHin(){
//        ...
//    }

    public static int getIndexImArray(Planet planet){
        for (int i = 0; i < planetenInReihenfolge().length; i++) {
            if(planetenInReihenfolge()[i] == planet){
                return i;
            }
        }
        return -1; //Alternative: Exception
    }

//    public static Planet[] getPLANETEN() {
//        return PLANETEN;
//    }
}
