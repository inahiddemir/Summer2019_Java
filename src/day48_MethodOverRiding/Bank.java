package day48_MethodOverRiding;

public class Bank {

	
	public void InterestRate() {
		System.out.println("9 percent");
	}
	
	public static void main(String[] args) {
		BankOfAmerica BOA = new BankOfAmerica();
				BOA.InterestRate();   //9
				
		Chase Chase = new Chase();
				Chase.InterestRate();   //8
				
		CapitalOne CO = new CapitalOne();
				CO.InterestRate();   //7
	}
}

class BankOfAmerica extends Bank {
	public void InterestRate() {
		System.out.println("9 percent");
	}
}

class Chase extends Bank{
	public void InterestRate() {
		System.out.println("8 percent");
	}
}

class CapitalOne extends Bank{
	public void InterestRate() {
		System.out.println("7 percent");
	}
}