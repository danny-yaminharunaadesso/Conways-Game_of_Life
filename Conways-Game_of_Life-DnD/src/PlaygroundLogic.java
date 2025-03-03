
public class PlaygroundLogic {

	Controller controller = new Controller();
	
	public void printPlayground(Cell [][] cellMap) {
		
		
		int cellSizePlayground = 2;

		//erste X reihe
		for (int x1 = 0; x1 < cellMap.length; x1++) { // X erste Linie
			if (x1 == 0) {
				System.out.print("-");
			}
			for (int e1 = 0; e1 < cellMap.length; e1++) { // die anzahl der Felder von Input
				System.out.println("--");
				if (e1 == cellMap.length) {	//X abschlusszeichen & neue Zeile
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		// Y reihen die kommen
		for (int y = 0; y < cellMap[0].length; y++) { // Y erstes Zeichen
			System.out.print("|");
			for (int f = 0; f < cellMap[0].length; f++) { // Y in X Leerzeichen
				System.out.print("  ");
				if (f == cellMap[0].length) {	//Y in X abschlusszeichen & neue Zeile
					System.out.println("|");
				}
			}
			System.out.println();
		}
		
		
		//letzte X reihe
		for (int x2 = 0; x2 < cellMap.length; x2++) {
			if (x2 == 0) {
				System.out.print("-");
			}
			for (int e2 = 0; e2 < cellMap.length; e2++) {
				System.out.print("--");
				if (e2 == cellMap.length) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
//		controller.input.getXWayDefaultValue()
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
