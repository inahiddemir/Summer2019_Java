package day23_Arrays;
import java.util.Scanner;
public class ArraysPractise {
	public static void main(String[] args) {
		String studen1 = "Ibrahim";
		String student2 = "Zuleyha";
		String student3 = "Elina";
	
		String[] AllStudents = {"Ibrahim", "Zuleyha", "Elina"};
		//index:                    0          1         2
		AllStudents[0] = "Marufjon";
		AllStudents[2] = "Muhtar";
		
		System.out.println(AllStudents[2]);
		
		//initialize the array size only without giving value:
		
		int[] array = new int[4]; // this srray can contain 4 values. It's length is 4
		System.out.println(array.length);
		System.out.println(array[1]);
		
		int[] array2;
		// System.out.println(array2[0]); its gonna give compile error because array size must be initialized.
		
		Scanner scan = new Scanner(System.in);
				
				int[] Inputs = new int[10];
			
				for(int i=0;i<Inputs.length;i++) {
					System.out.println("Enter a number: ");
					Inputs[i] = scan.nextInt();
				}
				
				for(int i=0; i<Inputs.length; i++) {
					System.out.print(Inputs[i]+" ");
				}
		
				String[] AllStudentsNames = new String[358];
				// this "new" keyword in array is used to give the size of array only
	
	
	
	
	
	
	
	}
}
