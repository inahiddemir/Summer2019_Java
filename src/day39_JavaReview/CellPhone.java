package day39_JavaReview;
/*
 10/18/2019
Java Reveiw:
        1. instance variables
        2. instance methods
        3. this keywords (this. vs this())
        4. Decimal formatter class  
package: day39_JavaReview       
warmup:
    create  a custom class for CellPhones
        instance variables:  brand, Screensize, color, price
        instance methods: call, message, takePhoto
    
instance variable: created outside methods, within the class. (object)
                    it's also called fields
local variables: created within the methods. not visible to other methods
                    can only be used within the method
instance methods: methods that deos not have static specifier. but do have return type. (object)
this. : used for calling instance variables, we used when local and instance variables have the same names

 */
public class CellPhone {

	String brand;
	double price;
	String color;
	double screensize;
	String model;
	
	public CellPhone() {
		brand = "iphone";
		model = "10";
		screensize = 5.8;
		color = "white";
		price = 700;
		
	}
	
	public CellPhone (String brand, double price, String color, double screensize, String model) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.screensize = screensize;
		this.model = model;
		
	}
	
	public void call(long PhoneNumber) {
		System.out.println(brand+" "+model+"is calling .."+PhoneNumber);
	}

	public void SendMessage(long PhoneNumber) {
		
	}


	public void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+screensize+" $"+price);
	}

















}
