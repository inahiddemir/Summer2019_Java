package day20_JavaRecap;

import java.util.Scanner;

public class WarmUp3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = -99999999;
		
		for(int i=0; i<5; i++) {
		System.out.println("Enter a number: ");
		int inputNum = scan.nextInt();
		if(inputNum>max) {
			max = inputNum;
			}
	
		}
		
		System.out.println(max);
	}

}
