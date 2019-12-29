package day50_Abstraction;

public class Cat extends Animal {
	
	public Cat(char Gender, byte Age, String color, String NickName) {
		super(Gender, Age, color, NickName);

	}
	
	@Override
	public void Sleep(int hour) {
		System.out.println(NickName+" sleeps "+ hour+" hours");
	}

	@Override
	public void Speak(String language) {
		System.out.println(NickName+" speaks "+language);
		
	}

	@Override
	public void Eat(String food) {
	System.out.println(NickName+" eats "+food);
		
	}

	@Override
	public void Drink(String drink) {
		System.out.println(NickName+" drinks "+drink);
		
	}
	
	
	
	
	// Cat myCat = new Cat();
	
	
	
	
	
	
	
	
	
}


