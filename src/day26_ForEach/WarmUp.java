package day26_ForEach;import java.util.Arrays;

public class WarmUp {

	/* 
	  	write a program that can check if two strings are build out of same letters
	  	example: str1:aabbc, str2: abc   ==> true;    str1:abcd, str2:abc ==> false;
	 */

	public static void main(String[] args) {

		String a = "aabbbc", b ="cbad";
		// a=abc				b=cab
		
		
		String a1 ="" , b1 = ""; // to store all the non duplicated values from a
		
		for(int i=0; i<a.length();i++) {
			if(!a1.contains(a.substring(i,i+1)))
				a1 += a.substring(i,i+1);
		}
		
		for(int i=0; i<b.length();i++) {
			if(!b1.contains(b.substring(i,i+1)))
				b1 += b.substring(i,i+1);
		}
				
		char[]  ch1 = a1.toCharArray();
		System.out.println(Arrays.toString(ch1));
		
		char[] ch2 = b1.toCharArray();
		System.out.println(Arrays.toString(ch2));
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println("=====================================================");
		
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		
		String str1 = Arrays.toString(ch1);
		String str2 = Arrays.toString(ch2);
		
		if(str1.contentEquals(str2)) {
			System.out.println("true, they build out of same letters");
		}else { 
			System.out.println("fasle, there is something different");
		}
		

		
		// SHORTER SOLUTION !!!!!!!!!!!!!!!!!!!!
		
//		String Str1 = "aaaabbbcc",    Str2 = "cccaabbb";
//		
//		Str1 = new TreeSet<String>( Arrays.asList(Str1.split(""))).toString();
//		Str2 = new TreeSet<String>( Arrays.asList(Str2.split(""))).toString();
//		System.out.println(Str1.equals(Str2));
//		
//		
		
}
}
