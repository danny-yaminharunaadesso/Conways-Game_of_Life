import java.util.Scanner;

public class StopandPause extends Thread{
	
	@Override
	public void run() {
		Scanner scannerStartStop = new Scanner (System.in);
		String input = scannerStartStop.nextLine();
		
		
		if (input.equalsIgnoreCase("p")) {
			
			try {
				Scanner scannerChoice = new Scanner (System.in);
				System.out.println("Sie haben Conway´s Game of Life pausiert wie möchten Sie fortfahren, \r\n"
						+ "[1] Spiel fortsetzen, [2] Spiel beenden");
				int choice = scannerChoice.nextInt();
				if (choice == 1) {
					stopGame();
				}else if (choice == 2) {
					
				}else {
					System.out.println("Falsche Eingabe! Versuchs nochmal!");
					choice = scannerChoice.nextInt();
				}
				
			} catch (InterrputedExeption e){
				
			}
			
			
		}
		
	}
	
	public void stopGame() {
		System.out.println("Das Spiel wurde beendet!");
		System.exit(0);												//Java Programm wird beendet
	}

	public void lastGeneration() {
		// hier kann man den 2. Array holen und nochmals die letzte Ausgabe ausgeben
			// - mit einer doppelten vorschleife, ...
	}
	
	public void continueGame() {
		// Spiel fortsetzen falls es nicht automatisch geht
	}
}
