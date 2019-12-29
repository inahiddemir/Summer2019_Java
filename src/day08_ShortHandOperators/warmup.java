package day08_ShortHandOperators;

public class warmup {

	public static void main(String[] args) {
		
		int L = 1;
		double G = L/3.785;
		System.out.println(L + " litters equal to "+ G+" gallons");
		String result = L + "litters equal to" + G + "gallons";
		System.out.println(result);
	
	// Task1
		
		int x =2;
		int y =x++;  // y+2, x=3
	
System.out.println(y+" "+x);	
	
	
	int x2=2;
			System.out.println(x2++);
			System.out.println(++x2);
	
	int x3= 2;
	System.out.println(--x3); // 2-1=1
	
	
	int x4 =8;
	int y4 = x4--;  
	
	System.out.println(y4);
	System.out.println(x4);
	
	}

}
