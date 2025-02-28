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
				y = random.nextInt(0,cellMap.length - 1);
				x = random.nextInt(0,cellMap[0].length - 1);
				
				if (!cellMap[x][y].getLife()) {
					break;
				}			
			}
			
			cellMap[x][y].setLife(true);
			
		}
		
	}
	
}
