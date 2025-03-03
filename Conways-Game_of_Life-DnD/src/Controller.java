public class Controller {
 
	Input input = new Input();
	CellLogic cellLogic = new CellLogic();
	Timer timer = new Timer(3);
	Rules rules = new Rules();
	
	Playground playground = new Playground(input.getXWayDefaultValue(), input.getYWayDefaultValue());
	
	PlaygroundLogic playgroundLogic = new PlaygroundLogic();
	
	public void start() {
		cellLogic.fillCellMap(playground.getCellMap()); //befüllt die cellMap mit toten Zellen
		cellLogic.setTwentyCellsAlive(playground.getCellMap());


		while (true) {
			System.out.println("");
			playgroundLogic.printPlayground(playground.getCellMap());
			cellLogic.countCellNeighbours(playground.getCellMap());
			
			rules.twoOrLessNeighbours(playground.getCellMap(), playground.getBooleanMap());
			rules.moreThanThreeNeighbours(playground.getCellMap(), playground.getBooleanMap());
			rules.threeNeighbours(playground.getCellMap(), playground.getBooleanMap());
			rules.setCellAlifeOrDead(playground.getCellMap(), playground.getBooleanMap());
			timer.waitSeconds();
			


		}

	}
	
}