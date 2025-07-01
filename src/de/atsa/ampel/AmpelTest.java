package de.atsa.ampel;

public class AmpelTest {
    public static void main(String[] args) {
        System.out.println("--- Test der Ampel-Funktionalität startet ---");

        // 1. یک شیء Ampel جدید ایجاد کنید
        ApmleInnerClasse ampel = new ApmleInnerClasse();
        System.out.println("Initialisierungstest: " + ampel); // باید ROT باشه

        // 2. تست چرخه umschalten()
        System.out.println("\n--- Test der Umschalt-Logik ---");

        // فاز 1: از ROT به ROT_GELB
        ampel.umschalten();
        System.out.println("Nach 1x Umschalten: " + ampel);
        if (ampel.getAktuellePhase() == ApmleInnerClasse.Ampelphase.ROT_GELB) {
            System.out.println("    [OK] Phase ist ROT-GELB");
        } else {
            System.err.println("    [FEHLER] Phase sollte ROT-GELB sein, ist aber " + ampel.getAktuellePhase().getBezeichnung());
        }

        // فاز 2: از ROT_GELB به GRUEN
        ampel.umschalten();
        System.out.println("Nach 2x Umschalten: " + ampel);
        if (ampel.getAktuellePhase() == ApmleInnerClasse.Ampelphase.GRUEN) {
            System.out.println("    [OK] Phase ist GRUEN");
        } else {
            System.err.println("    [FEHLER] Phase sollte GRUEN sein, ist aber " + ampel.getAktuellePhase().getBezeichnung());
        }

        // فاز 3: از GRUEN به GELB
        ampel.umschalten();
        System.out.println("Nach 3x Umschalten: " + ampel);
        if (ampel.getAktuellePhase() == ApmleInnerClasse.Ampelphase.GELB) {
            System.out.println("    [OK] Phase ist GELB");
        } else {
            System.err.println("    [FEHLER] Phase sollte GELB sein, ist aber " + ampel.getAktuellePhase().getBezeichnung());
        }

        // فاز 4: از GELB به ROT (تست برگشت به اول چرخه)
        ampel.umschalten();
        System.out.println("Nach 4x Umschalten: " + ampel);
        if (ampel.getAktuellePhase() == ApmleInnerClasse.Ampelphase.ROT) {
            System.out.println("    [OK] Phase ist ROT (Zyklus erfolgreich)");
        } else {
            System.err.println("    [FEHLER] Phase sollte ROT sein, ist aber " + ampel.getAktuellePhase().getBezeichnung());
        }

        // 3. تست مقادیر Enum ( delaySeconds و AnsiColorCode)
        System.out.println("\n--- Test der Enum-Eigenschaften ---");

        ApmleInnerClasse.Ampelphase rotPhase = ApmleInnerClasse.Ampelphase.ROT;
        System.out.println("ROT Phase: Bezeichnung='" + rotPhase.getBezeichnung() +
                "', Delay=" + rotPhase.getDelaySeconds() + "s, FarbeCode='" + rotPhase.getAnsiColorCode() + "'");
        if (rotPhase.getDelaySeconds() == 2 && rotPhase.getAnsiColorCode().equals("\u001B[31m")) {
            System.out.println("    [OK] ROT-Eigenschaften korrekt.");
        } else {
            System.err.println("    [FEHLER] ROT-Eigenschaften falsch.");
        }

        ApmleInnerClasse.Ampelphase gruenPhase = ApmleInnerClasse.Ampelphase.GRUEN;
        System.out.println("GRUEN Phase: Bezeichnung='" + gruenPhase.getBezeichnung() +
                "', Delay=" + gruenPhase.getDelaySeconds() + "s, FarbeCode='" + gruenPhase.getAnsiColorCode() + "'");
        if (gruenPhase.getDelaySeconds() == 3 && gruenPhase.getAnsiColorCode().equals("\u001B[32m")) {
            System.out.println("    [OK] GRUEN-Eigenschaften korrekt.");
        } else {
            System.err.println("    [FEHLER] GRUEN-Eigenschaften falsch.");
        }

        System.out.println("\n--- Test der Ampel-Funktionalität beendet ---");
    }
}
