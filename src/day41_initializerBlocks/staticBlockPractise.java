package day41_initializerBlocks;

import java.util.*;

public class staticBlockPractise {

	public static String name;					//"erhan" , "suna" , "mehmet"

	public static int[] arr1;
	
	public static ArrayList<String> list = new ArrayList<>();
	
	public static ArrayList<String> students = new ArrayList<>();
	
	public static String[] online = {"Arzigul","Me","Spike","Savas","Bahadir"};
	
	public static String[] inClass = {"Daryna","Nadire","Olga","Mizgin"};
	
	static double a = 100;
	
	public int grade;
	
	static {
		name = "Erhan";
		arr1 = new int[3];     //{0,0,0}
		arr1[1] = 2;		   //{0,2,0}
		
		list.add("Break");
		
		students.addAll(Arrays.asList(online));
		
	}
	
	static {
		name = "Suna";
		arr1 = new int[5];    	//{0,0,0,0,0}
		arr1[0] = 1;			//{1,0,3,0,0}	
		arr1[2] = 3;			//{1,0,3,0,0}
	
		list.add("Coffee");
		list.add("Tea");
	
		students.addAll(Arrays.asList(inClass));
		
		a=400;
		
	}
	
	
	
	public staticBlockPractise() {
		name = "Mehmet";			//execution depends on creation on the object
		
		grade = 1000;
	}
	
	//there is no object instances in any static, so therefore static does not accept nonstatic things
	
	//in order to call none static in a static feature, we need to call it through object
	
	public static void main(String[] args) {
		
		staticBlockPractise obj1 = new staticBlockPractise();
		
		System.out.println(name);    //null
		
		System.out.println(Arrays.toString(arr1));
	
		System.out.println(list);
		
		System.out.println(students);
		
		a=500;
		
		System.out.println(a);
		
		System.out.println(obj1.grade);
	}
 



}
