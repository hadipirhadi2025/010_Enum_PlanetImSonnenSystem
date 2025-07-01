package de.atsa.mit.loesung;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 *     Demosntriert switch/case in Java
 * </pre>
 */
public class Switchen {
    public static void main(String[] args) {
        Random wuerfel = new Random();
        int zahl = wuerfel.nextInt(1,7);
        System.out.println("Gewürfelt wurde " + zahl);
        switch (zahl){
            case 1:
                System.out.println("Es geht einen Schritt vorwärts");
                break;
            case 2:
                System.out.println("Zwei mal hüpfen.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Hier passiert nichts");
                break;
            case 6:
                System.out.println("Du hast eine Waschmaschine gewonnen....");
                break;
        }
        System.out.println("Welcher Kaffee darf es sein?");
        Scanner leser = new Scanner(System.in);
        String wunschkaffee = "Eiskaffee"; // leser.nextLine();
        switch(wunschkaffee){
            case "Latte Macchiato":
                System.out.println("Bei der Hitze? Komische Idee...");
                break;
            case "Eiskaffee":
                System.out.println("JO! Das passt!");
                break;
            default:
                System.out.println("Jeder andere Kaffee? Das ist doch ....");

        }
        System.out.println("\n--------------switchen mit enums -----------------\n");
        int planetenIndex = wuerfel.nextInt(PlanetImSonnensystem.values().length);
        PlanetImSonnensystem[] planeten = PlanetImSonnensystem.values();
        PlanetImSonnensystem derPlanet = planeten[planetenIndex];
        System.out.println("Der gewürfelte Planet hat im Array den Index: " + derPlanet.ordinal() + " Name " + derPlanet);
        switch (derPlanet){
            case ERDE:
                System.out.println("Na das ist ja keine weite Reise");
                break;
            case MARS:
                System.out.println("Schnell herkommen, solange hier noch Ruhe ist...");
                break;
            default:
                System.out.println("Reisen sind in Planung, komm morgen nochmal vorbei");
                break;
        }


    }
}
