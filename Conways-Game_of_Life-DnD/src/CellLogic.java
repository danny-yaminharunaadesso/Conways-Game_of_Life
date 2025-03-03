import java.util.Random;

public class CellLogic {
	
	Random random = new Random();
	
	public void fillCellMap(Cell[][] cellMap) {
		for (int x = 0; x < cellMap.length; x++) {
			for (int y = 0; y < cellMap[0].length; y++) {
				cellMap[x][y] = new Cell(false);
			}
		}
	}
	
	public void printCellAlife (Cell[][] cellMap) {
		for (int x = 0; x < cellMap.length; x++) {
			for (int y = 0; y < cellMap[0].length; y++) {
				System.out.print(cellMap[x][y].getLife());
			}
			System.out.println();
		}
	}
	
	public void setTwentyCellsAlive(Cell[][] cellMap) {
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < 20; i++) {
			
			while (true) {
				x = random.nextInt(0,cellMap.length);
				y = random.nextInt(0,cellMap[0].length);
				
				if (!cellMap[x][y].getLife()) {
					break;
				}			
			}
			
			cellMap[x][y].setLife(true);
			
		}
		
	}
	
	public void countCellNeighbours(Cell[][] cellMap) {
		int neighbours;
		for (int x = 0; x < cellMap[0].length; x++) {
			for (int y = 0; y < cellMap.length; y++) {
				neighbours = 0;
						
						// horizontal / vertikal
						if (x < cellMap[0].length-1 && cellMap[x+1][y].getLife()) { // schauen ob rechts neben der Zelle eine Zelle lebt
							neighbours++;
						}
						
						if (x > 0 && cellMap[x-1][y].getLife()) { // schauen ob links neben der Zelle eine Zelle lebt
							neighbours++;
						}
						
						if (y > 0 && cellMap[x][y-1].getLife()) { // schauen ob über der Zelle eine Zelle lebt
							neighbours++;
						}
						
						if (y < cellMap.length-1 && cellMap[x][y+1].getLife()) { // schauen ob unter der Zelle eine Zelle lebt
							neighbours++;
						}
						
						// diagonal
						if (x < cellMap[0].length-1 && y > 0 && cellMap[x+1][y-1].getLife()) { // schauen ob rechts oben eine Zelle ist
							neighbours++;
						}
						
						if (x > 0 && y > 0 && cellMap[x-1][y-1].getLife()) { // schauen ob links oben eine Zelle ist
							neighbours++;
						}
						
						if (x > 0 && y < cellMap.length-1 && cellMap[x-1][y+1].getLife()) { // schauen ob links unten eine Zelle ist
							neighbours++;
						}
						
						if (x < cellMap[0].length-1 && y < cellMap.length-1 && cellMap[x+1][y+1].getLife()) { // schauen ob rechts unter der Zelle eine Zelle lebt
							neighbours++;
						}
						
						cellMap[x][y].setNeighbours(neighbours);
			}
		}
	}
	
	public void setCellAlifeOrDead(int[][] coordinates) {
		for (int x = 0; x < coordinates[0].length; x++) {
			for (int y = 0; y < coordinates.length; y++) {
			}
		}
	}
	
	public void twoOrLessNeighbours(Cell[][] cellMap) {
		for (int x = 0; x < cellMap[0].length; x++) {
			for (int y = 0; y < cellMap.length; y++) {
				if (cellMap[x][y].getNeighbours() < 2) {
					cellMap[x][y].setLife(false);
				}
			}
		}
	}
	
	public void moreThanThreeNeighbours(Cell[][] cellMap) {
		for (int x = 0; x < cellMap[0].length; x++) {
			for (int y = 0; y < cellMap.length; y++) {
				if (cellMap[x][y].getNeighbours() > 3) {
					cellMap[x][y].setLife(false);
				}
			}
		}
	}
	
	public void threeNeighbours(Cell[][] cellMap) {
		for (int x = 0; x < cellMap[0].length; x++) {
			for (int y = 0; y < cellMap.length; y++) {
				if (cellMap[x][y].getNeighbours() == 3) {
					cellMap[x][y].setLife(true);
				}
			}
		}
	}
	
}
