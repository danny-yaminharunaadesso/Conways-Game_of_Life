import java.util.Scanner;
 
public class Input {
	
	Scanner scannerDefaultValues = new Scanner (System.in);
	
	   public int getXWayDefaultValue() {
			System.out.println("Willkommen bei Conway´s Game of Life \r\n"
					+ "Bitte geben Sie ein Feld in X-Richtung ein.");
		   return getValidInput(scannerDefaultValues);
	   }
	   
	   public int getYWayDefaultValue() {
			System.out.println("Bitte geben Sie ein Feld in Y-Richtung ein.");
		   return getValidInput(scannerDefaultValues);
	   }
	   
	   public int getPauseAt() {
			System.out.println("Sie haben die Möglichkeit bei einer bestimmten Generation zu pausieren. \r\n"

					+ "(0 = funktion nicht benötigt, größer als 1 = pause)");

		   return getValidPauseInput(scannerDefaultValues);
	   }
	   
	   public int getCellDefaultValue() {
			System.out.println("Bitte geben Sie die zu Beginn Lebenden Zellen ein.");
		   return getValidInput(scannerDefaultValues);
	   }
	   
	   public int getSecGenDefaultValue() {
			System.out.println("Bitte geben Sie die zu Beginn Lebenden Zellen ein.");
		   return getValidInput(scannerDefaultValues);
	   }
	   
	   int getValidInput(Scanner scanner) {
	        int value = 0;
	        boolean valid = false;
 
	        while (!valid) {
	            if (scanner.hasNextInt()) {
	                value = scanner.nextInt();
	                if (value >= 1) {
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
	   
	   private int getValidPauseInput(Scanner scanner) {
	        int value = 0;
	        boolean valid = false;

	        while (!valid) {
	            if (scanner.hasNextInt()) {
	                value = scanner.nextInt();
	                if (value == 0 || value >= 1) {
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