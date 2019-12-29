package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {
	public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
	//add(): takes an object
	list.add(10); //Auto-Boxing
	list.add(20);
	System.out.println(list);
	
	
	//add(index, object):  it will insert the given object at the given index number
	
	list.add(1,30);
	// list.add(4,40); // arraylist size is dynamic. You cannot skip indexes.
	list.add(3,50);
	//get(index number): returns the object at the given index number
	//50:
	System.out.println(list.get(3));
	//30:
	System.out.println(list.get(1));
	
	// size(): returns the total number of elemenets in the list (similar with length)
	
	System.out.println(list.size()); //4
	//last index number: last.size()-1
	
	for(int i =0; i<list.size(); i++) {
		System.out.print(list.get(i)+" ");
	}
	
	for(int i=list.size()-1; i>=0; i--) {
		System.out.print(list.get(i)+" ");
	}
	
	//clear(): removes all the objects from arraylist
	
	list.clear();
	System.out.println(list);
	
	//set(index, object): it replaces the index with given object;
	
	ArrayList<String> students = new ArrayList<>();
	students.add("Erhan");
	students.add("Homayra");
	students.add("Rahwa");
	students.add("Arzu");
	System.out.println(students);
	
	students.set(1, "Nahid");
	System.out.println(students);
	
	//students.set(5."asdasd")// it gives you compile error. you have to give the existing index number
	
	//indexOf(Object): returns the first matching object's index number
	
	students.add("Rahwa");
	System.out.println(students);
	
	System.out.println(students.indexOf("Rahwa"));
	
	
	//lastIndexOf(Object): returns the last matching objects index number
	System.out.println(students.lastIndexOf("Rahwa"));
	
	ArrayList<String> students2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
	
	System.out.println(students.equals(students2));
	
	students = students2;
	System.out.println(students.equals(students2));
	System.out.println(students2);
	System.out.println(students);
	
	students.set(0,"C");
	students.set(2, "A");
	System.out.println(students);
	System.out.println(students.equals(students2));
	 
	//contains(Object): checks if the given object is contained in the arraylist
	
	System.out.println(students);
	System.out.println(students.contains("Muhtar")); //false
	System.out.println(students.contains("A"));  //true
	
	//isEmpty(): checks if teh arraylist size is 0 nor not
	
	ArrayList<String> nahid = new ArrayList<>();
	System.out.println(nahid.isEmpty());
	
	//remove(primitive int): remove the given index number
	
	ArrayList<Integer> price = new ArrayList<>();
	price.add(1);
	price.add(2);
	price.add(3);
	
	price.remove(1);
	
	System.out.println(price);
	
	ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,3,1));
	// you shouldn't use the remove method with in the loop
	
	/*
	for(int i=0; i<nums.size(); i++) {
		if(nums.get(i)==1) {
			nums.remove(i);
		}
	}
	
	System.out.println(nums);
	
	use the method below instead;
	*/
	
	nums.removeAll(Arrays.asList(1,2));
	System.out.println(nums);
	
	//addAll(Interface): adds multiple objects to the ArrayList
	
	ArrayList<String> n1 = new ArrayList<>();
	n1.addAll(Arrays.asList("Yasin","Tarik","Ruslan"));
	System.out.println(n1);
	
	//Collections.sort(ArrayList): sorts the array in ascending order
	Integer[] arr = {1,2,3,4,5,5,5,100,-100,-9};
	
	ArrayList<Integer> listss = new ArrayList<>(Arrays.asList(arr));
	
	System.out.println(listss);
		
		Collections.sort(listss);
		System.out.println(listss);
		
	
	
	
	
	
	
	
	
	
	
	
	
}
}
