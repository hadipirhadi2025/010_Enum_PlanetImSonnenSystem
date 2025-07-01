package de.atsa.ampel;

/**
 * <pre>
 * Repräsentiert eine einzelne Ampel, die ihre Phasen wechselt.
 * Die Ampelphase wird als statisches, inneres Enum definiert.
 * </pre>
 */
public class ApmleInnerClasse {
    private Ampelphase aktuellePhase; //show

    /**
     * <pre>
     * Definiert die möglichen Phasen einer Ampel,
     * inklusive ihrer Farbe im Konsolen-Output und der Wartezeit (in Sekunden).
     * Dieses Enum ist jetzt eine statische innere Klasse von Ampel.
     * </pre>
     */
    public static enum Ampelphase { // Enum as inner classe
        ROT("Rot", "\u001B[31m", 2),
        ROT_GELB("Rot-Gelb", "\u001B[33m", 1),
        GRUEN("Grün", "\u001B[32m", 3),
        GELB("Gelb", "\u001B[33m", 1);

        private final String bezeichnung;
        private final String ansiColorCode;
        private final int delaySeconds;

        public static final String ANSI_RESET = "\u001B[0m"; //

        Ampelphase(String bezeichnung, String ansiColorCode, int delaySeconds) {
            this.bezeichnung = bezeichnung;
            this.ansiColorCode = ansiColorCode;
            this.delaySeconds = delaySeconds;
        }

        public String getAnsiColorCode() {
            return ansiColorCode;
        }

        public int getDelaySeconds() {
            return delaySeconds;
        }

        public String getBezeichnung() {
            return bezeichnung;
        }

        @Override
        public String toString() {
            return ansiColorCode + bezeichnung + ANSI_RESET;
        }

        /**
         * Ampelphase.
         * @return  Ampelphase
         */
        public Ampelphase next() {
            return values()[(this.ordinal() + 1) % values().length];
        }
    } //  Enum Ampelphase

    // -------------------------------------------------------------
    //
    // -------------------------------------------------------------

    public ApmleInnerClasse() {
        this.aktuellePhase = Ampelphase.ROT; // access enum Ampel.Ampelphase.ROT
        System.out.println("Ampel wurde erstellt. Startphase: " + aktuellePhase);
    }

    public void umschalten() {
        aktuellePhase = aktuellePhase.next();
    }

    public Ampelphase getAktuellePhase() {
        return aktuellePhase;
    }

    @Override
    public String toString() {
        return "Ampel ist gerade in Phase: " + aktuellePhase;
    }
}
