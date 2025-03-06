import java.util.Scanner;

public class StopandPause extends Thread {
private int pauseAt;
	
	private boolean pause;
	
	private int generation;
	
	Scanner scanner = new Scanner(System.in);
	
	Input input = new Input();
	
	@Override
	public void run() {
		
		while (true) {	//gleichzeitig zu main wird die thread.run-Methode gestartet
		
			String choice = scanner.nextLine();	//Scanner bleibt aktiv und wartet auf input
			
			pause = true;	
		
			if (choice.equals("p") && pauseAt != generation) {	//Eingabe ist "p & kein Generationsstop" = beenden/fortsetzen
				
				System.out.println("Pause: \n[1] Spiel fortsetzen\n[2] Spiel beenden");
				
				choice = scanner.nextLine();
				
				if (choice.equals("1")) {
					System.out.println("Spiel wird fortgesetzt.");
				}else if (choice.equals("2")) {
					System.out.println("Das Spiel wurde beendet.");
					System.exit(0);
				}
			
			} else if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {	//wenn der "Generationsstop" erreicht ist -> auswahl
				if (choice.equals("1")) {
					System.out.println("Spiel wird fortgesetzt.");
				}else if (choice.equals("2")) {
					System.out.println("Das Spiel wurde beendet.");
					System.exit(0);
				}else if (choice.equals("3")) {
					int newPauseAt = 0;
					
					System.out.println("Zahl für Pause: ");
					
					while (newPauseAt <= generation && newPauseAt <= pauseAt) {		//nächster "Generationsstop" muss größer sein als die jetzige Generation
						newPauseAt = scanner.nextInt();
					}
					
					pauseAt = newPauseAt;
				}
				
			}
			
			pause = false;
		}
	}
	
	
	
	
	public int getPauseAt() {
		return this.pauseAt;
	}
	public void setPauseAt(int pauseAt) {
		this.pauseAt = pauseAt;
	}
	
	public boolean getPause() {
		return this.pause;
	}
	public void setPause(boolean pause) {
		this.pause = pause;
	}
	
	public int getGeneration() {
		return this.generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
}
