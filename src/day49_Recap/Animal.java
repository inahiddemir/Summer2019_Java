package day49_Recap;

public abstract class Animal {

	public abstract void eat();

	public abstract void sleep();
	
	
}


//concrete
class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("fish");
	}
	
	@Override
	public void sleep() {
		System.out.println("10 hours");
	}
	
} 

class KingKong extends Animal{
	
	public void eat() {
		System.out.println("Humans");
	}

	public void sleep() {
		System.out.println("8 hours");
	}
}

class Test{
	public static void main(String[] args) {
		
	
	KingKong obj = new KingKong();
	obj.eat();
	}
}
