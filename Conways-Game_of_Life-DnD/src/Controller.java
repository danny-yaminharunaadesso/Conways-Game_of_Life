public class Controller {

	Input input = new Input();
	CellLogic cellLogic = new CellLogic();
	Timer timer = new Timer(1);
	Rules rules = new Rules();

	Playground playground = new Playground(input.getXWayDefaultValue(), input.getYWayDefaultValue());

	PlaygroundLogic playgroundLogic = new PlaygroundLogic();

	public void start() {
		
		cellLogic.fillCellMap(playground.getCellMap()); // befüllt die cellMap mit toten Zellen

		cellLogic.setTwentyCellsAlive(playground.getCellMap());

		while (true) {
			System.out.println("\n");
			
			System.out.println(" Generation: " + playground.getGeneration());
			
			playgroundLogic.printPlayground(playground.getCellMap());
			cellLogic.countCellNeighbours(playground.getCellMap());

			rules.twoOrLessNeighbours(playground.getCellMap(), playground.getBooleanMap());
			rules.moreThanThreeNeighbours(playground.getCellMap(), playground.getBooleanMap());
			rules.threeNeighbours(playground.getCellMap(), playground.getBooleanMap());
			rules.setCellAlifeOrDead(playground.getCellMap(), playground.getBooleanMap());
			
			playground.setGeneration(playground.getGeneration() + 1);
			
			if (rules.endOfGame(playground.getCellMap())) {
				playgroundLogic.printPlayground(playground.getCellMap());
				timer.waitSeconds();
				break;
			}
			
			timer.waitSeconds();
			
		}
	}
}
