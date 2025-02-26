import java.util.Scanner;

public class Input {
	Scanner scannerDefaultValues = new Scanner (System.in);
	public void startDefaultVales() {
		

		System.out.println("Willkommen bei Conway´s Game of Life \r\n"
				+ "Bitte geben Sie ein Feld in X-Richtung ein.");
		int xWayDefaultValue = getValidInput(scannerDefaultValues);
		System.out.println("Bitte geben Sie ein Feld in Y-Richtung ein.");
		int yWayDefaultValue = getValidInput(scannerDefaultValues);
		System.out.println("Bitte geben Sie die zu Beginn Lebenden Zellen ein.");
		int cellDefaultValue = getValidInput(scannerDefaultValues);
		System.out.println("Bitte geben Sie die Zeit der Generationen ein.");
		int secGenDefaultValue = getValidInput(scannerDefaultValues);
		
	}
		
	   private int getValidInput(Scanner scanner) {
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
	   
	   public int getXDefaultValue() {
			System.out.println("Willkommen bei Conway´s Game of Life \r\n"
					+ "Bitte geben Sie ein Feld in X-Richtung ein.");
			int xWayDefaultValue = getValidInput(scannerDefaultValues);
		   return xWayDefaultValue;
	   }
	   
	   public int getYDefaultValue() {
			System.out.println("Bitte geben Sie ein Feld in Y-Richtung ein.");
			int yWayDefaultValue = getValidInput(scannerDefaultValues);
		   return scannerDefaultValues.nextInt();
	   }
	   
	   public int getDefaultValue() {
			System.out.println("Bitte geben Sie die zu Beginn Lebenden Zellen ein.");
			int cellDefaultValue = getValidInput(scannerDefaultValues);
		   return scannerDefaultValues.nextInt();
	   }
	   
	   public int getGenDefaultValue() {
			System.out.println("Bitte geben Sie die zu Beginn Lebenden Zellen ein.");
			// security hier, dann return eines int
			int x 
		   return scannerDefaultValues.nextInt();
	   }
	   
	   
	   
}
