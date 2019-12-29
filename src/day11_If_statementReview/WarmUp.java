package day11_If_statementReview;

public class WarmUp {
	public static void main(String[] args) {
		
		/*grade calculator
		 A 90-100
		 B 80-89
		 C 70-79
		 D 60-69
		 F 50-59
		 */
		int grade = 0;
		boolean A = grade>=90 && grade<=100;
		boolean B = grade>=80 && grade<=89;
		boolean C = grade>=70 && grade<=79;
		boolean D = grade>=60 && grade<=69;
		boolean ValidGrade = grade>=0 && grade<=100;
		
		
		if (ValidGrade ) {
			// in order to multibranch if gets executed.
			if(A) {
				System.out.println("You made A");
			}
			else if (B) {
				System.out.println("You made B");
			}
			else if (C) {
				System.out.println("You made C");
			}
			else if (D) {
				System.out.println("You made D");
			}
			else {
				System.out.println("You failed idiot");
			}
		}	
		else {
			System.out.println("Please assign a valid value");
		}
	
	
	}
	
}
