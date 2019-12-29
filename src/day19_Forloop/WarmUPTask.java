package day19_Forloop;

import java.util.Scanner;

public class WarmUPTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your username with your email: ");
		String username = sc.nextLine().toLowerCase(); // toLowerCase command make it guaranteed (GmAil.com)
		System.out.println(username);
		System.out.println("Please enter your password: ");
		String pass = sc.nextLine();
		
		String originalname = "cybertek.batch12@gmail.com";
		String password = "Javengers";
		
		if(username.endsWith("@gmail.com")) {
			if(username.equalsIgnoreCase(originalname) && pass.equals(password)){
				System.out.println("You have logged in successfully :)");
			}else {
				System.out.println("Invalid password or username !");
			}
			
		
		} else {
			System.out.println("It's naot a valid e-mail address");
		}
				
		
		
			
	}

}
