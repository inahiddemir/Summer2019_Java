package day31_JavaReview;

import java.util.Arrays;

public class ArraysReview_Multi2 {
/*
 * n dimensional array: contains (n-1) dimensional arrays.
 * 
 * 
 * 
 */
	public static void main(String[] args) {
	
	int[] arr1D = {1,2,3};
	
	//index            0 1 2     0 1 2 
	int[][] arr2D = { {1,2,3} , {4,5,6} };
	//index              0         1
	System.out.println(arr2D.length); //2
	System.out.println(arr2D[0].length); //3
	
	System.out.println(Arrays.deepToString(arr2D));  // if you do only to string it ll give you hashcode
	
	char[] ch = {'a','b','c','d'};
	
	for(char each:ch) {
		if(each=='c') {
			continue;
		//	System.out.println(each+" "); // as soon as contunie statements executed, it skip the next step
		}
		System.out.print(each+" ");
	}
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
