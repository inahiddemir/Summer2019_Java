package day53_InterfaceContinue;

interface B{
	
	void method3();
	
}


public interface extends_VS_Implements extends B{	// B is supertype from now. But NOT super class. (You can either call it super interface)
					//subtype				//supertype
	
	void method1(); //public
	void method2(); //public
	
	//void method3();  /its coming from supertype B
	
	
}

class A implements extends_VS_Implements{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
}

class C extends A implements extends_VS_Implements{

	
}