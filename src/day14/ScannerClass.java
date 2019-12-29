package day14;

import java.util.*;

// Scanner must be imported from java.util.Scanner and must be placed between package and class !!

public class ScannerClass {
	public static void main(String[] args) {

		Scanner iput = new Scanner(System.in);
		
		System.out.println("Enter A Byte value");
		byte byteNum = iput.nextByte();

		System.out.println("You have entered: " + byteNum);

		System.out.println("Enter a Byte value 2");
		byte byteNum2 = iput.nextByte();

		System.out.println("You have entered: " + byteNum2);

		System.out.println("Addition is: " + (byteNum + byteNum2));
	}
}
