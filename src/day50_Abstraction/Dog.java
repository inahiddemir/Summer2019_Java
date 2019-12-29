package day50_Abstraction;

public class Dog extends Animal {

	public Dog(char Gender, byte Age, String color, String NickName) {
		super(Gender, Age, color, NickName);
		
	}

	@Override
	public void Speak(String language) {
		System.out.println(NickName+" is speaking "+language);
	}

	@Override
	public void Eat(String food) {
		System.out.println(NickName+" is eating "+food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(NickName+" is sleeping "+hour+" hours");
		
	}

	@Override
	public void Drink(String drink) {
		System.out.println(NickName+" drinks "+drink);
		
	}
	
	
	
}
