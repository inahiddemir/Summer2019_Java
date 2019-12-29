package day23_Arrays;

public class warmup3 {
/*
  write a program that says how many times each character occurs in then string.	
 */
	public static void main(String[] args) {
		String str = "ALL THE LETTERS";
		String unique ="";   //to store all the unique chars from string
		
		for(int j=0; j<str.length(); j++) {
			int count=0;
		
			for(int i=0; i<str.length(); i++) {
				if(str.substring(i,i+1).equals(""+str.charAt(j))) {
												//or you can use str.substring(j,j+1)	
					count++;
				}
			
			
		}
			if(count==1) {
				unique+=str.charAt(j);
			}
		}
		
		
		System.out.println(unique);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
