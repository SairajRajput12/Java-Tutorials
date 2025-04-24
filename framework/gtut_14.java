import java.util.*;
import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This is tutorial number 14: Linked Hashset in java");
        /*
            1] The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.  
            2] When the iteration order is needed to be maintained this class is used. When iterating through a HashSet the  
               order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they  
               were inserted. 
            3] When cycling through LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted. 
            4] Contains unique elements only like HashSet. It extends the HashSet class and implements the Set interface. 
            5] Maintains insertion order. 
            6] It can store null value. 
            7] It does not allow to store duplicate values.  
            8] It can store hetrogenous datatype.
        */
        
        /*
            All Implemented Interfaces are as listed below:
                 Serializable
                 Cloneable,
                 Iterable<E>,
                 Collection<E>,
                 Set<E>. 
        
        */ 
        
        /*
            Constructors: 
                1]  LinkedHashSet(): This constructor is used to create a default HashSet. 
                
                                LinkedHashSet<E> hs = new LinkedHashSet<E>();
                
                2]  LinkedHashSet(Collection C): Used in initializing the HashSet with the elements of the collection C.  
                
                                LinkedHashSet<E> hs = new LinkedHashSet<E>(Collection c);
                
                3]  LinkedHashSet(int size): Used to initialize the size of the LinkedHashSet with the integer mentioned in the parameter. 
                
                                LinkedHashSet<E> hs = new LinkedHashSet<E>(int size);
                    
                4]  LinkedHashSet(int capacity, float fillRatio): Can be used to initialize both the capacity and the fill ratio, also called  
                    the load capacity of the LinkedHashSet with the arguments mentioned in the parameter.When the number of elements exceeds the capacity   
                    of the hash set is multiplied with the fill ratio thus expanding the capacity of the LinkedHashSet. 
                    
                                LinkedHashSet<E> hs = new LinkedHashSet<E>(int capacity, int fillRatio);
        */
        //Implementation:
                LinkedHashSet h = new LinkedHashSet(); 
                h.add("Captain america"); 
                h.add("hulk"); 
                h.add("Iron man");
                h.add("Thor"); 
                h.add("Black widow"); 
                h.add("wanda"); 
                h.add("Dr strange");  
                h.add("hulk"); 
                h.add(7); 
                h.add(null);
               // System.out.println(h);
               // System.out.println("The size of the LinkedHashSet is :" + h.size()); 
                h.remove(null); 
               // System.out.println("Updated linked list : After removing the size of the LinkedHashSet is :" + h.size()); 
               // System.out.println("The updated linked list is :"+h); 
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Everything is fine ! "); 
                 System.out.println();
                System.out.println();
                System.out.println();
                Iterator it = h.iterator(); 
                while(it.hasNext()){
                       System.out.println(it.next());
                } 
                System.out.println(h.stream()); 
                
                
                LinkedHashSet h1 = new LinkedHashSet();  
                h1 = (LinkedHashSet) h.clone(); 
                System.out.println(h1);
                
                
                
                // Performing Various Operations on the LinkedHashSet Class
                /*
                
                Operation 1: Adding Elements 
                In order to add an element to the LinkedHashSet, we can use the add() method. This is different from HashSet because in HashSet,  
                the insertion order is not retained but is retained in the LinkedHashSet.   
                
                Operation 2: Removing Elements
                The values can be removed from the LinkedHashSet using the remove() method.
                
                Operation 3: Iterating through LinkedHashSet
                Iterate through the elements of  LinkedHashSet using the iterator() method. The most famous one is to use the enhanced for loop.
                */
                
                // methoods: 
                // It has same methood from LinkedList, HashSet and Set. 
                // 1] spliterator()	Creates a late-binding and fail-fast Spliterator over the elements in this set.
                // 2] 
    }
}
