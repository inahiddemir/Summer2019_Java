package day46_SuperKeyword;

import day45_Protected_Default.ProtectedVariables;

class Data{
	public int num1 = 10;
	protected int num2 = 20;
	private int num3 = 30;
	int num4 = 40;
	
}

public class InheritanceReview extends Data {
//				sub						super

/*
 public int num1 = 10;
	protected int num2 = 20;
	static int num4 = 40;
 */
	
	static int staticNum;
	int insNum;

		public void mm() {
		System.out.println(this.insNum);	
		}
		
		
		
		
	public static void main(String[] args) {
		
	//System.out.println(this.insNum);
	// in order to call instances in a static method or block, we MUST have object 
	InheritanceReview obj = new InheritanceReview();
		
	System.out.println(obj.num1);
	System.out.println(obj.num2);
	//System.out.println(num3);
	System.out.println(obj.num4);
	
	
	Data obj2 = new Data();
	
	System.out.println(obj2.num1);
	System.out.println(obj2.num2);
	//System.out.println(obj2.num3);
	System.out.println(obj2.num4);
	
	ProtectedVariables obj3 = new ProtectedVariables();
	
	
	// System.out.println(obj3.nameProtected); //protected cannot be visible outside of the package
	System.out.println(obj3.namePublic);   // public is worldwide
	
	InheritanceReview objA = new InheritanceReview();
		objA.staticNum = 100;
		objA.insNum = 200;
	
	
	
	InheritanceReview objB = new InheritanceReview();
		objA.staticNum = 300;
		objB.insNum = 400;
	
		System.out.println(objB.insNum);
		System.out.println(objA.insNum);
		
		System.out.println(objB.staticNum);
		System.out.println(objA.staticNum);
	
	
	
	}
}
