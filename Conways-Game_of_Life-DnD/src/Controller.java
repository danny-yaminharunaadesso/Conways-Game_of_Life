public class Controller {

	Input input = new Input();
	CellLogic cellLogic = new CellLogic();
	Timer timer = new Timer(3);
	Rules rules = new Rules();

	Playground playground = new Playground(input.getXWayDefaultValue(), input.getYWayDefaultValue());

	PlaygroundLogic playgroundLogic = new PlaygroundLogic();

	public void start() {

		cellLogic.fillCellMap(playground.getCellMap()); // befüllt die cellMap mit toten Zellen

		cellLogic.fillCellMap(playground.getCellMap());

		cellLogic.setTwentyCellsAlive(playground.getCellMap());
		playgroundLogic.printPlayground(playground.getCellMap());

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
