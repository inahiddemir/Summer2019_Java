package day46_SuperKeyword;

class B{
	
	public B() {
		System.out.println("super");
	}
	
}







public class DefaultConstructor extends B {
	
	public DefaultConstructor() {
		//super();  //super
		System.out.println("sub");
	}


	public static void main(String[] args) {
	DefaultConstructor obj = new DefaultConstructor();
	
}



}
