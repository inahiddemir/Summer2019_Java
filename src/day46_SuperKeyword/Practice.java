package day46_SuperKeyword;
/*
 10/31/2019
Topic: super Keyword: super. & super()
       Constructor in Inheritance
       super vs this
package: day46_SuperKeyword
Inheritance:  super and sub classes
    
        class   A    extends    B
                sub            super
        subclass:  sub class inherits features from the super class
                    sub class gets rich
                    public and protected access modifiers can always be inheritable in the subclass
                    default access modifier can only be inherited to the classes that are in the same package with
                    private can NEVER be inherited
        superclass: super class does not inherit anything from the sub class
this. : used for calling instances variables, can only be used in object instances
super. : used for calling instances (instance variable and methods) from the super class 
            super keyword can only be used in the subclass
this. vs super. :
        this. : used for calling the instances from the class itself
                to use this, we dont need inheritance 
        super. : used for calling the instances from the super class
                to use super, we MUST have super class and sub class
Constructor: at least one of the constructors from the super class has to be called in the sub class
        
        super class' default constructor is called in the sub class by default
super(): used for calling the constructors from the super class
        MUSt be used in the sub class.
this(): used for calling the constructors from the class itself
All the rules of of the constructor:
      Constructor: special method. belongs to the object.  
             1. Every class MUST have constructor. 
                (if there isn't any, compiler will give no-arg constructor by default)
             
             2. Constructor method cannot have return-types or specifiers
                        return-types: primitives, wrapper class, objects,...
                        specifiers: final, static, abstract
                        
             3. Constructor' name MUST be same with the ClassName
             
             4. constructor' execution depends on the creation of the object
             
             5. constructor can only be called in other constructor. 
                            ( methods or blocks cannot call constructor)
             
             6. constructor cannot be called by constructor-name, MUST be called with this or super keyword
                            this(): calls the class' constructor
                            super(): calls the super class' constructor
                            
             7. constructor cannot call or contain itself
             
             8. constructor cannot call more than one constructor
             
             9. constructor call MUST be the first step
             
             10. class' object MUST be created with existing and visible constructor(s)
             11. super class' default constructor (no-arg) is called in sub class' constructor(any constructor) by default 
             12. at least one of the super class' constructors MUST be called in sub class
             13. Constructor can be overload
 */


public class Practice {

}
