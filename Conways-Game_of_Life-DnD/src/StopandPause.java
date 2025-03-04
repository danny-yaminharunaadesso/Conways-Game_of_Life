import java.util.Scanner;

public class StopandPause extends Thread {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in); // Ein Scanner für alles

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("p")) {
                System.out.println("Sie haben Conway´s Game of Life pausiert. Wie möchten Sie fortfahren?\n" +
				        "[1] Spiel fortsetzen\n[2] Spiel beenden");

				int choice = scanner.nextInt();
				scanner.nextLine(); // Leere Zeile nach `nextInt()` konsumieren

				if (choice == 1) {
				    System.out.println("Spiel wird fortgesetzt...");
				} else if (choice == 2) {
				    stopGame();
				} else {
				    System.out.println("Falsche Eingabe! Versuche es nochmal.");
				}
            }
        }
    }

    public void stopGame() {
        System.out.println("Das Spiel wurde beendet!");
        System.exit(0); // Java-Programm beenden
    }
}
