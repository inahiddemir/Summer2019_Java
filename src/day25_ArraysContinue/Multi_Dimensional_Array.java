package day25_ArraysContinue;
import java.util.Arrays;
public class Multi_Dimensional_Array {

	/*
	 * n dimensional array contains (n-1) dimensional array
	 */
public static void main(String[] args) {
	
int[] arr1D = {1,2,3};

// 2 dimensional array: array that contains multiple 1 dimensional arrays

int[][] arr2D = { {1,2,3} , {4,5,6} };

String[] arr = {"A","B"};

//						0	1       0   1 
String [][] str2D = { {"A","B"} , {"C","D","E"} };
//						  0           1	

//print A:
System.out.println(str2D[0][0]);

//print D:
System.out.println(str2D[1][1]);

//print E:
System.out.println(str2D[1][2]);

//print [A,B]:
System.out.println(str2D[0]);
System.out.println(Arrays.toString(str2D[0]));

// Arrays.deepToString(variable name): converts ""multidimensional"" arrays to string value

//					   0 1     0 1     0 1  	
int[][] Numbers2D = { {1,2} , {3,4} , {5,6,7,8,9,10} };
//						0		1		2 

//print 6:
System.out.println(Numbers2D[2][1]);

System.out.println(Numbers2D[2]);
System.out.println(Arrays.toString(Numbers2D[2]));

//print the entire array
System.out.println(Arrays.deepToString(Numbers2D));

// 3 dimensional array contains multiple 2 dimensional arrays

int[][][] Array3D = { { {1,2}, {3,4} }, { {5,6}, {7,8} } };

// going to work


























}
}
