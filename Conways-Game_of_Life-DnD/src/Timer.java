import java.util.concurrent.TimeUnit;

public class Timer {
	
	private int seconds;
	
	public Timer(int seconds) {
		this.seconds = seconds;
	}
	
	public int getSeconds() {
		return this.seconds;
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public void waitSeconds() {
		try {
			TimeUnit.SECONDS.sleep(this.seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
