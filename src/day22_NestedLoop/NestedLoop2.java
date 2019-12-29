package day22_NestedLoop;

public class NestedLoop2 {
	public static void main(String[] args) {
		
		int i=1;
		while(i<=10) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		i++;
		}
	}
}
