package day37_classAndObject;
/*
 10/15/2019 Tuesday
Topic:  Class & Object
            1. instance variables
            2. instance methods
            3. custom class
Package: day37_classAndObject
car
    data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, drive, accelerate, stop, drift, brake, get ticket..
        car1 --> Audi Q7 2020, white,  100K, 10, 1232112112
            car1.start() ==>  Audi
        car2 --> Tesla ModelS 2025, red, 60K, 20, 231123123
            car2.start()  ==> Tesla
object: instance of the class, created from the class
class: where the objects came from, determines how the object should behave
Dog
    Attributes/data:
            breed, size, age, color, name ...
    actions:
        eat, sleep, bark, play ...
        Dog1 --> German Shepard, XXL, 5, pink, Lassie
            Dog1.eat() ==>   Lassie
        Dog2 --> Tibetan mastiff, small, 3, red, KIKO
            Dog2.eat() ==> KIKO
instance variable: object variables, MUST be declared in the lcass and outside any method
local variable: variables that's created within the method
instance methods: methods belong to the object, does not have the specifier static. designed to work as an instance of the class
regular method:
    access-modifer  specifier  return-Type methodName(parameter){
    }
instance method:
    access-modifer returnType methodName(parameter){
    }

 */
public class Car {




//access modfier   
/*
 car
    data/attribute
        model, Year, brand, color, price, milage,VIN....

    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..
 */

    String Model;
    int    Year;
    String Color;
    double  Price;
    long    Mileage;
    String  Brand;
    
    
    
    public void drive() {   
        System.out.println("Driving "+Brand);
    }
    
    public void start() {
        System.out.println(Brand+" is started ");
    }
    
    // 2020 Toyota corolla, white, 10000 miles,1000$
    public void getInfo() {
    System.out.println(Year+" "+Brand+" "+Model+", " + Color + ", " + Mileage+ " miles"+", $"+Price);
    }
}


