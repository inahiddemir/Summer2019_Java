package day26_ForEach;

public class ForEach_MultiD {
	public static void main(String[] args) {
		
		//n dimensional array containd multiple (n-1) dimensionals arrays

	int[] arr1D = {1,2,3,4};
	
	int[][] arr2D = { {1,2,3,4} , {5,6,7,8} };
		//					0			1
	
	for (int i=0; i<arr2D.length; i++) {
		// counts the 1D arrays 
		for(int j=0; j<arr2D[i].length; j++) {
			System.out.println(arr2D[i][j]);
		}
	}
	
	for (int[] each1 : arr2D) {
		for(int each2 : each1) {
			System.out.print(each2+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
