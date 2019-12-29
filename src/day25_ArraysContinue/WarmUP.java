package day25_ArraysContinue;

public class WarmUP {
/*
 	write a program that find the unique values from an int Array
 */
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,2,2,2,3,4,4,8,7,9};
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count = 0;								// to find out how many times a value is appeared in array
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {			// compare each index of array 
					count+=1;		// every time value occured count getting one more
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
	}
}
