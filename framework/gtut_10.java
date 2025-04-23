import java.util.*; 
public class gtut_10 {

    public static void main(String args[]) {
        System.out.println("This is tutorial number 10: Sets in java"); 
        /* 
        Set: 
            1] It is an interface present in java.util package. 
            2] It extends interface Collection. 
            3] It is an unordered collection of objects in which duplicate values cannot be stored. 
            4] This interface contains the methods inherited from the Collection interface and adds a feature that restricts the insertion of the duplicate elements 
            5] There are two interfaces that extend the set implementation namely SortedSet and NavigableSet.
            6] the navigable set extends the sorted set interface.  
            7] Set does not retain Insertion order. 
            8] the navigable set interface provides the implementation to navigate through the Set. 
            9] The class which implements the navigable set is a TreeSet which is an implementation of a self-balancing tree. Therefore, this interface provides us with a way to navigate through this tree.        
            11] duplicate elements are not allowed and all the duplicate elements are ignored. And also, Null values are accepted by the Set.
        */ 
        
        /* 
        Operations on the Set Interface: 
            1] Insertion of 2 sets:  
            2] Union of 2 sets:  
            3] Difference: 
        
        */ 
        
        Set<Integer> a = new HashSet<Integer>(); 
        a.add(4); 
        a.add(6); 
        a.add(7);  
        a.add(1);
        a.add(5);
        a.add(2);
        a.add(3); 
        a.add(3); 
        a.add(8); 
        a.add(9); 
        a.add(3);  
        a.add(null); 
        System.out.println(a);
        
        Set<Integer> b = new HashSet<Integer>();  
        b.addAll(Arrays.asList(new Integer[] {10,11,12,13,14,15,16,17,18,19})); 
        System.out.println(b);
        
        // operation 1:
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b); 
        System.out.println("The union of the 2 sets are given below :");
        System.out.println(union); 
        
        // operation 2: 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.println("The intersection of the 2 sets are given below :");
        System.out.println(intersection); 
        
        // operation 3:
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.println("The symmetric difference of the 2 sets are given below :");
        System.out.println(difference); 
        
        // Performing Various Operations on SortedSet 
        /*
                Adding elements
                Accessing elements
                Removing elements
                Iterating elements
                Iterating through Set
        */
        
        /*
            Classes that implement the Set interface in Java Collections can be easily perceived from the image below as follows and are listed as follows:

                HashSet
                EnumSet
                LinkedHashSet
                TreeSet
        */
        
       
        
    }
}
