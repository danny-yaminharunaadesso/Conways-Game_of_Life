public class Controller {
 
	Input input = new Input();
	CellLogic cellLogic = new CellLogic();
	Timer timer = new Timer(3);
	
	Playground playground = new Playground(input.getXWayDefaultValue(), input.getYWayDefaultValue());
	PlaygroundLogic playgroundLogic = new PlaygroundLogic();
	
	public void start() {

		cellLogic.fillCellMap(playground.getCellMap());
		cellLogic.setTwentyCellsAlive(playground.getCellMap());
		playgroundLogic.printPlayground(playground.getCellMap());


//		while (true) {
//			cellLogic.printCellAlife(playground.getCellMap());
//			cellLogic.countCellNeighbours(playground.getCellMap());
//			
//			cellLogic.twoOrLessNeighbours(playground.getCellMap());
//			cellLogic.moreThanThreeNeighbours(playground.getCellMap());
//			cellLogic.threeNeighbours(playground.getCellMap());
//			timer.waitSeconds();
//			
//			
//			playgroundLogic.printPlayground(playground.getCellMap());
//			
//		}
//		
//		
//
//
//	}
	
}
}