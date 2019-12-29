package day48_MethodOverRiding;

class Mahribana{
    
    public void methodA() {   
        // the method we are going to override MUST be inheritable to the sub class
        System.out.println("Method A");
    }
    
    public String methodB() {
    	return "B";
    }
    
    /*
     public String methodB() {
    	return "C";
    }
     */
    
    public double salary(double bonus) {
    	return bonus+100000;
    }
}
public class AccessModifiers extends Mahribana {
	
	protected double salary(int bonus) {
		return bonus+2000;
	}
	
	
    /*
    @Override
    private void methodA() {
        System.out.println("Method A");
    }
        override method' access modifiers need to be same or more visible
    */  
    
    @Override
    public void methodA() { 	//same or more visible
        System.out.println("Method A");
    }
    
    @Override
    public String methodB() {
    	return "C";
    }
    
}