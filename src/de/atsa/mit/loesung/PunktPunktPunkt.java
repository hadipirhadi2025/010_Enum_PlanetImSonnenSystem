package de.atsa.mit.loesung;

import de.atsa.ampel.Ampel;
import de.atsa.ampel.ApmleInnerClasse;

import java.util.Random;
import java.util.Scanner;

public class PunktPunktPunkt {
    public static void main(String[] args) {
        System.out.println("der Mittelwert von 17 und 4 ist: " + mittelertBrechnen(17, 4));
        System.out.println("der mittelwert von 12, 5, und 22 ist: "+mittelertBrechnen(12,2,22));
        int[] zahlen = {170, 204, -1001};
        System.out.println("Mittelwert: " + mittelertBrechnen(zahlen));
        System.out.println("Mittelwert: "+ mittelertBrechnen(1,67,503,-4, 155, 202, -1001, 200));
        ausgeben(new Random(), ApmleInnerClasse.Ampelphase.GELB, new Ampel(), new Scanner(System.in), System.in, "Text",101, true, 3.14);
//        int zahl = 101;
//        System.out.println(zahl.getClass());
        Integer zahlObjekt = Integer.valueOf(101);
        System.out.println(zahlObjekt.getClass().getSimpleName());
        Integer kurz = 22;//Autoboxing : ruft im Hintegrund die valueOf Methode aus Integer auf
        //Integer ist ein Wrapper fü int
        Double objDouble = 3.14;//Autoboxing : ruft im Hintegrund die valueOf Methode aus Double auf
       // objDouble = 1; Kein Autoboxing von int zu Double
        Object versuch = 2;//Autoboxing: int->Integer
        String plus = "" + 3;//Autoboxing int->Integer, dann wird vom Integer-Object toString aufgerufen
    }

    public static  void ausgeben(Object... Objekte){
        for(Object objekt:Objekte){
            System.out.println("Das Objekt hat den Typ " + objekt.getClass().getName());
        }
    }
    public static int mittelertBrechnen(int... zahlen){
        int summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            summe = summe + zahlen[i];

        }
        return  summe / zahlen.length;
    }

//    public static int mittelertBrechnen(int[] zahlen){
//        int summe = 0;
//        for (int i = 0; i < zahlen.length; i++) {
//            summe = summe + zahlen[i];
//
//        }
//        return  summe / zahlen.length;
//    }
//    public static int mittelertBrechnen(int eins, int zwei, int drei, int vier, int fuenf){
//        return (eins+zwei+drei+vier+fuenf)/4;
//    }
//    public static int mittelertBrechnen(int eins, int zwei, int drei, int vier){
//        return (eins+zwei+drei+vier)/4;
//    }
//    public static int mittelertBrechnen(int eins, int zwei, int drei){
//        return (eins+zwei+drei)/3;
//    }
//    public static int mittelertBrechnen(int eins, int zwei){
//        return (eins+zwei)/2;
//    }
}
