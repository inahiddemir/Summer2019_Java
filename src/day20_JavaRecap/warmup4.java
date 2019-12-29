package day20_JavaRecap;

public class warmup4 {
	public static void main(String[] args) {
		
		for (char ch='a';ch<='z';ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
		for (char c = 'A'; c<='Z';c++) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		String name = "Cybertek School Batch 12";
		System.out.println(name.length());
		
		name = name.replace(" ", "");
		System.out.println(name.length());
		
		name = name.replace("School", "Family");
		System.out.println(name);
		
		
		
		// replaceFirst method replaces the first occured old character with the given caharacter(s)
		
		String A1 = "Java is Fun, Java is object oriented";
		A1 = A1.replace("Java","C++");    // if you use replaceFirst instead of replace it ll write : "C++ is Fun, Java is object oriented".. You can try its free
		System.out.println(A1);
		
		String A2 = "Java is Fun, Java is object oriented, Java is cool";
		A2 = A2.replace("Java is o", "C++ is o");
		System.out.println(A2);
		
		
	String B1 = "Cybertek"; // String pool
	String B2 = new String ("Cybertek");	//heap
	String B3 = new String ("cybertek");   // heap
		
	System.out.println(B1==B2); //false
	System.out.println(B1.equals(B2)); // true
	System.out.println(B1.equals(B3)); // false
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

