package de.atsa.mit.loesung;

import de.atsa.ohne.Planet;

import java.util.Scanner;

/**
 * <pre>
 *     Demonstriert, welche Methoden und Fähigkeiten im enum
 *     PlanetImSonnensystem mit generiert wurden,
 * </pre>
 */
public class EnumBeobachter {
    public static void main(String[] args) {
        System.out.println("Wir wohnen auf dem Planeten " + PlanetImSonnensystem.ERDE);
        PlanetImSonnensystem[] allePlaneten = PlanetImSonnensystem.values();
        for (PlanetImSonnensystem planet : allePlaneten){
            System.out.println("Der Planet heißt " + planet);
        }
        System.out.println("Wo liegt der Saturn?");
        int index = PlanetImSonnensystem.SATURN.ordinal();
        int position = index + 1;
        System.out.println("Positioon von " + PlanetImSonnensystem.SATURN + " ist " + position);
        Scanner leser = new Scanner(System.in);
        System.out.println("Welche Gravitation interessiert dich? Gib den Namen eines Planeten ein");
        String wunschPlanetenName = leser.nextLine();
        PlanetImSonnensystem wunschPlanet = PlanetImSonnensystem.valueOf(wunschPlanetenName.toUpperCase());
        System.out.println(wunschPlanet + " hat Oberflächenschwerkraft "
                + wunschPlanet.berechnenOberflaechenSchwerkraft());

        System.out.println("\n");


    }
}
