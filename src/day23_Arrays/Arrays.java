package day23_Arrays;

public class Arrays {
	public static void main(String[] args) {
		/*
		 	Arrays:
		 	
		 	
		 */
	
	int[] arr = {10,20,30,40,50};
	//index num: 0   1  2  3  4
	// arr[4] = 50
	// arr[0] = 10
	
	String[] names = {"Nigar", "Sumeyya", "Madina", "Juline"};
	
	System.out.println(names[0]);
	System.out.println(names[1]);
	System.out.println(names[2]);
	System.out.println(names[3]);
	
	String str1 = names[1];
	String str2 = names[2];
	
	System.out.println("======================================================================================");
	System.out.println(str1);
	
	double[] myArray = {1,2,3,4,5,8,0,2};
	//index:            0 1 2 3 4 5 6 7
	
	for(int i=0;i<8;i++) {
		System.out.print(myArray[i]+" ");
	}
	System.out.println();
	int[] Numbers = { 12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }; 
	int B = Numbers.length; //length of array
	System.out.println(B);
	int highestIndexNum = Numbers.length-1;
	System.out.println(highestIndexNum);
	
	for(int i =0; i<Numbers.length; i++) {
		System.out.print(Numbers[i]+" ");
	}
	System.out.println();
	char[] myChars = {'A', 'B', 'C', 'D'};
	int highestIndexNum2 = myChars.length-1;
	System.out.println(highestIndexNum2);
	
	
	
	
	
	
	
	
	
	
	
	}
}
