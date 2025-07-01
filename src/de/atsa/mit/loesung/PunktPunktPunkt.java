package de.atsa.mit.loesung;

public class PunktPunktPunkt {
    public static void main(String[] args) {
        System.out.println("der Mittelwert von 17 und 4 ist: " + mittelertBrechnen(17, 4));
        System.out.println("der mittelwert von 12, 5, und 22 ist: "+mittelertBrechnen(12,2,22));
        int[] zahlen = {170, 204, -1001};
        System.out.println("Mittelwert: " + mittelertBrechnen(zahlen));
        System.out.println("Mittelwert: "+ mittelertBrechnen(1,67,503,-4, 155, 202, -1001, 200));
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
