import java.util.ArrayList;
import java.util.List;

public class Playground {

	private int xSize;
	private int ySize;
	
	private Cell[][] cellMap = new Cell[xSize][ySize];
	
	public Playground(int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
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
	
	public void setYSize(int ySize) {
		this.ySize = ySize;
	}
	
	public void setXSize(int xSize) {
		this.xSize = xSize;
	}
}
