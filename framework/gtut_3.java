import java.util.*; 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TO DO code application logic here
        /*
            Vector implements a dynamic array which means it can grow or shrink as required. 
            Like an array, it contains components that can be accessed using an integer index.
            They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.
            It also maintains an insertion order like an ArrayList. 
            Still, it is rarely used in a non-thread environment as it is synchronized, and due to this, 
            it gives a poor performance in adding, searching, deleting, and updating its elements.
            The Iterators returned by the Vector class are fail-fast. 
            In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
        */
        
        /*
            Here, E is the type of element.

                It extends AbstractList and implements List interfaces.
                It implements Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess interfaces.
                The directly known subclass is Stack.
        */
       
        // Case 1
        // Creating a default vector
        Vector v1 = new Vector();

        // Adding custom elements
        // using add() method
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);

        // Printing the vector elements to the console
        System.out.println("Vector v1 is " + v1);

        // Case 2
        // Creating generic vector
        Vector<Integer> v2 = new Vector<Integer>();
        
        // Adding custom elements
        // using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);
        // Printing the vector elements to the console
        System.out.println("Vector v2 is " + v2);
	
        /*
        various operations on Vector class that are listed as follows:
            * Adding elements
            * Updating elements
            * Removing elements
            * Iterating over elements
        
        Operation 1: Adding Elements
        
        In order to add the elements to the Vector, we use the add() method. 
        This method is overloaded to perform multiple operations based on different parameters. They are listed below as follows:

           * add(Object): This method is used to add an element at the end of the Vector.
           * add(int index, Object): This method is used to add an element at a specific index in the Vector.
        
        
        Operation 2: Updating Elements

            1] After adding the elements, if we wish to change the element, it can be done using the set() method. 
            2] Since a Vector is indexed, the element which we wish to change is referenced by the index of the element. 
            3] Therefore, this method takes an index and the updated element to be inserted at that index. 
        
        Operation 3: 
        In order to remove an element from a Vector, we can use the remove() method. This method is overloaded to perform multiple operations based on different parameters. They are:

            remove(Object): This method is used to remove an object from the Vector. If there are multiple such objects, then the first occurrence of the object is removed.
            remove(int index): Since a Vector is indexed, this method takes an integer value which simply removes the element present at that specific index in the Vector. 
            After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.
        
        
        Operation 4: Iterating the Vector

            There are multiple ways to iterate through the Vector. 
            The most famous ways are by using the basic for loop in combination with a get() method to get the element at a specific index and the advanced for a loop.
        */
        
        Vector<String> v = new Vector<>();
        // Add elements using add() method
        v.add("sairaj");
        v.add("jai ho!");
        v.add(1, "ki");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : v)
        System.out.print(str + " ");
        
        
    }
}
