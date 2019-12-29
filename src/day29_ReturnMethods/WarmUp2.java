package day29_ReturnMethods;

public class WarmUp2 {
	public static void main(String[] args) {
		String str = "AABBCCDD";
		String expectedResult = "";
		
		for(int j=0; j<str.length(); j++) {
			int count=0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
	
		expectedResult +=""+str.charAt(j)+count;
		str = str.replace(""+str.charAt(j),""); // after adding the str.charAt(j)		
		
		}
		System.out.println(expectedResult);
		System.out.println(str);
	
	
	// YUKARIDAKI KOD HATALI CALISIYOR. INPUT AABBCCDD IKEN SONUC A2B2D2 OLUYOR, C LERI YUTUYOR. BUG I BULMAK LAZIM !!!!!!!!!!!
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
