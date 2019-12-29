package day30_WrapperClass;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		
		/*
		 		Declaration of arraylist:
		 			ArrayList<ClassType>variablename = new ArrayList<>();
		 */
		
			int[] array1 = new int[1];
		
		
	ArrayList<Integer> list = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
			list2.add(10); // auto boxing (you convert int to integer)
			list2.add(20);
			list2.add(30);			// if the value is primitive 
		//  [10,20,30]	
	//index:  0  1  2  
			
			// ArrayList size is dynamic, its automatically adjusted 
			// ArrayList is ordered. That means it has index numbers
			
			System.out.println(list2);
		//	System.out.println(list2[2]);  index number is not working on arraylist. you have to use the "" get()  "" method
			System.out.println(list2.get(1));
		//  System.out.println(list2.get(9));    you will get IndexOutOfBound message
			
			System.out.println(list2.size()); //3    // size() method return the length (total number of values inside) 
			
			list2.clear();              // after this command whole values inside array is gone.
			System.out.println(list2);
			
	
	
	
	
	
	
	
	
	}
}
