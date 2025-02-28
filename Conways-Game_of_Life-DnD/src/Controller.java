
public class Controller {
 
	Input input = new Input();
	CellLogic cellLogic = new CellLogic();
	
	Playground playground = new Playground(input.getXWayDefaultValue(), input.getYWayDefaultValue());
	PlaygroundLogic playgroundLogic = new PlaygroundLogic();
	
	public void start() {
		System.out.println(playground.getCellMap()[0].length);
		cellLogic.fillCellMap(playground.getCellMap());
		cellLogic.setTwentyCellsAlive(playground.getCellMap());
		cellLogic.printCellAlife(playground.getCellMap());
		playgroundLogic.printPlayground(playground.getCellMap());
	}
	
}