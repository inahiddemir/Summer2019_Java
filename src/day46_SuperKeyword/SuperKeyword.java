package day46_SuperKeyword;
class A {
    
    String name = "Madina";
    
    public void methodA() {
        
    }
    
    
    public A ( int a ) {
        
    }
    
}
public class SuperKeyword extends A {
        //      sub               super
    
    public SuperKeyword() {
        super(10);  // super class' constructor MUST be called in the sub class
    }
            
    
    /*
        String name  = "Madina";
     */
    
    public void method() {
        super.name = "Mahir";
        this.name = "Ihsan";
        super.methodA();
        this.methodA();
    }
    
    

		
		/*
		  this. : used for calling the instances from the class itself
		  			to use this we dont need inheritance
		  super. : used for calling the instances from super class
		  			to use super we MUST have super class and sub class
		 */
		
	}








