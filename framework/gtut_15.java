import java.util.*; 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This is tutorial number 15: Sorted Set interface"); 
        /*
            1] It is present in java.util.* package. 
            2] It extends Set interface present in Collection Framework. 
            3] It has all methood same as Set interface but has additional methoods to store data in sorted manner 
            4] the navigable set extends the sorted set interface. 
            5] All elements are arranged in sorted order and insertion order is not retained.
            6] Has the all properties as same as set(avoiding repeatation of elements). 
            7] null value is not accepted. 
            8] The class which implements Sorted Set is Tree Set.
            9] TreeSet uses a tree data structure for storage. Objects are stored in sorted, ascending order. 
            10] But we can iterate in descending order using method TreeSet.descendingIterator().  
        */
        
        /*
        Note: 
           1]  All the elements of a SortedSet must implement the Comparable interface (or be accepted by the specified Comparator) 
               and all such elements must be mutually comparable. Mutually Comparable simply means that two objects accept each other 
               as the argument to their compareTo method. 
        
           2] Since SortedSet is an interface, objects cannot be created of the type SortedSet and same goes for navigable Set. 
        
           3] Syntax: SortedSet<Obj> set = new TreeSet<Obj> (); 
        
           4] Note: All the elements of a SortedSet must implement the Comparable interface (or be accepted by the specified Comparator) 
              and all such elements must be mutually comparable. Mutually Comparable simply means that two objects accept each other as 
              the argument to their compareTo method.

           
        
        */
        // Performing Various Operations on SortedSet
        
        // 1. Adding Elements: In order to add an element to the SortedSet, we can use the add() method.
        /*
        We need to keep a note that duplicate elements are not allowed and all the duplicate elements are ignored. And also, Null values 
        are not accepted by the SortedSet.
        */
        SortedSet<String> s = new <String>TreeSet();
            s.add("CJ"); 
            s.add("Niko"); 
            s.add("Tommy"); 
            s.add("Claude"); 
            s.add("Michael"); 
            s.add("Trevor"); 
            s.add("Franklin"); 
//            s.add(null);
        System.out.println(s); // it will display all elements in sorted order. 
        // If element begin with lower case then it will be inserted at the end. 
        
        // 2. Accessing the Elements: After adding the elements, if we wish to access the elements, we can use inbuilt methods like contains(), 
        //                            first(), last(), etc. 
        
        System.out.println("JVM'S Most Favourite protegonist :" + s.first()); 
        System.out.println("JVM'S Least Favourite protegonist :" + s.last()); 
        System.out.println("JVM'S Loves Victor Vance ? :" + s.contains("Victor")); 
        
        // 3. Removing the Values: The values can be removed from the SortedSet using the remove() method. 
        s.remove("Trevor");
        System.out.println("JVM Has Removed Least favourite protagnist and resulted list :" + s);  
        
        // 4. Iterating through the SortedSet: There are various ways to iterate through the SortedSet.  
        //    The most famous one is to use the enhanced for loop.  
        /*    
            for (String value : s){
                System.out.print(value+ ", "); 
                System.out.println();
            } 
            
       */ 
        
        // Iteration of an element: 
        // in assending order: 
        Iterator c = s.iterator(); 
        while(c.hasNext()){
            System.out.println(c.next());
        }
        
        // methoods: 
        /*
        1] headSet(element)	This method returns the elements which are less than the element that are present in the sorted set. 
        2] subSet(element1, element2)	This method returns a sorted subset from the set containing the elements between element1 and element2. 
        3] tailSet(element)	This method returns the elements which are greater than or equal to the element that are present in the sorted set. 
        */
        
    }
}
