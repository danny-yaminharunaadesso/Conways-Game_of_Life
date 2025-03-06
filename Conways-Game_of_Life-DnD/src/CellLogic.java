import java.util.Random;
 
public class CellLogic {
	
	Random random = new Random();
	
	public void fillCellMap(Cell[][] cellMap) { //befüllt die cellMap mit nicht lebenden Zellen
		for (int x = 0; x < cellMap.length; x++) {
			for (int y = 0; y < cellMap[0].length; y++) {
				cellMap[x][y] = new Cell(false);
			}
		}
	}
	
	
	public void setTwentyCellsAlive(Cell[][] cellMap) { // setzt 20 zufällige ZelLen auf lebend
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
	
	public void countCellNeighbours(Cell[][] cellMap) { // zählt die Anzahl der Nachbarn, welche eine Zelle hat
		int neighbours;
		
		for (int y = 0; y < cellMap.length; y++) {
			for (int x = 0; x < cellMap[0].length; x++) {
				neighbours = 0;
						
						// horizontal / vertikal
						if (x < cellMap[0].length-1) { // schauen ob rechts neben der Zelle eine Zelle lebt
							if (cellMap[y][x+1].getLife()) {
								neighbours++;
							}
						}
						
						if (x > 0) { // schauen ob links neben der Zelle eine Zelle lebt
							if (cellMap[y][x-1].getLife()) {
								neighbours++;
							}
						}
						
						if (y > 0) { // schauen ob über der Zelle eine Zelle lebt
							if (cellMap[y-1][x].getLife()) {
								neighbours++;
							}
						}
						
						if (y < cellMap.length-1) { // schauen ob unter der Zelle eine Zelle lebt
							if (cellMap[y+1][x].getLife()) {
								neighbours++;
							}
						}
						
						// diagonal
						if (x < cellMap[0].length-1 && y > 0) { // schauen ob rechts oben eine Zelle ist
							if (cellMap[y-1][x+1].getLife()) {
								neighbours++;
							}
						}
						
						if (x > 0 && y > 0) { // schauen ob links oben eine Zelle ist
							if (cellMap[y-1][x-1].getLife()) {
								neighbours++;
							}
						}
						
						if (x > 0 && y < cellMap.length-1) { // schauen ob links unten eine Zelle ist
							if (cellMap[y+1][x-1].getLife()) {
								neighbours++;
							}
						}
						
						if (x < cellMap[0].length-1 && y < cellMap.length-1) { // schauen ob rechts unter der Zelle eine Zelle lebt
							if (cellMap[y+1][x+1].getLife()) {
								neighbours++;	
							}
						}
						cellMap[y][x].setNeighbours(neighbours);
			}
		}
	}
	
}

