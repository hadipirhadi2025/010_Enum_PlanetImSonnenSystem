package de.atsa.ohne;

public class PlanetBeobachtungEinfach {
    public static void main(String[] args) {
        Planet erde = UnserSonnensystem.ERDE;
        System.out.println(erde + " hat einen Radius von " + erde.getRadius() + " m.");
        System.out.println("Die Nachbarplaneten der " + erde + " sind:");

        Planet[] diePlaneten = UnserSonnensystem.planetenInReihenfolge();
        for (int i = 0; i < diePlaneten.length; i++) {
            int position = i + 1;
            System.out.println(diePlaneten[i] + " steht an Position " + position);
        }
        System.out.println("\n----------------------Pumuckl mag Neptun!");
        diePlaneten[0] = diePlaneten[7];
        diePlaneten[1] = diePlaneten[7];
        diePlaneten[3] = diePlaneten[7];
        for (int i = 0; i < diePlaneten.length; i++) {
            int position = i + 1;
            System.out.println(diePlaneten[i] + " steht an Position " + position);
        }
        System.out.println("\n");
        for (int i = 0; i < UnserSonnensystem.planetenInReihenfolge().length; i++) {
            int position = i +1;
            System.out.println("An Position " + position + " ist der Planet " + UnserSonnensystem.planetenInReihenfolge()[i]);
        }
//        UnserSonnensystem.PLANETEN = new Planet[9]; unmöglich wegen final

    }
}
