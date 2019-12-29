package day19_Forloop;

public class Tasks {
	public static void main(String[] args) {
		
		// Task01
		for(int i=1; i<=10; i++) {

			System.out.println("The square of " +i+" is "+i*i);
		}
	
		// Task02
		
		for(int j=1; j<33; j++) {
			if(j%2==0) {
				System.out.print(j + " ");
				j++;
			}
		}
		System.out.println();
		//Task03
		
		for(int k=1; k<33; k++) {
			if(k!=0) {
				System.out.print(k+" ");
				k++;
			}
		}
	
	}
	
}
