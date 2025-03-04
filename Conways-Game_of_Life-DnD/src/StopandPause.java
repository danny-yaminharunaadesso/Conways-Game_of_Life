import java.util.Scanner;

public class StopandPause extends Thread {
	boolean pause = false;
	
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("p")) {
                System.out.println("Sie haben Conway´s Game of Life pausiert. Wie möchten Sie fortfahren?\n" +
				        "[1] Spiel fortsetzen\n[2] Spiel beenden");

                 pause = true;
				int choice = scanner.nextInt();
				scanner.nextLine(); 

				if (choice == 1) {
				    System.out.println("Spiel wird fortgesetzt...");
				    pause = false;
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

	public boolean getPause() {
		return pause;
	}


    
}
