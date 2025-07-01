package de.atsa.mit.loesung;

import java.util.Random;

public class SwitchenImZooUndAufMission {
    public static void main(String[] args) {
        System.out.println("Wilkommen beim Geheimdienst, wähle deine Mission\n\t" +
                "1: Stehlen eins geheimen Dokuments\n\t" +
                "2: Retten einer Geisel\n\t" +
                "3: Ausschalten eines feindlichen Agenten\n\t" +
                "Mit Jeder andere anderen Zahl geht du un den (unbezahlten) Urlaub");

        Random wuerfel = new Random();
        int awswahl = wuerfel.nextInt(1, 10);//
        switch (awswahl){
            case 1 -> System.out.println("Stehle die geheimn Dokumente von Dr. No");
            case 2->System.out.println("Rette die entführte Prinzenssin");
            case 3->{
                System.out.println("Ein Bond wurde gesichtet, ist das der Richtig?");
                System.out.println("Wenn es nicht James: schalte ihn aus");
            }
            case 4 -> System.out.println("Erstaunlich, das wae keine Option");
            default -> System.out.println("Kein Agent geht jamals in den Urlaub: du bist enttarnt!");
        }

        System.out.println("\n Nach der Mission geht es in den Zoo");
        String[] tiere = {"Löwe", "Tiger", "Hai", "Ara","Hund" };
        int tierenIndex = wuerfel.nextInt(tiere.length);
        String tier = tiere[tierenIndex];
        String sound = switch (tier){
          case "Hund" ->"Wau wau";
          case "Ara" ->"Krächts";
          case "Hai" ->"Blubb";
            default -> "Dieser Tiersound wurde noch nicht aufgenommen";
        };
        System.out.println(tier + " macht " + sound);

        System.out.println("\nNach dem Zoo gibt es Kaffee");
        String bestellung = "Eiskaffee";
        System.out.println("Du hast bestellt: " +bestellung+" ,dazufolgende Info:");
    }
}
