package day30_WrapperClass;
// write a program that remove duplicates!

public class WarmUp {
	public static void main(String[] args) {
		String str = RevDup("aabbccDDEEEEFFFFFFF");
		System.out.println(str);
	
		String str2 = UniqueValue("AABBCDEE");
		System.out.println(str2);
	
	
	
	
	}

	public static String RevDup(String str) {
								// "aabbcc"; ==> "abc"
	String result = ""; //to store the non duplicated values
	
		for(int i=0; i<str.length(); i++) {
			if(!result.contains(str.substring(i,i+1))) {
				result += str.substring(i,i+1);
			}
				
		}
			return result;
			
	}
	
	
	// TASK 2: write a program that return non duplicate values
	
	public static String UniqueValue(String str) {
							// "AABBCDEEE" ==> "CD"
		String result = "";  // to store unique characters 
	   //  int count  = 0; // to count number of appearances
	    	
	    	for(int j = 0; j<str.length(); j++) {
	    	int count = 0;
	    		for(int i=0; i<str.length(); i++) {
	    		if(str.charAt(i) == str.charAt(j)) {
	    		count++;	
	    		}
	    	}
	    if(count == 1) {
	    	result += str.substring(j,j+1);
	    		
	    }
	    	}	    		
	    	return result;
	}



























}
