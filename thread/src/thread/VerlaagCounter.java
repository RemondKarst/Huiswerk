package thread;

public class VerlaagCounter extends Thread{
	private Counter counter;
	private int aantal;
	
	VerlaagCounter (Counter counter, int aantal){
		this.counter = counter;
		this.aantal = aantal;
	}
	
	public void run() {
		for (int i = 0 ;i<aantal;i++){
			counter.subtractOne();
			yield();

			} 
	}

}
