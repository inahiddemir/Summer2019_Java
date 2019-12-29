package day09_Review;

public class If_Statement {
public static void main(String[] args) 
{

	if(true) 
	{
		System.out.println("Hello");
		System.out.println("Happy Friday");
		System.out.println("Tomorrow is day off");
	}
	
	//only time if execute is, when its boolean expression true! 
	
	int a=1000;
	if (a++==1001)
	{
	
		a=2000;
		System.out.println("a is increased");
		
	}
	
	System.out.println(a);
}
}
