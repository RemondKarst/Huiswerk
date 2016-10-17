package thread;



public class Counter {
	
	private Integer counter = 0;
	
	synchronized public void addOne() {
		counter++;
		System.out.println("Aantal in verhoog is nu : " + counter);
	}
	
	synchronized public void subtractOne() {
		counter--;
		System.out.println("Aantal in verlaag is nu : " + counter);
	}
	
	@Override
	public String toString() {
		return String.format("Counter [counter=%d]", counter);
	}

}

class HoogOp extends Thread {

	public void run() {
		for (int i = 0 ;i<20;i++){
			System.out.println("allo.......");
			} 

	}

}
