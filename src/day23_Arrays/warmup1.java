package day23_Arrays;

public class warmup1 {
public static void main(String[] args) {

	//use divider without using dividing 
	int a = 10;
	int b = 3;
	int counter = 0;
	
	if(b!=0) {
		
	
	while(a>=b) {
		a-=b;
		counter++;
	}
	
	System.out.println(counter);
	System.out.println(a);
	}
	else {
		System.out.println("invalid entry");
	}
	
}
}
// you need to consider everything that numbers can be negative too or sth. especially in interviews.