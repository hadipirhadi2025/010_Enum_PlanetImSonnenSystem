package de.atsa.ohne;

public class PlanetBeobachtungEinfach {
    public static void main(String[] args) {
        Planet erde = UnserSonnenSystem.ERDE;
        System.out.println(erde + "hat einen Radius von " + erde.getRadius() + "m.");
        System.out.println("Die Nachbarplanet der " + erde + " sind:" );

        Planet[] diePlaneten = UnserSonnenSystem.PLANETEN;
        for (int i = 0; i < diePlaneten.length; i++) {
            int position = i + 1;
            System.out.println(diePlaneten[i] + " steht an Position " + position);
        }
        System.out.println("Pumuckl mag Neptun!");
        diePlaneten[0] = diePlaneten[7];
        diePlaneten[1] = diePlaneten[7];
        diePlaneten[3] = diePlaneten[7];
        for (int i = 0; i < diePlaneten.length; i++) {
            int position = i + 1;
            System.out.println(diePlaneten[i] + " steht an Position " + position);
        }
        for (int i = 0; i < UnserSonnenSystem.PLANETEN.length; i++) {
            int position = i + 1;
            System.out.println("An position " + position + " ist der Panet " + UnserSonnenSystem.PLANETEN[i]);
        }
    }


}
