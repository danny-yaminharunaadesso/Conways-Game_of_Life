
public class Rules {
	
	public int removedCells;
	public int bornCells = 20;
	
	public void setCellAlifeOrDead(Cell[][] cellMap, boolean[][] booleanMap) { 	// schaut in BooleanMap und setzt ganz am Schluss in Controller auf lebend oder tot
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (booleanMap[y][x] && !cellMap[y][x].getLife()) { 			// Zelle wird geboren
					cellMap[y][x].setLife(true);
					bornCells++;												// für Stats am Ende
				} else if (!booleanMap[y][x] && cellMap[y][x].getLife()){		// Zelle stirbt
					cellMap[y][x].setLife(false);
					removedCells++;
				}
			}
		}
	}
	
	public void twoOrLessNeighbours(Cell[][] cellMap, boolean[][] booleanMap) { // holt sich vom Cell objekt die Anzahl der Nachbarn und tötet die Zelle bzw setzt sie in booleanMap auf false
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (cellMap[y][x].getNeighbours() < 2) {
					booleanMap[y][x] = false;
				}
			}
		}
	}
	
	public void moreThanThreeNeighbours(Cell[][] cellMap, boolean[][] booleanMap) { // tötet Zelle wenn zu viele Nachbarn
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (cellMap[y][x].getNeighbours() > 3) {
					booleanMap[y][x] = false;
				}
			}
		}
	}
	
	public void threeNeighbours(Cell[][] cellMap, boolean[][] booleanMap) { // Zelle wird geboren wenn 3 Nachbarn
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (cellMap[y][x].getNeighbours() == 3) {
					booleanMap[y][x] = true;
				}
			}
		}
	}
	
	public boolean endOfGame(Cell[][] cellMap) { // schaut ob alle Zellen tot sind oder leben
		int countAlife = 0;
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (cellMap[y][x].getLife()) {
					countAlife++;
				}
			}
		}
		
		if (countAlife == cellMap.length * cellMap[0].length) {
			return true;
		} else if (countAlife == 0) {
			return true;
		}
		
		return false;
	}
	
}
