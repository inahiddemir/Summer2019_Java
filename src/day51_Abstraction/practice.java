package day51_Abstraction;
/*
 * 11/08/2019
Topic:  
        Abstract class VS Non-Abstract class
        Abstract interveiw questions
package: day51_Abstraction
abstract method: can only be declared in abstract class and interface
                
                hiding the implemantation details ( does not have body)
                it's meant to be overridden in subclass (non-abstract class)
                cannot be: final, private, static
                abstract methdo can be overload
abstract keyword: can only applicable to classes & methods
Abstract class vs Non-abstract class:
        
        abstract class: 
                we can have abstract methods mamd all the non-abstract methods ( anything that a non abstract class can have, abstract class can also ahve it)
                         a class that's meant to be extended
                         cannot be final
                         cannot create object ( object is concrete, abstraction is not concrete)
        non-abstract class: cannot have abstract methods
                            we can create objects
                            can be final (cannot extended)
final keyword: can only be applicable to variables, methods, and classes
                variables: variable becomes constent, cannot re assigned
                methods: the method cannot be overridden
                class: class becomes immutable, the class cannot be super class ( cannot be extended)
A class can only extend one class, A class can be extended by multiple classes
quiz topics: method overriding VS overloading (yester day's note)
             final keyword 
             inheritance (this & super)
             abstraction
             questions: 20 ~ 25  ==> 40 minutes
OOP: 1. Encapsulation
     2. Inheritance
     3. Abstraction
     4. Ploymorphisim
Exceptions
Collections
StringBuilder, LocalDate, Math class
next week' topics:  abstraction: Interface
                    Polymorphisim

 */


abstract class Test{
    
    public Test(){
        
    }
    
    abstract void m();
    
    protected abstract void m(int a);
    
    public static void main(String[] args) {
        
    }
        
}
public class practice extends Test{
    
    // abstract void m();
    
    @Override
    void m() {
        practice obj = new practice();
    }
    
    @Override
    public void m(int a) {
        
    }
    
        final int num2 = 30;
        final static int num3 = 40;
    
    public static void main(String[] args) {
        final int num;  // constant
            num = 10;   
        System.out.println(num);
        
        
    }
}
final class A{
    
}
// class B extends A{}  final class cannot be super class
abstract class C{
    
    int num;
    static int num2;
    
    public static void main(String[] args) {
        
    }
    
    static {
        
    }
    
    {
        
    }
    
    abstract void absmethod();
    
}
abstract class D extends C{
    /*
    @Override
    void absmethod() {
        
    }
    */
}
