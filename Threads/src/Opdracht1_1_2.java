
class Opdracht1_1_2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0 ;i<20;i++){
		System.out.println("Singing.......");
		} 
	}
}
class Tijdelijk implements Runnable {
	@Override
	public void run() {
		for (int i = 0 ;i<20;i++){
		System.out.println("allo.......");
		}
	}
}

class SingAndDance2 {
	public static void main(String args[]) {
		System.out.println("opdracht112");
		Thread sing = new Thread(new Opdracht1_1_2());
		Thread dance = new Thread(new Tijdelijk());
		sing.start();
		dance.start();
		System.out.println("en klaar is klara");
	}
}