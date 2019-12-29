package day24_JavaRecap;
/*
 Find the minimum
 Find the secind minimum
 */
public class WarmUp2 {
	public static void main(String[] args) {
	int[] arr = {100, 2, 2, 3, 4, 5, 6 };
		int min = 999999999;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min = arr[i];
		}
	}

	System.out.println("Minimum number is: "+min);
	
	int secondMin = 9999999;
	for(int j=0;j<arr.length;j++) {
		if(arr[j]<secondMin && arr[j]!=min )
			secondMin = arr[j];
	}
	System.out.println("Second minimum number is: "+ secondMin);
	
	
	}
}
  