package day29_ReturnMethods;

public class WarmUp {
/*
 	write a program hat can find the frewquency of characters.
 */

	public static void main(String[] args) {
		
		String str = "aabbaaabbbcccccDD";
		
		// expected result: a5b5c5D2
		// letters: "abcD";
		
		String RemoveDup = ""; //to store the non duplicated values
		String result = "";
		for(int i=0; i<str.length(); i++) {
			if(!RemoveDup.contains(str.substring(i,i+1))) {
				RemoveDup +=str.substring(i,i+1);
			}
		}
			System.out.println(RemoveDup);
		
			for(int j=0; j<RemoveDup.length(); j++) {
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(str.substring(i,i+1).equals(RemoveDup.substring(j,j+1))) {
				count++;	
				}
			}
				result += RemoveDup.substring(j,j+1) + count;
			}
		
			System.out.println(result);
		
	//======================================================================================================================================================//
			System.out.println("======================================================");
			
			String input = "XXXYYYZZZ";
			
			String nonDuplicates = "";  //remove the duplicates from input and store it
			
			for(int i=0; i<input.length();i++) {
				if(!nonDuplicates.contains(""+input.charAt(i))) {
					nonDuplicates += ""+input.charAt(i);
				}
			}
			System.out.println(nonDuplicates);
		// input = "XXXYYYZZZ";       nonDuplicates = "XYZ";
			
		// expectedResult = "X3Y3Z3";
			String expectedResult="";
		for (int j=0; j<nonDuplicates.length(); j++) {	
			int times = 0; // count the occurence of X
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i)==nonDuplicates.charAt(j)) {
					times++;
				}
			}
		expectedResult += ""+ nonDuplicates.charAt(j) + times;
		}
			System.out.println(expectedResult);
		
		
		
		
		
		
		
	}

}
