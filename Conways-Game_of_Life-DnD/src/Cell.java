
public class Cell {
	private boolean alive;
	private int neighbours;
	
	public Cell(boolean alive) {
		this.alive = alive;
		neighbours = 0;
	}
	
	public boolean getLife() {
		return alive;
	}
	
	public int getNeighbours() {
		return neighbours;
	}
	
	public void setLife (boolean alive) {
		this.alive = alive;
	}
	
	public void setNeighbours(int neighbours) {
		this.neighbours = neighbours;
	}
}
