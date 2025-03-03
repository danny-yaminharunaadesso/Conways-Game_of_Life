
public class Rules {
	
	public void setCellAlifeOrDead(Cell[][] cellMap, boolean[][] booleanMap) {
		for (int y = 0; y < cellMap.length-1; y++) {
			for (int x = 0; x < cellMap[0].length-1; x++) {
				if (booleanMap[y][x]) {
					cellMap[y][x].setLife(true);
				} else {
					cellMap[y][x].setLife(false);
				}
			}
		}
	}
	
	public void twoOrLessNeighbours(Cell[][] cellMap, boolean[][] booleanMap) {
		for (int y = 0; y < cellMap.length-1; y++) {
			for (int x = 0; x < cellMap[0].length-1; x++) {
				if (cellMap[y][x].getNeighbours() < 2) {
					booleanMap[y][x] = false;
				}
			}
		}
	}
	
	public void moreThanThreeNeighbours(Cell[][] cellMap, boolean[][] booleanMap) {
		for (int y = 0; y < cellMap.length-1; y++) {
			for (int x = 0; x < cellMap[0].length-1; x++) {
				if (cellMap[y][x].getNeighbours() > 3) {
					booleanMap[y][x] = false;
				}
			}
		}
	}
	
	public void threeNeighbours(Cell[][] cellMap, boolean[][] booleanMap) {
		for (int y = 0; y < cellMap.length-1; y++) {
			for (int x = 0; x < cellMap[0].length-1; x++) {
				if (cellMap[y][x].getNeighbours() == 3) {
					booleanMap[y][x] = true;
				}
			}
		}
	}
	
}
