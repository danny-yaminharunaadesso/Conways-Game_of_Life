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
			
			System.out.println(" Generation: " + playground.getGeneration()); //gibt die aktuelle Generation aus
			
			playgroundLogic.printPlayground(playground.getCellMap()); // gibt das "Spielfeld" aus
			
			cellLogic.countCellNeighbours(playground.getCellMap()); // zählt die Nachbarn jeder Zelle
 
			rules.twoOrLessNeighbours(playground.getCellMap(), playground.getBooleanMap()); // tötet Zelle, falls sie 2 oder weniger als 2 Nahcbarn hat
			
			rules.moreThanThreeNeighbours(playground.getCellMap(), playground.getBooleanMap()); // tötet Zelle, falls sie mehr als 3 Nachbarn hat
			
			rules.threeNeighbours(playground.getCellMap(), playground.getBooleanMap()); // erweckt Zelle zum Leben, wenn sie 3 Nachbarn hat
			
			rules.setCellAlifeOrDead(playground.getCellMap(), playground.getBooleanMap()); // setzt Leben der Cell Objekte auf True oder False anhand der BooleanMap
			
			playground.setGeneration(playground.getGeneration() + 1); // erhöht die Generation um 1
			
			thread.setGeneration(playground.getGeneration()); // erhöht die Generation in Thread um 1 (wegen Pause bei bestimmter Generation)
			
			if (rules.endOfGame(playground.getCellMap())) {
				playgroundLogic.printPlayground(playground.getCellMap()); // printed am Ende das Spielfeld nochmal aus
				
				timer.waitSeconds(); // wartet je nach Parameter ? Sekunden
				
				break;
			}
			
			if (playground.getGeneration() == thread.getPauseAt()) { // wenn Generation da ist wo Pause, werden optionen ausgegeben und pause in Thread auf True gesetzt
				System.out.println("Ihre eingegebene Generation ist erreicht. Wie möchten Sie fortfahren?\n"
						+ "[1] Spiel fortsetzen\n[2] Spiel beenden\n[3] nächste Pause\n");
				
				thread.setPause(true);
				
			}
			
			
			
			timer.waitSeconds(); // wartet ...
		}
		
		playgroundLogic.printCellStats(rules.removedCells, rules.bornCells); // Gibt aus, wie viele Zellen gestorben und geboren sind

		
	}
}