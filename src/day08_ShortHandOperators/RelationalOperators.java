package day08_ShortHandOperators;

public class RelationalOperators 
{
	public static void main(String[] args) 
	{
		boolean h= "batch12" == "Batch13";	
		System.out.println(h);
		int Inum = 50;
		int ByteNum = 30;
		Inum += ByteNum;
		String str1 = "Result A"+1.234567890123456789+2;
		System.out.println(str1);
		String str2 = "ResultA"+7+2;
		System.out.println(str2);
		double a=5,b=4,c = 10.9;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		System.out.println(Inum);
	
		long Lnum=3000L;
		double Dnum = (float) Lnum;
		System.out.println(Dnum);
	
	
	
	
	}

}
