package day64_Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * 12/16/2019
Topics: Queue Interface
        Iterable
Package Name: day64_Collections
Collection (I): extended by List(I), Set(I), Queue(I)
List(I): does have index numbers, takes duplicated values
Set(I): deos not have index numbers, does not take duplicates
Queue(I): does not have index numbers, does accept duplicates
        
        implemented by PriorityQueue(C)
        extended by Deque(I)
        Deque(I) is implemented by ArrayDeque(C), LinkedList(C)
        LinkedList(C) is implementing both List(I) & Deque(I)
        sorts in ascending order when there is no duplication
        Queue(I): 
                poll(): FIFO ==> First In First Out
                    return the first object as same data type,
                    at the same time it removes the first object from the Queue
        Deque(I):
            addFirst(object): adds the given object to the starting point of the Deque
            addLast(object): adds the given object to the very end of the Deque
            removeFirst(): removes the first object from Deque
            removeLast(): removes the last object from Deque
            getfirst(): retrives the first object from the Deque
            getLast(): retrives the last object from the Deque
Iterable(I): extended by root interface interface collection
    
    we can apply Iterator(I) to the classes or interfacses that are sub type of Iterable
    Iterator(I):  
        1. allows us to get access to each objects of the collection type
        2. allows us to remove objects from a collection type 
        The ONLY legit way to remove data elements from a collection-type
        iterator(): iterates the collection, and retuns Iterator
        hasNext(): check if there are enough elemnts that can be iterated
                    returns boolean expression
        next(): if hasNext() is true, it rertives the current iteration from the collection type
        remove(): removes current elemnt of the iteration from the collection type
Assessment Quiz 17 is due by 1:30 pm

 */
public class IterableInterface {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7,1,1,1,1));
            
            for(int i =0; i < list.size(); i++) {
                
                if(list.get(i) == 1) {
                    list.remove(i);
                }
                
            }
            
            System.out.println( list );
            
            List<Integer> list2 = new ArrayList<>();
            list2.addAll(Arrays.asList(1));
            
            Iterator<Integer>  it =  list2.iterator();
            boolean a = it.hasNext();
            System.out.println(a);   // true
            
            System.out.println( it.next() );
            
            boolean b = it.hasNext();// false
            System.out.println(b);
    //      System.out.println(it.next());   // there are not enough data elemnts that can be iterated
            
        System.out.println("==================================");
        
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7,1,1,1,1));
        // remove all data elemnts that are equal to 1
        
         Iterator<Integer>  it3 = list3.iterator();
         
         while( it3.hasNext() ) {
             int num = it3.next();
             if(num == 1) {
                 
                 it3.remove();
                 
             }
             
         }
         
         System.out.println(list3);
        
        
            System.out.println("==================================");
            
            Set<Integer> set = new LinkedHashSet<Integer>();
            set.addAll( Arrays.asList(10, 20) );
            
            Iterator<Integer>  iterate =   set.iterator();
            System.out.println( iterate.hasNext() ); // true
            System.out.println(iterate.next());
            
            System.out.println( iterate.hasNext() );  //true
            System.out.println( iterate.next() );
            
            
            System.out.println("==================================");
            String[] name = {"Erhan","Eholly","Nadire","Yusuf","Ibrohim", "Tarbiz"};
            
            Set<String> names = new LinkedHashSet<String>();
            names.addAll(Arrays.asList(name));
                
            Iterator<String>  Safwan  =   names.iterator();
            
            while(Safwan.hasNext()) {
                    String str = Safwan.next();
                    if( str.toLowerCase().contains("e") ) {
                        Safwan.remove();
                    }
                    
            }
            
            System.out.println(names);
            
            System.out.println("=================================="); 
            // for(initialization;   condition;   iterator)
            //          mandatory    mandatory      
            
            List<Integer> myList = new ArrayList<Integer>();
            myList.addAll(Arrays.asList(100, 900, 500 , 99, 200, 89, 300, 79));
            
            for( Iterator<Integer> itr = myList.iterator(); itr.hasNext() ;) {
                int numbers = itr.next();
                if(numbers > 100) {
                    itr.remove();
                }
            }
            
            System.out.println(myList);
            
    String[] students = { "Erhan", "Erhan", "Erhan" , "Aijamal", "Safwan","Madina","Erhan", "Erhan"};
        
    List<String> namelist = new ArrayList<String>();
        namelist.addAll(Arrays.asList(students));
        
        for( Iterator<String> itr = namelist.iterator(); itr.hasNext();  ) {
                String str = itr.next();
                if(str.equals("Safwan") && str.equals("Erhan") ) {
                    itr.remove();
                }
        }
        
        
        System.out.println(namelist);
            
            
            
        
        
    }
    
}
