public class Controller {
 
	Input input = new Input();
	CellLogic cellLogic = new CellLogic();
	Timer timer = new Timer(2);
	Rules rules = new Rules();
 
	Playground playground = new Playground(input.getXWayDefaultValue(), input.getYWayDefaultValue());
	StopandPause thread = new StopandPause();
	PlaygroundLogic playgroundLogic = new PlaygroundLogic();
 
	public void start() {
		thread.start();
		
		cellLogic.fillCellMap(playground.getCellMap()); // befüllt die cellMap mit toten Zellen
 
		cellLogic.setTwentyCellsAlive(playground.getCellMap());
		
		thread.setPauseAt(input.getPauseAt());
		
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
			
			thread.setGeneration(playground.getGeneration());
			
			if (rules.endOfGame(playground.getCellMap())) {
				playgroundLogic.printPlayground(playground.getCellMap());
				
				timer.waitSeconds();
				
				break;
			}
			
			if (thread.getPauseAt() == playground.getGeneration()) {
				thread.setPauseXGen(true);
				thread.setPause(true);
				thread.setCrazyThreadThing(1);
			}
			thread.setCrazyThreadThing(0);
			timer.waitSeconds();
			
				while(thread.getPause()) {
					timer.waitSeconds();
				}
			
		}
		
		playgroundLogic.printCellStats(rules.removedCells, rules.bornCells);
		
	}
}