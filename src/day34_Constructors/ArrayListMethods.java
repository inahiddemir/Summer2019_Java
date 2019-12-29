package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	/*
	 	remaining methods: 
	 	
	 	indexOf() , lastIndexOf()
	 	
	 	converting array to ArrayList
	 	
	 	removeAll(), addAll();
	
	 ================================================
	 
	 indexOf(object) ==> return the index number of given object in array
	 
	 
	 */
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
		list.add(1);  //auto boxing
		list.add(Integer.valueOf("33")); // none
		list.add(Integer.parseInt("100")); // auto boxing
		list.add(200);
		list.add(20);
		list.add(1);
		
		// indexOf(object): returns the index number of the given object from Arraylist
		 //if it returns negative number, it means the given object is not exist 
		int a = list.indexOf(11); // auto bozing
		System.out.println(a);
	
		int a2 = list.indexOf(200);
		System.out.println(a2);

// lastIndexOf(object): returns the last occured object index number of given 
		int a3 = list.indexOf(1);
		int a4 = list.lastIndexOf(1);
		System.out.print(a3+" "+a4);
		System.out.println();


// Arrays.asList: converting array to arraylist

Integer[] arr = {1,2,3,4,5};

ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(arr)); 
	list2.add(100);  //whicever object you add after array, object placed at the end of the ArrayList
	


System.out.println(list2);

String[] arr2 = {"Java", "Phyton", "C#", "C++"};

ArrayList<String>list3 = new ArrayList<>(Arrays.asList(arr2));

// isEmpty(): checks if the arraylist is empty and returns boolean expression

System.out.println(list3.isEmpty());
list3.add("F");


System.out.println(list3);

int[] arr3 = {1,2,3,4,5};
// ArrayList<Integer>list4 = new ArrayList<>(Arrays.asList(arr3));
						//only the object arrays can be converted so that you got compile error

//addAll(Interface): Used for storing the multiple objects

String[] allaNames = {"Hakan", "Alexis", "Rahwa", "Erhan", "Holy"};


ArrayList<String>names = new ArrayList<>();

	names.addAll(Arrays.asList("Almaz", "Ibrohim" , "Tabi"));

	names.addAll(Arrays.asList(allaNames));
	
	System.out.println(names);
	
//removeAll(Interface): 
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,4,4));
	System.out.println(numbers);
	
	numbers.removeAll(Arrays.asList(1,2));
	System.out.println(numbers);
	
	//removed() method not designed to be used with in the loop
	
	ArrayList<Integer> lis = new ArrayList<>();
	
	lis.addAll(Arrays.asList(1,1,1,2,2,3,3,4,2,1));
	
	System.out.println(lis);
	
	for(int i=0; i<lis.size(); i++) {
		if(lis.get(i)==1) {
			lis.remove(i);
		}
	}
		System.out.println(lis);

/* sorting the array:
		
		Arrays.sort(VariableName);
		Arrays class is presented in "java.util" package

sorting the arraylist:
Collections.sort(VariableName)
Collections class is represented in java util
*/

// arraylist sorting:
		
		Integer[] array = {1000,900,80,765,123, 542};
		
		ArrayList<Integer> price = new ArrayList<Integer>();
		
		price.addAll( Arrays.asList(array));
		System.out.println(price);
		
		
		Collections.sort(price);
		System.out.println(price);
		
		



























}	
}
