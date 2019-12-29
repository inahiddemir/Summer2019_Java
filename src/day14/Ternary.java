package day14;

public class Ternary {
	public static void main(String[] args) {
		
		int num = 0;
		/*
		if (true) {
			num = 100;
		}
		else {
			num = 50;
		}
		*/
		
		/*
		
		num = (true)? 100 : 50;    // its has to be boolean // ternary returns a value
			
		System.out.println(num);
		
		*/
		
		int y = false?100:50;    // paranthesis does not required in turnery
		System.out.println(y);
		
		// ternary must be initialized with a variable OR printed out
		
		String Schoolname = "";
		boolean Batch12 = true;
		
		if(Batch12) {
			Schoolname = "Cybertek";
		}
		else {
			Schoolname = "Invalid";
		}
		
		System.out.println(Schoolname);
		
		
		String Bestschool = Batch12 ? "Cybertek":"Invalid";
		System.out.println(Bestschool);
		
		
		System.out.println(Batch12?"Cybertek" : "Invalid");
		// in ternary total number of ? and : has to be equal !!
		
		
		double interestRate = 0;
		boolean GoodCredit = true;
		
		interestRate = (GoodCredit) ? 0.5 : 0.9;
		System.out.println(interestRate);
		
		byte grade = 60;
		boolean Passed = grade >=60 ? true:false;
		System.out.println(Passed);
		
		
		char FinalGrade = 'A';
		String Group="";
		
		/*
		
		if (FinalGrade == 'A') {
			Group = "Early bird";
		}else if (FinalGrade == 'B') {
			Group = "Group 1";
		}else {
			Group = "After Group 1";
		}
		
		*/
		
		Group = FinalGrade == 'A'? "Early bird": FinalGrade == 'B' ? "Group 1" : "After Group 1";
		System.out.println(Group);
		
		Group = FinalGrade == 'A' ? "Early Birds"
				:FinalGrade == 'B' ? "Group 1"
				:FinalGrade == 'C' ? "Group 2"
				:"Late Groups";
		System.out.println(Group);
				
			int score = 85;
			char Finals= ' ';
			
			/*
			if (score>=90 && score<=100)
				Finals = 'A';
			else if(score >=80 && score <=89)
				Finals = 'B';
			else if (score >=70 && score <=79)
				Finals = 'C';
			else if (score>=60 && score <=69)
				Finals = 'D';
			else if (score>=0 && score<=59)
				Finals = 'F';
			else
				Finals = ' ';
			*/
			
			Finals = score>=90 && score <=100 ? 'A'
						: score >=80 && score <= 89 ? 'B' 
							: score >=70 && score <=79? 'C'
								: score >=60 && score <=69? 'D'
									:score >=50 && score <=59? 'F'
										:' ';
											
				System.out.println(Finals);
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
