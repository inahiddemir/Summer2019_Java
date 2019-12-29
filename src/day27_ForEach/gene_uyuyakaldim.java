package day27_ForEach;
import java.util.Arrays;

public class gene_uyuyakaldim {
	public static void main(String[] args) {
		 int[] numbers = new int[100];
		 
		 
		 for(int i=0;i<100;i++) {
			 numbers[i] = i;	 
		 }
		 System.out.println(Arrays.toString(numbers));
	
		 for(int each : numbers) {
			 
			 if(each%2==0)
				 System.out.print(each+" ");
		 
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

	