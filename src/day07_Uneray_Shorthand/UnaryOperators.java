package day07_Uneray_Shorthand;

public class UnaryOperators {
public static void main(String[] args) {
	
	int a = 100;
	System.out.println(a++);
	System.out.println(a);
	
	int a2 =  a ++;
	System.out.println(a2);
	System.out.println(a);

int x = 100;
int y = x++ - 1;

System.out.println(y);
System.out.println(y);

int T = 25;
System.out.println(T++); //25
System.out.println(T--); //26 
System.out.println(--T); // 24

int P=50;
P = --P + P++ + P-- + P++;
//	 49 +  49 + 50  + 49 
System.out.println(P);
System.out.println(P);

short Snum = 4;

int R = Snum*4 - Snum--;
//         16   -  4   = 12

System.out.println(R);
System.out.println(R);
System.out.println(Snum);

int W=1;
a=-W-- + W++ / -W-- * --W;
// -1  +  0  /  -1   * -1

System.out.println(a);
System.out.println(a);
System.out.println(W);
System.out.println(W);

}
}
