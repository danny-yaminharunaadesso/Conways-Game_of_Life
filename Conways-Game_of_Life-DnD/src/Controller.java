
public class Controller {
 
	Input input = new Input();
	
	Playground playground = new Playground(input.getXWayDefaultValue(), input.getYWayDefaultValue());
	
	public void start() {
		System.out.println(playground.getCellMap()[0].length);
 
	}
	
}