import java.util.*; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This is tutorial number 17: Tree Set"); 
        /*
            1] This package is present in java.util package. 
            2] This class implements SortedSet and NavigableSet. 
            3] It uses Tree for storage. 
            4]  The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided. 
            5] This must be consistent with equals if it is to correctly implement the Set interface.  
            6] It can also be ordered by a Comparator provided at set creation time, depending on which constructor is used. 
            7] The TreeSet implements a NavigableSet interface by inheriting AbstractSet class. 
            8] The class which implements the navigable set is a TreeSet which is an implementation of a self-balancing tree. Therefore, this interface  
               provides us with a way to navigate through this tree.  
            9] It can't store hetrogenous data-type. It will throw a classCastException at Runtime if we try to add heterogeneous objects.
            10] Insertion oreder is not followed.  
            11] The position of methood is depend of the initial letter is upper or lower case. 
            12] TreeSet implements the SortedSet interface. So, duplicate values are not allowed. 
            13] TreeSet does not preserve the insertion order of elements but elements are sorted by keys.  
            14] The TreeSet can only accept generic types which are comparable.
                    For example, the StringBuffer class implements the Comparable interface
        */ 
        
       
        /*
        * How does TreeSet work Internally? 
            1] TreeSet is basically an implementation of a self-balancing binary search tree like a Red-Black Tree. Therefore operations like add, remove, and  
               search takes O(log(N)) time. 
        
            2] The reason is that in a self-balancing tree, it is made sure that the height of the tree is always O(log(N)) for all the operations.               
         
            3] Therefore, this is considered as one of the most efficient data structures in order to store the huge sorted data and perform operations on it.  
               However, operations like printing N elements in the sorted order take O(N) time. 
        
         
        
        */
        
        /*
        The implementation of a TreeSet is not synchronized. This means that if multiple threads access a tree set concurrently, and at least one of the threads modifies the set, it must be synchronized 
        externally. This is typically accomplished by synchronizing some object that naturally encapsulates the set. If no such object exists, the set should be “wrapped” using the 
        Collections.synchronizedSortedSet method. This is best done at the creation time, to prevent accidental unsynchronized access to the set. It can be achieved as shown below as follows:

				TreeSet ts = new TreeSet(); 
				Set syncSet = Collections.synchronziedSet(ts);         
        */
        
        // Constructors of TreeSet Class are as follows: 
        // 1] TreeSet(): This constructor is used to build an empty TreeSet object in which elements will get stored in default natural sorting order. 
        // 2] TreeSet(Comparator): This constructor is used to build an empty TreeSet object in which elements will need an external specification of the sorting order. 
        // 3] TreeSet(Collection): This constructor is used to build a TreeSet object containing all the elements from the given collection in which elements will get stored in default natural sorting 
        //          order. In short, this constructor is used when any conversion is needed from any Collection object to TreeSet object.
        // 4] TreeSet(SortedSet): This constructor is used to build a TreeSet object containing all the elements from the given sortedset in which elements will get stored in default natural sorting order.  
        //    In short, this constructor is used to convert the SortedSet object to the TreeSet object. 
        
        // Methods in TreeSet Class 
        /*
         1] This class implements the SortedSet as well as NavigableSet. Hence it have both of their methoods. 
         2] Also, TreeSet has the methoods of Set inteferface and Collection Framework. 
         3] Comparator comparator()	This method will return the Comparator used to sort elements in TreeSet or it will return null if the default natural sorting order is used. 
         4] subSet(Object fromElement, Object toElement)	This method will return elements ranging from fromElement to toElement. fromElement is inclusive and toElement is exclusive.
	    5] tailSet(Object fromElement)	This method will return elements of TreeSet which are greater than or equal to the specified element.
        */
        
        
        // Tree Set Implementation : 
        /*
        Here we will be performing various operations over the TreeSet object to get familiar with the methods and concepts of TreeSet in java. Let’s see how to perform a few frequently used operations on the 
        TreeSet. They are listed as follows:

   		 	Adding elements
    			Accessing elements
    			Removing elements
    			Iterating through elements
        */
        
        // 1] Adding elements: 
        TreeSet<String> t = new TreeSet<String>(); 
        t.add("sairaj"); 
        t.add("perfect sairaj"); 
        t.add("sairaj nabu fate"); 
        t.add("sairaj kira");
        t.add("supreme sairaj"); 
        t.add("superior sairaj"); 
        // t.add(3); 
        System.out.println("The Normal List"+t);

        // 2] Accessing elements 
        System.out.println("This list contains Neg-Sairaj? :"+t.contains("Neg-Sairaj")); 
        System.out.println("JVM'S Most Favourite Version Is :"+t.first());
        System.out.println("JVM'S Least Favourite Version Is :"+t.last()); 
        System.out.println("Higher " + t.higher("sairaj")); 
        System.out.println("lower " + t.lower("sairaj"));
       
        // 3] Removing the Values 
        /*
        Operation 3: Removing the Values
        The values can be removed from the TreeSet using the remove() method. There are various other  
        methods that are used to remove the first value or the last value. 
        */
        
        // 4] Iterating through the TreeSet 
        System.out.println(); 
        System.out.println(); 
        Iterator it = t.iterator();  
        System.out.println("Iterating each element of normal set in assending order. ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        Iterator i = t.descendingIterator();  
        System.out.println(); 
        System.out.println(); 
        System.out.println("Iterating each element of normal set in descending order. ");
         while(i.hasNext()){
            System.out.println(i.next());
        }
        
         
        TreeSet <StringBuffer> t1 = new TreeSet(); 
        t1.add(new StringBuffer("A"));
        t1.add(new StringBuffer("Z"));
        t1.add(new StringBuffer("L"));  
        t1.add(new StringBuffer("B"));
        t1.add(new StringBuffer("O"));
        t1.add(new StringBuffer(1));
       
        System.out.println(t1);
        System.out.println(); 
        System.out.println(); 
        System.out.println("Everything is fine!");
   }
}
