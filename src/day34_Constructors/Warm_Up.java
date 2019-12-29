package day34_Constructors;

import java.util.*;

public class Warm_Up {
	
public static void main(String[] args) {
	
	int count = count("abccdabcdaaaaa","a");
	System.out.println(count);

	String hele = frequency("nabernaptin");
	System.out.println(hele);
	
	
	//task4
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(0);
	list.add(30);

	int maxnum = maximum(list);
	System.out.println(maxnum);
	
	int minnum = minimum(list);
	System.out.println(minnum);
}

//task1
public static String removeDup (String a) {
	
	String result = "";
	
	for(int i=0; i<a.length(); i++) {

		if(!result.contains(a.substring(i, i+1))) {
			result += a.substring(i,i+1);
		}
			
			
	}
	return result;
}



// task 2
public static int count (String str1, String str2) { //	write a method that accepts two strings and show how much time String "b" occured in String "a"
						//abab        a      ==>1
						// bab        a      ==>2
	
	int count =0; // to count how many times b is appeared in a

	
		while(str1.contains(str2)) {
		count++;
		str1 = str1.replaceFirst(str2,"");
	}


   return count;
}

//task 3
public static String frequency (String str) { // write a method that shows frequency of each character in string by using other methods in this class
							// ABCABCABC ==> a3b3c3
	
	String nonDup = removeDup(str); // to store the expected result
	
	String result = ""; // to store the expected result
	
	for(int i=0; i<nonDup.length(); i++) {

		int count = count(str, nonDup.substring(i,i+1));
		result += nonDup.substring(i,i+1) + count;
	}
	
	return result;
}

//task 4
public static int maximum (ArrayList<Integer> list) {

	int max = Integer.MIN_VALUE;
	
	for(int each : list) {
		if(each > max) {
			max = each;
		}
	}
		return max;
}

//task5
public static int minimum(ArrayList<Integer> list) {
	int min = Integer.MAX_VALUE;
	
	for(int each : list) {
		if(each < min) {
			min = each;
		}
	}

	return min;
}





}
