package day33_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
/*
 		ArrayList :
 		
 		
 		presented in "java,util"
 		
 		does not support primitives, we can only store objects	
 		
 		ArrayList size is dynamic, adjusted automatically
 		
 		Arraylist is an ordered collection of values (index number).
 		
 		We can add or remove objects from ArrayList
 		
 		
 		
 		
 		
 		declaration of ArrayList:
 		
 		ArrayList<NonPrimitive> variableName = new ArraList<NonPrimitive>();
 		
 		ArrayList<NonPrimitive> variableName = new ArraList<>();  //(preferred way)
 		 
 		
 		
 		
 		declaration of array:
 		
 		int[] arr = new int[5];
 
 		
 		
 		
 		ArrayList vs Array: 
 		
 		ArrayLists size is dynamic, Array size is fixed
 		
 		ArrayList only supports nonprimitives, Array support all
 		
 		Array can be multi-dimensional but ArrayList cannot be multi-dimensional
 
	
		
		methods of arraylist:
		
		add(object): adds objects to arraylist
		
		get(index): gets the data from arraylist
		
		size(): returns the length of arraylist as int
		
		clear(): removes everything from arraylist
		
		set(index number, object): it replace the object with the given object at the given index number
 */
public static void main(String[] args) {
	
	//declaration of arraylist:
	
	ArrayList<String> list = new ArrayList<String>();
	
	ArrayList<String> list2 = new ArrayList<>();
	
// add:
	
	ArrayList<String> shopphingList = new ArrayList<>();
	
	shopphingList.add("apple");  //index:0 , size: 1
	shopphingList.add("orange"); // index: 1, size: 2
	shopphingList.add("grape"); // index: 2 , size 3

	System.out.println(shopphingList);

// add(index, object): adds the object at the given index number

	shopphingList.add(0,"Strawberry");
	System.out.println(shopphingList);

	shopphingList.add(4,"Toyota Corolla");   // it does not skip the indexes
	System.out.println(shopphingList);

	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	numbers.add(0,5);  // [5] 
	numbers.add(1,10); // [5,20]
	numbers.add(2,15); // [5,10,15]
	
	numbers.add(1,1); //  [5,1,10,15]
	numbers.add(1,6); //  [5,6,1,10,15]
	
	System.out.println(numbers);
	
	
// get(index number): returns the object at given index number	
	
	ArrayList<String> names = new ArrayList<>();
	
	names.add("Homayra");
	names.add("Meri");
	names.add(1, "Mikrigul");
	names.add(1, "Tabriz");
	names.add(0, "Asiya");
	
	String str1 = names.get(1); 
	System.out.println(str1);
	
	
	//size(): returns the length of the arraylist as an Int value
	
	int length = names.size();
	System.out.println(length);
	
	for(int i=0; i<names.size(); i++) {
		String each = names.get(i);
		System.out.println(each);
	}
	
	System.out.println();
	
	for( String peach : names) {
		System.out.print(peach+" ");
	}

	//clear():
	
	System.out.println();
	
	ArrayList<String> students = new ArrayList<>();
	
	students.add("Holy");
	students.add("Erhan");
	students.add("Nadire");
	students.add("Nadira");
	students.add("Seyfo");
	students.add("Cihan");
	
	System.out.println(students);
	students.clear(); // clear all the objects from the arraylist
	
	System.out.println(students);

	//set(index number, object):
	
	
	ArrayList<String> Javengers = new ArrayList<String>();
	
	Javengers.add("Ferhat");
	Javengers.add("Lexi");
	Javengers.add("Asiya");  // "Shawkrat
	Javengers.add("Ozgen");
	Javengers.add("Alex");
	Javengers.add(1, "Safwan");
	
	System.out.println(Javengers);
	
	Javengers.set(2, "Shawkrat");
	
	System.out.println(Javengers);		
	
	
	//contains(): checks if the given object is contained in the ArrayList or not. Then return a boolean value
	
	ArrayList<String> goodGuys = new ArrayList<>();
	
	goodGuys.add("Hakan");
	goodGuys.add("Ihsan");
	goodGuys.add("Tim");
	goodGuys.add("Ibrahim");
	goodGuys.add("Dilyar");
	
	boolean result = goodGuys.contains("Tim");
	
	System.out.println(result);
	
	// equals(): Used to check if 2 ArrayLists are equal or not. Then return a boolean value
	
	ArrayList<String> badGuys = new ArrayList<>();
	
	badGuys.add("Hakan");
	badGuys.add("Ihsan");
	badGuys.add("Tim");
	badGuys.add("Ibrahim");
	badGuys.add("Dilyar");
	
	boolean result2 = badGuys.equals(goodGuys);
	System.out.println(result2);
	
	//remove(int): removes the given index.  
	
	
	ArrayList<Integer> lists = new ArrayList<>();
	
	lists.add(1); // index 0  // Araaylists only accept objects NOT primitives. So you add a number in ArrayList is auto-boxing
	lists.add(2); // index 1
	lists.add(3); // index 2
	lists.add(4); // index 3
	lists.add(5); // index 4
	
	lists.remove(1); // [ 1, 3, 4, 5]
	System.out.println(lists);
	System.out.println(lists.size());
															System.out.println();
	lists.remove(2);
	System.out.println(lists);
	System.out.println(lists.size());
															System.out.println();
	lists.remove(1);
	System.out.println(lists);
	System.out.println(lists.size());
															System.out.println();
	//remove(Integer): removes the first matching object at the same time it returns a boolean value
															
	ArrayList<Integer> lists2 = new ArrayList<>();
	
	lists2.add(1); // index 0  
	lists2.add(2); // index 1
	lists2.add(3); // index 2
	lists2.add(4); // index 3
	lists2.add(5); // index 4												
	
	//[1,2,3,4,5]
	
	Integer a = 6;
	boolean r1 = lists2.remove(a);
	
	System.out.println(lists2);
	System.out.println(r1);
	
	ArrayList<String> city = new ArrayList<>();
	
	city.add("Miami");
	city.add("Miami");
	city.add("Gotham");
	city.add("Azarbaijan");
	city.add("Istanbul");
	city.add("Urumqi");                                      //  [Miami, Miami, Gotham, Azarbaijan, Istanbul, Urumqi]
	
	city.remove("Miami");  // it ll remove the first "Miami"     [Miami, Gotham, Azarbaijan, Istanbul, Urumqi]
	
	if(city.remove("Miami")) {
		city.remove(2); 
	}
	
	System.out.println(city);











}
}
