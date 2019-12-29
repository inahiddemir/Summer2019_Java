package day63_JavaRecap;
import java.io.IOException;
//import org.testng.annotations.Test;

/*
 * 12/13/2019
Java Reveiw: List Interface
             Set Interface
Package Name: day63_JavaRecap
            Quiz
List(I): does have index numbers, accept duplicates, size is automatically adjusted
            implemented by: ArrayList(C), LinkedList(C), Vector(C)
        ArrayList(C): array based, internally uses array
        LinkedList(C): each objects are doubly linked
                add() & remove() are faster than ArrayList
                get()is slower than arraylist
        Vector(C): is synchronized --> Thread safe
                slower than LinkedList & ArrayList
                Has a child class: Stack
                Stack: LIFO
                    pop(): LIFO ==> Last In First out
                            removes the last object from the Stack
Set(I): does not have index numbers, does not accept duplicates, size is automatically adjusted
        implemented by: HashSet(C), LinkedHashSet(C);
        HashSet: does not keep the order of the objects as it's
        LinkedHashSet: does keep the order of the objects as it's
                    doubly linked
        extended by SortedSet(I)
        SortedSet(I): sorts the objects in ascending order  , no duplicates
                implemented by TreeSet
synchronized keyword: used for achiving thread safety in multi-thread
        synchronized  ==> Thread safe ==> slower
multi-thread: multiple threads trying to get access to same resources
Next Week' topics: Queue Interface
                   Iterables
                   
                   Map Interface
 */
class NoHolidaysException extends Exception{ // custom checked exception
    
}
class NoBreakException extends RuntimeException{
    
    public NoBreakException(String str) {
        super(str);
    }
    
}
public class Quiz {
    
    // Assessment quiz 16
    
    public static void main(String[] args){
        
        // throw new NoHolidaysException();
    //  throw new NoBreakException("There is no coffee break");
        
    //  throw new RuntimeException("There is no coffee break");
        
        
        
        
    //  throw new RuntimeException("This is an Exception ");  // explicitly
        
    //  System.out.println( 9/0  );  // implicitly
        
        
        int[] arr = {1,2,3};
        
        try {
            System.out.println(arr[100]);
        }catch(RuntimeException e) {
            System.out.println("runtime");
        }
        // catch (IndexOutOfBoundsException e) {}  // child exception type cannot be after parent exception type
        
    //  @Test methods: a Test case
        
        // @Test(testname="smoke")
        
        // Actions act = new Actions(driver);
        // act.moveToElement(WebElement).perform();
         
         
         
        
    }
    
    public static void method1() throws IOException{
        
    }
    
    
    //@Test( timeOut = 1000 )  // gives time limit to the Test case
    public void Test1() throws Exception{ 
        Thread.sleep(2000);
        System.out.println("Test Completed");
    }
    
    
    
    
    
}