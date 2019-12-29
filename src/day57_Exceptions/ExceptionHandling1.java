package day57_Exceptions;

import java.util.*;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		int number[] = {100,200,300};
		
		
		
		try {
		
			System.out.println(number[5]);
			System.out.println("Try block, Checked exception");
		
		}catch(ArrayIndexOutOfBoundsException anyname) {
			
			System.out.println("Catch block, unchecked exception");
		}
		
		
System.out.println("=================================================================================================");
		
		
	try {
		
		Thread.sleep(2000);
		System.out.println("Try block, Checked exception");
		
	}catch(InterruptedException e){
		
		System.out.println("Catch block, unchecked exception");
		
	}
		
		
		System.out.println("Work Done");
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3));

		
		try {
			System.out.println(list.get(10));
			System.out.println("checked Exception occured in arraylist");
		}catch(RuntimeException e) {
			System.out.println("unchecked Exception occured in arrayList");
		}
		
		//parent exception class can handle child class' exceptions
		
		
	}

	

	public static void method(String kfc) {
		
	}
		

}
