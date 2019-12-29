package day08_ShortHandOperators;

public class ShortHand {
public static void main(String[] args) {
	
	/*
		+= addition assignment
		-= subtraction assignment
		
			
			
	 */
	
	int a=9;
	a+=3;
	System.out.println(a);
	
	int b =a+=5;
	System.out.println(b);
	
	int c =a+=b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	
	int g =101;
	int h = g-=1;
	System.out.println(h);
	System.out.println(g);
	
	int i = g+=h+5;
	
	System.out.println(i);
	System.out.println(g);
	
	int j = h+= g%i;
	// 100+= 205%205
	// 100+=0
	System.out.println(j);
	System.out.println(h);
	
	int k= j -= h*2%5;
	System.out.println(k);	
	
	System.out.println(-10.5%3);
 	
	int J =300;
	int K =10;
	J += J%=K;
	System.out.println(J);


boolean A=! false;
System.out.println(A);

System.out.println(10/3.0);
System.out.println (  (int)(10.0/3)   );



int  x =  10;

int  y =  x++;

System.out.println( y++  + "  " +  x++  + "  " + y);




}
}