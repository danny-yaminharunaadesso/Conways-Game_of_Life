public class PlaygroundLogic {

	
	public void printPlayground(Cell [][] cellMap) {
		
		String GREEN = "\u001B[32m";
		String GREY = "\u001B[90m";
		String RESET = "\u001B[0m";
		
		int x1 = 0;
		int y1 = 0;
		String greenColor = "  ";
		String greyColor = "  ";
		

		for (int e1 = 0; e1 < 2; e1++) {																	// erstellt erste -& letzte Linie auf X-Achse
			System.out.print("  ");
			for (x1 = 0; x1 < cellMap[0].length; x1++) {														// gibt zellen aus 1 Zelle entspricht "  "
				System.out.print("  ");
			}
			System.out.println();
			if (e1 == 0) {
				for (y1 = 0; y1 < cellMap.length; y1++) {													// erstellt alle Zeilen auf Y-Achse (von 0 bis Eingabe) die Zellen sind
					System.out.print(" ");
					for (int f1 = 0; f1 < cellMap[0].length; f1++) {										// checkt das befüllte 2D-Array 
						if (cellMap[y1][f1].getLife()) {
							String greenBackground = "\u001B[42m" + greenColor + "\u001B[0m";				// alle "true" Zellen werden grün -> syso
							System.out.print(greenBackground);
						}else {
							String greyBackground = "\u001B[48;5;250m" + greyColor + "\u001B[0m";			// alle "true" Zellen werden grau -> syso
							System.out.print(greyBackground);
						}
						
					}
					System.out.print(" ");
					System.out.println();
				}
			}
			
		}

	}
	
	
}
