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
			
			while (thread.getPause()) {
				timer.waitSeconds();
			}
			
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
			
			if (playground.getGeneration() == thread.getPauseAt()) {
				System.out.println("Ihre eingegebene Generation ist erreicht. Wie möchten Sie fortfahren?\n"
						+ "[1] Spiel fortsetzen\n[2] Spiel beenden\n[3] nächste Pause\n");
				
				thread.setPause(true);
				
			}
			
			
			
			timer.waitSeconds();
		}
		
		playgroundLogic.printCellStats(rules.removedCells, rules.bornCells);
		
	}
}
