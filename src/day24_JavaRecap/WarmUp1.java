package day24_JavaRecap;

public class WarmUp1 {
/*
  Write a program return the max value from an int array
  
  Write another program that return the second maximum value of from an int array
 */
	public static void main(String[] args) {
		
	int[] arr = {20, 200, 30, 40, 50, 500 };
	int max =0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	System.out.println(("Maximum number is: "+max));
	
	int secondMax = 0;
	for(int j=0;j<arr.length;j++) {
		if(arr[j]>secondMax && arr[j]!=max) {
			secondMax = arr[j];
		}
	}
	System.out.println("Second maximum number is: "+secondMax);
	
	
	
	
	
	}
}
