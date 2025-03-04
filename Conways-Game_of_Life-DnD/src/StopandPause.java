import java.util.Scanner;
 
public class StopandPause extends Thread {
	Input inputClass = new Input();
	boolean pause = false;
	int pauseAt;
	int generation;
	boolean pauseXGen = false;
	int crazyThreadThing = 0;
	
	
    @Override
    public void run() {
 
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	String input = " ";
        	if (generation == pauseAt && pauseXGen) {
        		input = "p";
        		pauseXGen = false;
            	
        	} else {
        		crazyThreadThing = 1;
        			input = scanner.nextLine();
        	}
        	
            if (input.equalsIgnoreCase("p") || crazyThreadThing == 1) {
                System.out.println("Sie haben Conway´s Game of Life pausiert. Wie möchten Sie fortfahren?\n" +
				        "[1] Spiel fortsetzen\n[2] Spiel beenden\n[3] nächste Pause\n");
 
                 pause = true;
				int choice = scanner.nextInt();
//				scanner.nextLine();
 
				if (choice == 1) {
				    System.out.println("Spiel wird fortgesetzt...");
				    pause = false;
				} else if (choice == 2) {
				    stopGame();
				} else if (choice == 3){
					inputClass.getPauseAt();
					
				}else {
				    System.out.println("Falsche Eingabe! Versuche es nochmal.");
				}
            }
            	// möglichkeit 2. zahl eingeben -> pause " 2. zahl > 1. zahl"

            
        }
    }
 
    public void stopGame() {
        System.out.println("Das Spiel wurde beendet!");
        System.exit(0); // Java-Programm beenden
    }
 
	public boolean getPause() {
		return pause;
	}
 
	public void setPause(boolean pause) {
		this.pause = pause;
	}
	
	public void setPauseAt(int pauseAt) {
		this.pauseAt = pauseAt;
	}
	
	public void setGeneration(int generation) {
		this.generation = generation;
	}

	public boolean getPauseXGen() {
		return pauseXGen;
	}

	public void setPauseXGen(boolean pauseXGen) {
		this.pauseXGen = pauseXGen;
	}

	public int getPauseAt() {
		return pauseAt;
	}

	public void setCrazyThreadThing(int crazyThreadThing) {
		this.crazyThreadThing = crazyThreadThing;
	}
 
 
    
}