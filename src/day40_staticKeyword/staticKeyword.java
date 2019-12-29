package day40_staticKeyword;
/*
 static: means that we can access the members through the class name
        
        static members belongs to the class, also called class members
what can be static in java:
                1. static variables
                2. static methods
                3. static initializer block
                4. static inner class (nested class)
instance variables: created in the class outside any method.
        belongs to the object. each object will have its own copy
local variables: declared within the methods or blocks
                only accessible within the method or block
static variables: created in the class outside any method with static keyword
        
        when a variable is static, it's shared by class and all objects of the class. and we can call it through the class name
        
        static methods: a method that we can call through the class name
        
        static methods only accepts class members (static)
        none static can only be called through the objects in the static method
instance variable VS static variable:
        instance variables belong to object (fileds)
        static variables belong to the class ( class variables)
        static methods only accepts class members, non static must be called through the object
        static features are shared by class and all other objects
                can only have one copy
        each objects they have thier own copy of instance variables
summary:
        1. static is hsared by class and all other objects
        2. there can only be one copy for the static variable
        3. each objects has its own copy of instance variable
        4. static members can be called through the class name
        5. static methods only accepts static members
        6. in order to call none static in a static method we MUST call it though the object

 */

public class staticKeyword {
	int a;
    static int b ;

public static void main(String[] args) {
    
    staticKeyword obj1 = new staticKeyword();
        obj1.a = 100;   
        
    staticKeyword obj2 = new staticKeyword();
        obj2.a = 200;
        
        System.out.println( obj1.a );  // 100
            // each object has its own copy of instance variables
        
        System.out.println( obj2.a ); //  200
        
    double num = 100.5;
    
    System.out.println( staticKeyword.b );
    System.out.println( obj1.b );
    System.out.println( obj2.b );
    
    System.out.println("=======================");
    
    staticKeyword obj3 = new staticKeyword();
            obj3.a = 100;
            System.out.println(obj3.a);    // 100
            
            
    staticKeyword obj4 = new staticKeyword();       
    System.out.println(  obj4.a );   //  0
    
    
    obj3.b = 400;
    System.out.println( obj3.b ); // 400  
    
    System.out.println( obj4.b );
    
    
    
}

public static void method1(){
//  System.out.println( num );  local variables only visible within the methods
    
}

}
