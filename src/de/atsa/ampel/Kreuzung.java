package de.atsa.ampel;

import java.util.Scanner; // For the alternative pause method

/**
 * <pre>
 * Simuliert eine Ampel an einer Kreuzung, die ihre Phasen wechselt.
 * </pre>
 */
public class Kreuzung {

    public static void main(String[] args) {
        System.out.println("--- Ampelsimulation an der Kreuzung startet ---");

        Ampel ampel = new Ampel(); // Create an Ampel object

        // Option 1: Use Thread.sleep() for automatic pausing
        // Option 2: Use Scanner.nextLine() for manual pausing (uncomment if preferred)
        Scanner scanner = new Scanner(System.in);

        // Simulate 10 phase changes
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Schaltvorgang " + (i + 1) + " ---");

            ampel.umschalten(); // Switch to the next phase

            // Option 1: Pause with Thread.sleep()
            try {
                System.out.println("Warte 2 Sekunden...");
                Thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                // Handle the interrupted exception if the thread is interrupted
                Thread.currentThread().interrupt(); // Restore the interrupted status
                System.err.println("Ampelsimulation wurde unterbrochen.");
            }

            // Option 2: Pause with Scanner.nextLine() (uncomment and comment out Option 1 to use)
            /*
            System.out.println("Drücke ENTER, um zur nächsten Phase zu schalten...");
            scanner.nextLine(); // Wait for user input (Enter key)
            */

            // Output the current phase using both requested methods
            System.out.println("Aktuelle Ampelphase (toString der Ampel): " + ampel.toString());
            System.out.println("Aktuelle Ampelphase (getPhase und toString des Enums): " + ampel.getAktuellePhase().toString());
        }

        // Only close scanner if it was used
        scanner.close(); // Close the scanner to release resources

        System.out.println("\n--- Ampelsimulation beendet ---");
    }
}
