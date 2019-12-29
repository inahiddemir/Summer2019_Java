package day45_Inheritance;

import java.util.Arrays;
import java.util.ArrayList;

class credentials{
	
	private String userName;
	private String passWord;
	
	
	public credentials() {
		setuserName("admin");
		setpassWord("123");
	}
	
	//getter:
	public String getuserName() {
		return userName;
	}
	
	public String getpassWord() {
		return passWord;
	}
	
	//setter:
	
	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public void setpassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void setcredentials(String userName, String passWord) {
		// this.userName = userName;
		// this.passWord = passWord;
		
		setuserName(userName);
		setpassWord(passWord);	
	}
	
	public void getInfo() {
		System.out.println("username: "+getuserName());
		System.out.println("password: "+getpassWord());
	}
	
}




public class EncapsulationsReview {

	public static void main(String[] args) {
		credentials Zlfy = new credentials();
		//obj.userName = "Zlfy";    //private is only visible within the class
		//obj.passWord = "123456";  //private is only visible within the class
		
		//read:
		System.out.println(Zlfy.getuserName());
		System.out.println(Zlfy.getpassWord());
		
		Zlfy.setcredentials("Zlfy", "111");
		
		credentials Nurzat = new credentials();
		
		Nurzat.setuserName("9876");
		Nurzat.setpassWord("Nuri345");
		System.out.println("username: "+Nurzat.getuserName());
		System.out.println("password: "+Nurzat.getpassWord());
		
		credentials Seyfo = new credentials();
		Seyfo.setcredentials("Seyfo", "456");
		
		System.out.println("username: "+Seyfo.getuserName());
		System.out.println("password: "+Seyfo.getpassWord());
		Seyfo.getInfo();
		
		System.out.println("======================================================================");
	
		credentials[] users = {Zlfy, Nurzat, Seyfo};
		
		for(int i=0; i<users.length; i++) {
			users[i].getInfo();
		}
		System.out.println("========================================================================");
	
		ArrayList<credentials> CredentialsList = new ArrayList<>();
			CredentialsList.addAll(Arrays.asList(Zlfy, Nurzat, Seyfo));
			
			for(credentials each : CredentialsList)
			each.getInfo();
	}
}
