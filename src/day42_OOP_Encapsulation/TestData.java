package day42_OOP_Encapsulation;
/*
 10/24/2019
Topic: OOP Encapsulation
            1. private access modifier
            2. getter & setter
            3. multi-class
package: day42_OOP_Encapsulation
OOP: Object Oriented Programming
class:
        data/attribute ==> instance variables
 
        Actions     ==>  instance method
instance variable: belongs to the object. each object has its own copy of instance variable
Encapsulation: to hide the instance variable (hiding the data)
            1. hiding the data by giving private access modifier
            2. grants other classes get access to the private data using public getter and setter
    getter (Read only): an instance method that returns the private data, does not pass any parameter
                the return of the method MUST match with the data-type of the instance variable
                access modifier needs to be public 
    Setter(Modify): 
private: if the feature is private, the feature is only visible within the class
        codes outside the class cannot access to the data
        not accessible to any other class  -- Khurshad
 */
public class TestData {

	/*Name
	  ID
	 */
	
	private String Name = "Bekir"; // data is not accesible in any other classes
	private int ID = 897;
	
	//getter
	public String getName() {
		return Name;
	}

	public int getID() {
		return ID;
	}

	//setter
		//the parameters data type MUST match with instance variable
	
	public void setName(String Name) {
		//Name = str;
		this.Name = Name;
		
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	
	
}
