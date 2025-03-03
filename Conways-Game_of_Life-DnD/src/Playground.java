public class Playground {

	private int xSize;
	private int ySize;
	
	private Cell[][] cellMap;
	private boolean[][] cellMapUpdated;
	
	public Playground(int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
		cellMap = new Cell[ySize][xSize];
		cellMapUpdated = new boolean[ySize][xSize];
	}
	
	public int getXSize() {
		return this.xSize;
	}
	
	public int getYSize() {
		return this.ySize;
	}
	
	public Cell[][] getCellMap() {
		return this.cellMap;
	}
	
	public boolean[][] getBooleanMap() {
		return this.cellMapUpdated;
	}
	
	public void setYSize(int ySize) {
		this.ySize = ySize;
	}
	
	public void setXSize(int xSize) {
		this.xSize = xSize;
	}
}
