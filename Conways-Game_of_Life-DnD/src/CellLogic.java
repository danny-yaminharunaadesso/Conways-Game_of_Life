import java.util.Random;
 
public class CellLogic {
	
	Random random = new Random();
	
	public void fillCellMap(Cell[][] cellMap) {
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				cellMap[x][y] = new Cell(false);
			}
		}
	}
	
	public void printCellAlife (Cell[][] cellMap) {
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
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
	
}