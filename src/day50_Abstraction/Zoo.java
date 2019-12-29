package day50_Abstraction;

public class Zoo {

	public static void main(String[] args) {
		Cat Milka = new Cat('F', (byte)5, "White", "Milka");
		
		System.out.println("Name is "+Milka.NickName);
		System.out.println("Gender is "+Milka.Gender);
		System.out.println("Color is "+Milka.color);
		System.out.println("Age is "+Milka.Age);
		System.out.println("=================================================================");
		
		Milka.getInfo();
		System.out.println("==================================================================");
	
		Cat misha = new Cat('F', (byte)6, "Black & White", "Misha");
		
		misha.getInfo();
		System.out.println("===================================================================");
		misha.Sleep(15);
		misha.Eat("chicken");
		misha.Drink("milk");
		misha.Speak("meow");
		System.out.println("===================================================================");
		
		Dog Luka = new Dog('F',(byte)8, "black","Luka");
		
		Luka.getInfo();
		Luka.Speak("English");
		Luka.Eat("Fish");
		Luka.Drink("Vodka");
		Luka.Sleep(7);
		System.out.println("====================================================================");
		
		Dog Tuzik = new Dog('M', (byte)12, "Black", "Tuzik");
		
		Tuzik.getInfo();
		Tuzik.Drink("redbull");
		Tuzik.Eat("Hot dog");
		Tuzik.Sleep(10);
		Tuzik.Speak("Kyrgyz woof");
		
		Dog[] dog = {Luka, Tuzik };
		
		Cat[] cat = {Milka, misha};
		
		System.out.println("=============================++++++++++++++========================");
		Animal misha2 = new Cat('F', (byte)1, "Black & White", "Misha2");
		Animal milka2 = new Cat('F', (byte)2, "White", "Milka2");
		Animal luka2 = new Dog('M', (byte)3, "Black", "Luka2");
		
		Animal[] all_my_animals = new Animal[] {misha2, luka2, milka2};
		for(Animal animal: all_my_animals)
		{
			animal.getInfo();
		}
		
	}
}
