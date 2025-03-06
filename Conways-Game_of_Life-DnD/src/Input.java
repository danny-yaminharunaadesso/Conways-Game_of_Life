import java.util.Scanner;
 
public class Input {
	
	Scanner scannerDefaultValues = new Scanner (System.in);
	
	   public int getXWayDefaultValue() {	//Eingabe von Spielfeldgröße 2D-Array in X-Richtung
			System.out.println("Willkommen bei Conway´s Game of Life \r\n"
					+ "Bitte geben Sie ein Feld in X-Richtung ein.");
		   return getValidInput(scannerDefaultValues);
	   }
	   
	   public int getYWayDefaultValue() {	//Eingabe von Spielfeldgröße 2D-Array in Y-Richtung
			System.out.println("Bitte geben Sie ein Feld in Y-Richtung ein.");
		   return getValidInput(scannerDefaultValues);
	   }
	   
	   public int getPauseAt() {	//Eingabe von Generation -> Pause
			System.out.println("Sie haben die Möglichkeit bei einer bestimmten Generation zu pausieren. \r\n"
					+ "(0 = funktion nicht benötigt, größer als 1 = pause)");
		   return getValidPauseInput(scannerDefaultValues);
	   }
	   
	   
	   int getValidInput(Scanner scanner) {	//Eingabe Sicherung für 2D-Array
	        int value = 0;
	        boolean valid = false;
 
	        while (!valid) {
	            if (scanner.hasNextInt()) {
	                value = scanner.nextInt();
	                if (value >= 1) {	//Wert muss größer-gleich als 1 sein
	                    valid = true;
	                } else {
	                    System.out.println("Fehler: Die Zahl muss mindestens 1 sein! Versuche es erneut.");
	                }
	            } else {
	                System.out.println("Fehler: Bitte eine gültige ganze Zahl eingeben!");
	                scanner.next();
	            }
	        }
	   
	        return value;
	    }
	   
	   private int getValidPauseInput(Scanner scanner) {	//Eingabe Sicherung für Generation
	        int value = 0;
	        boolean valid = false;

	        while (!valid) {
	            if (scanner.hasNextInt()) {
	                value = scanner.nextInt();
	                if (value == 0 || value >= 1) {	//Wert muss 0 oder größer-gleich 1 sein
	                    valid = true;
	                } else {
	                    System.out.println("Fehler: Die Zahl muss mindestens 0 sein! Versuche es erneut.");
	                }
	            } else {
	                System.out.println("Fehler: Bitte eine gültige ganze Zahl eingeben!");
	                scanner.next();
	            }
	        }
	   
	        return value;
	    }
	   
}


