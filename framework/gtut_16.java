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
public class gtut_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This is tutorial number 16: Nevigable Set Interface"); 
        /*
            1] present in java.util. package. 
            2] It extends SortedArray,Set which is present in Collection Framework interface and implemented by TreeSet.
            3] It behaves like a SortedSet with the exception that we have navigation methods available in addition to  
               the sorting mechanisms of the SortedSet.  
            4] the NavigableSet interface can navigate the set in reverse order compared to the order defined in SortedSet.  
            5] A NavigableSet may be accessed and traversed in either ascending or descending order.  
            6] The classes that implement this interface are, TreeSet and ConcurrentSkipListSet. 
            7] Since nevigable set is an interface, so we can't create its object. 
            8] Declaration: 
                    // Obj is the type of the object to be stored in NavigableSet

                                NavigableSet<Obj> set = new TreeSet<Obj> ();
            9] Duplicate element is ignored and null value is not allowed to store. 
            10] It can't store hetrogenous datatype.
        */
        
        // Implementation:  
        // Performing Various Operations on NavigableSet 
        // 1. Adding Elements: 
        NavigableSet n = new TreeSet(); 
        n.add(1); 
        n.add(2); 
        n.add(3); 
        n.add(4); 
        n.add(4); 
        n.add(5); 
        n.add(6); 
        n.add(7); 
        n.add(8); 
        n.add(9); 
        n.add(10); 
        n.add(0); 
//        n.add("sairaj");
        System.out.println("Normal set :"+n); // element is in sorted order. 
        
        NavigableSet n2 = n.descendingSet();
        System.out.println("Normal set in assending order :"+n); // element is in sorted order. 
        System.out.println("Normal set in descending order :"+n2); // element is in sorted order. 
        
  
        // using tailSet() methood: 
        NavigableSet n3 = n.tailSet(3, true);  // it will store the element which is greater than  3
        System.out.println("3 or More :" + n3);
        // if boolean value is true----> compiler will insert 3 into the n3. 
        // if boolean valu3 is false----> compiler will not going to insert 3 into n3. 
        System.out.println("lower(3) of normal set: " + n.lower(3)); // returns the element below this Object passed in function.
        System.out.println("floor(3) of normal set: " + n.floor(0)); // returns the current index of that object. 
        System.out.println("higher(3) of normal set: " + n.higher(3)); // returns the element below this Object passed in function.
        System.out.println("celing(4) of normal set: " + n.ceiling(4)); // returns the current index of that object. 
        
        //System.out.println("lower(3) of reverse set : " + n2.lower(3)); // returns the element below this set 
        //System.out.println("floor(3) of reverse set : " + n2.floor(10)); // returns the current index of that object. 
        
        
        // 2. Removing the Values:
        // using poll() methood: 
        // 1] pollFirst(): 
        System.out.println("Poll First :"+n.pollFirst()); 
        System.out.println("The resultant set is :"+n); 
        // 2] pollLast():
        System.out.println("Poll Last :"+n.pollLast()); 
        System.out.println("The resultant set is :"+n);  
        
        // 3] remove() 
        System.out.println("remove 9:"+n.remove(9)); 
        System.out.println("The resultant set is :"+n);  
        
     
        // 3. Accessing the Elements
        System.out.println("This Set Contains 5? :"+n.contains(5)); 
        System.out.println("First Element of this Set is : "+n.first()); 
        System.out.println("Last Element of this Set is : "+n.last()); 
        
        
        // 4. Iterating through the NavigableSet: There are various ways to iterate through the NavigableSet.  
        //    The most famous one is to use the enhanced for loop. 
        
        // same as that in sorted list 
        
        
        // methoods : 
        /* 
        
            1] It has all methood same as that of SortedSet,Collection and Set interface. 
            2] descendingIterator()	Returns an iterator over the elements in this set, in descending order. 
            3] descendingSet()	Returns a reverse order view of the elements contained in this set. 
            4] floor​(E e)	Returns the greatest element in this set less than or equal to the given element, or null if there is no such element. 
            5] headSet​(E toElement)	Returns a view of the portion of this set whose elements are strictly less than toElement. 
            6] headSet​(E toElement, boolean inclusive)	Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) toElement. 
            7] higher​(E e)	Returns the least element in this set strictly greater than the given element, or null if there is no such element. 
            8] lower​(E e)	Returns the greatest element in this set strictly less than the given element, or null if there is no such element. 
            9] subSet​(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
                    Returns a view of the portion of this set whose elements range from fromElement to toElement. 
           10] subSet​(E fromElement, E toElement)	Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive. 
           11] tailSet​(E fromElement)	Returns a view of the portion of this set whose elements are greater than or equal to fromElement. 
           12] tailSet​(E fromElement, boolean inclusive)	Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) fromElement. 
           14] 
        // 
        */
        

        System.out.println(); 
        System.out.println(); 
        System.out.println("Everything is fine!");
    }
}
