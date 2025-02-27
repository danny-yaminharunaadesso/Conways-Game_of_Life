import java.util.Scanner;
 
public class Input {
	Scanner scannerDefaultValues = new Scanner (System.in);
	
	   public int getXWayDefaultValue() {
			System.out.println("Willkommen bei Conway´s Game of Life \r\n"
					+ "Bitte geben Sie ein Feld in X-Richtung ein.");
			int xWayDefaultValue = getValidInput(scannerDefaultValues);
			return xWayDefaultValue;
	   }
	   
	   public int getYWayDefaultValue() {
			System.out.println("Bitte geben Sie ein Feld in Y-Richtung ein.");
			int yWayDefaultValue = getValidInput(scannerDefaultValues);
			return yWayDefaultValue;
	   }
	   
	   public int getCellDefaultValue() {
			System.out.println("Bitte geben Sie die zu Beginn Lebenden Zellen ein.");
			int cellDefaultValue = getValidInput(scannerDefaultValues);
			return cellDefaultValue;
	   }
	   
	   public int getSecGenDefaultValue() {
			System.out.println("Bitte geben Sie die zu Beginn Lebenden Zellen ein.");
			int secGenDefaultValue = getValidInput(scannerDefaultValues);
			return secGenDefaultValue;
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
	                    System.out.println("Fehler: Die Zahl muss größer als 0 sein. Versuchen Sie es erneut.");
	                }
	            } else {
	                System.out.println("Fehler: Bitte geben Sie eine gültige Zahl ein.");
	                scanner.next();
	            }
	        }
 
	        return value;
	    }
	   
 
	   
	   
	   
}
 
 