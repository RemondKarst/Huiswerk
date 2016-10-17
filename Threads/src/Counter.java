

public class Counter {
	
	private Integer counter = 0;
	
	public void addOne() {
		counter++;
	}
	
	public void subtractOne() {
		counter--;
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
