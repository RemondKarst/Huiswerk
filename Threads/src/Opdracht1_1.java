class Opdracht1_1 extends Thread {

	public void run() {
		for (int i = 0 ;i<20;i++){
			System.out.println("allo.......");
			} 

	}

}
class Tijdelijker extends Thread {

	public void run() {
		for (int i = 0 ;i<20;i++){
			System.out.println("Singing.......");
			} 
	}

}

class SingAndDance {
	public static void main(String args[]) {
		System.out.println("opdracht die andere");
		Thread sing = new Opdracht1_1();
		Thread dance = new Tijdelijker();
		sing.start();
		dance.start();

		System.out.println("en klaar is klara");
	}
}