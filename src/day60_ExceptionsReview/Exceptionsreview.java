package day60_ExceptionsReview;
/*
 * 12/06/2019
Topic: Exceptions Reveiw
            checked & unchecked exceptions
            try & catch & finally blocks (single catch & mutlicatch)
            throws & throw keywords
package name: day60_ExceptionsReveiw
checked exception: exceptions that happens during compile time.
                    unwanted code, compiler is not happy with, compile error
                     MUST be handled immediately
                     Ex: FileNotFoundException
                         Interrupted Exception
                         IOException
                         ....
unchecked exception: exceptions that occure during runtime.
                        unexpected event .
                all the unchecked exceptions are extending RunTimeException class
                RuntimeException is parent class of all unchecked exception
                Ex: NoSuchElementexception
                    WebDriverException
                    TimeOutException
                    staleElementException
                        ...
1. try & catch blocks: used for handling exceptions
            try & catch MUST be declared together
            finally block is optional
                
                try{
                    exception code;
                } catch(Exception e){
                        statements;
                }finally {
                    statement;
                }
        try block: gets executed if the exception is checked
        catch: gets executed if unexpected event occurs(unchecked)
        finally: always gets executed
multi-catch blocks:
    Condition: parent exception type cannot be before sub exception type
               cannot be conflicted
            
            try{
            } catch(exception1 e){
            }catch(exception2 e){
            }
            ....
            Ex:
                try{
                } catch(RuntimeException e){
                }catch(ArithmaticException e){
                }
                compile error, parent exception type needs to be after the sub exception type
                try{
                    exception code;
                }catch(NullPointerException e){
                } catch(ClassCastException e){
                }
                 compiles successfully,
                 if the exception is checked exception, we should not be using multi catch block.
                    checked exceptions needs to be handled right away
throws keyword: used for exception handling
                MUST be used with method signature
                    public void method() throws ExceptionType {  }
                indicates that method might throw an exception
                Caller will be responsible for handling the exception
                mostly used to hndle checked exception 
                A method can throw multiple exceptions
                public void method() throws exception1, exception2 {  }
Exception handling summary:
        exceptions are either checked or unchcked
        two ways to handle exception:
                1. try & catch & finally: handles nthe exceptions immediately
                                exception code we give it in try block, 
                                catch block is responsible catch all the unexpected events 
                                we can have multiple catch blocks, but order needs to be: super exception after sub exception type.
                                cannot be conflicted
                                finally block always gets executed
                2. throws: used in method signature, indicates the method throw an exception.
                            Caller is responsible to handle it
                            we can throw multiple exception within methdo signature
throw: used for throw exceptions manually
        
        throw ObjectOfException;  ==> throw new ExceptionClass();
        after throw keyword, any code fragments that we give will be unreachable code
keywords: return , break, continue, throw
        any codes that given after those, will be unreachable
next week' topic: Excel file Reader
                  Data Structure: Collections

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionsreview {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        // throw new FileNotFoundException();  // checked exception, compilert is not happy with it
         
    //   throw new ClassCastException();  // unchcked, compiler is okay with it 
         
    
    try {
    //  FileInputStream file =new FileInputStream("path of file");  // checked
        Thread.sleep(3000);
        System.out.println("try block");
        // unchecked exception
        
        //statements;
        
    }catch(InterruptedException e) {
        System.out.println("catch block");
    }finally {
        System.out.println("finally block");
    }
    
    System.out.println("===================================");
    
    try {
    
        System.out.println(11/0);
        System.out.println("try block");
    }catch(ArithmeticException e) {
    
        System.out.println("catch block");
    }finally {
        System.out.println("finally block");
    }
    
        
        System.out.println("next test step");
        
        
        System.out.println("===================================");
        
        
        
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[200]);
            
        }catch(NullPointerException e) {
            System.out.println(1);
            
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(2);
            
        }catch(IndexOutOfBoundsException e) {
            System.out.println(3);
            
        } catch (Exception e) {
            System.out.println(4);
        }
        
            
    //  method();
    //  method2();
        
    //  method4();
        
    //      method5();
    //  method6();
        
    //  method7();
        
        int breaktime = 0;
        if(breaktime !=0) {
            
            throw new RuntimeException("Time to Go home");
        //  System.out.println("hello");
        }
        
        System.out.println("Done");
        
        
        throw new NullPointerException();
        //  System.out.println("hello");
        
    }
    
    
    public static void method() throws InterruptedException {
        
        Thread.sleep(3000);
        
    }
    
    public static void method2() {
        try {
            Thread.sleep(3000);
        }catch(Exception e) {
            
        }
    }
    
    public static void method3() throws Exception{
        Thread.sleep(3000);
        
        System.out.println("step 2");
        System.out.println("step 3");
        
        Thread.sleep(3000);
        
        System.out.println("step 4");
        System.out.println("step 5");
        
        Thread.sleep(3000);
        
        try {
            int a =10;
            System.out.println(a/0);
            
        }catch(Exception e) {
            // System.out.println(a);
        }
        
    //  System.out.println(a);
        
        
    }
    
    public static void method4() throws RuntimeException{
        System.out.println(9/0);
    }
    
    public static void method5() throws Exception {
        
        try {
            Thread.sleep(1000);
        } catch( Exception e ) {
            
        }
        
    }
    
    
    public static void method6() throws InterruptedException, FileNotFoundException{
        
    }
    
    
    public static void method7() {
        throw new RuntimeException();
    }
    
    
    
}