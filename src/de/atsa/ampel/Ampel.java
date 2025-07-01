package de.atsa.ampel;

/**
 * <pre>
 * Repräsentiert eine einzelne Ampel, die ihre Phasen wechselt.
 * </pre>
 */
public class Ampel {
    private Ampelphase aktuellePhase; // Attribute: current phase of the traffic light

    /**
     * Konstruktor für die Ampel. Setzt die Startphase auf ROT.
     */
    public Ampel() {
        this.aktuellePhase = Ampelphase.ROT; // Traffic light starts red
        System.out.println("Ampel wurde erstellt. Startphase: " + aktuellePhase);
    }

    /**
     * Schaltet die Ampel auf die nächste Phase um.
     * Die Reihenfolge ist: ROT -> ROT_GELB -> GRUEN -> GELB -> ROT.
     */
    public void umschalten() {
        switch (aktuellePhase) {
            case ROT:
                aktuellePhase = Ampelphase.ROT_GELB;
                break;
            case ROT_GELB:
                aktuellePhase = Ampelphase.GRUEN;
                break;
            case GRUEN:
                aktuellePhase = Ampelphase.GELB;
                break;
            case GELB:
                aktuellePhase = Ampelphase.ROT;
                break;
            // No default needed as all enum values are covered.
            // If new phases are added, compiler will warn if not handled.
        }
        System.out.println("Ampel schaltet um. Neue Phase: " + aktuellePhase);
    }

    /**
     * Getter für die aktuelle Phase der Ampel.
     * @return Die aktuelle Ampelphase.
     */
    public Ampelphase getAktuellePhase() {
        return aktuellePhase;
    }

    /**
     * Gibt eine String-Repräsentation der Ampel zurück.
     * @return Eine String, der die aktuelle Phase der Ampel anzeigt.
     */
    @Override
    public String toString() {
        return "Ampel ist gerade in Phase: " + aktuellePhase;
    }
}
