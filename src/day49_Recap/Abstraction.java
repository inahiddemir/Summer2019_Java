package day49_Recap;

public abstract class Abstraction {

	public abstract void startTheCar();
	
	
}

class Toyota extends Abstraction{
	
	
	@Override
	public void startTheCar() {
		System.out.println("Brake");
		System.out.println("push the start button");
		System.out.println("Release the break");
		
		
	}
	
	public static void main(String[] args) {
	//	Abstraction obj = new Abstraction();
		
	}
		 
}

class Tesla extends Abstraction{
	//regular class must implement the abstract methods from the abstract class

	@Override
	public void startTheCar() {
		System.out.println("voice control");
		System.out.println("driver");
		 
	}

}