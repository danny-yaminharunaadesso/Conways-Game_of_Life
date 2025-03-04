
public class Rules {
	
	public void setCellAlifeOrDead(Cell[][] cellMap, boolean[][] booleanMap) {
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (booleanMap[y][x]) {
					cellMap[y][x].setLife(true);
				} else {
					cellMap[y][x].setLife(false);
				}
			}
		}
	}
	
	public void twoOrLessNeighbours(Cell[][] cellMap, boolean[][] booleanMap) {
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (cellMap[y][x].getNeighbours() < 2) {
					booleanMap[y][x] = false;
				}
			}
		}
	}
	
	public void moreThanThreeNeighbours(Cell[][] cellMap, boolean[][] booleanMap) {
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (cellMap[y][x].getNeighbours() > 3) {
					booleanMap[y][x] = false;
				}
			}
		}
	}
	
	public void threeNeighbours(Cell[][] cellMap, boolean[][] booleanMap) {
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				if (cellMap[y][x].getNeighbours() == 3) {
					booleanMap[y][x] = true;
				}
			}
		}
	}
	
	public boolean endOfGame(Cell[][] cellMap) {
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
