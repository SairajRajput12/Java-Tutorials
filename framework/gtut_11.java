import java.util.*; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This is tutorial number 11: HashSet"); 
         // 1] HashSet: 
        //       implements Set interface. 
        //       It stores the all elements based on their hashcode values. 
        //       This class permits the null element.but like set it can't store duplicate values. 
        //       The class also offers constant time performance for the basic operations like add, remove, contains, and size assuming the hash function  
        //       disperses the elements properly among the buckets, which we shall see further in the article.   
        
        //A few important features of HashSet are: 
        /*
            1] Implements Set Interface. 
            2] The underlying data structure for HashSet is Hashtable. 
            3] As it implements the Set Interface, duplicate values are not allowed. 
            4] Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
            5] NULL element is  allowed to store  in HashSet.
            6] HashSet also implements Serializable and Cloneable interfaces. 
            7] Syntax: 
                            public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable 
            8] Internal working of a HashSet: 
            9] HashSet not only stores unique Objects but also a unique Collection of Objects like ArrayList<E>, LinkedList<E>, Vector<E>,..etc.
            10] It can store hetrogenous datatypes.
        
        
        */
        // For maintainence of constant time Hashset requires: 
        //  time  ∝ ( instance's size of hashset (number of elements) + capacity of backing of hashset( number of buckets means initial capacity of the hashset)). 
        //
        //
        // I]  Initial Capacity: The initial capacity means the number of buckets when hashtable (HashSet internally uses hashtable data structure) is created.  
        //                        The number of buckets will be automatically increased if the current size gets full.  
        // 
        // 
        // II] Load Factor: The load factor is a measure of how full the HashSet is allowed to get before its capacity is automatically increased.  
        //                  When the number of entries in the hash table exceeds the product of the load factor and the current capacity, the hash 
        //                  table is rehashed (that is, internal data structures are rebuilt) so that the hash table has approximately twice the number of buckets.
        //
        //
        
        /* 
               _______________________________________________________________________
               |                        Number of stored elements in the table       |
               |       Load Factor = -----------------------------------------       |
               |                              Size of the hash table                 |
               |_____________________________________________________________________| 
                
                    E.g, If internal capacity is 16 and the load factor is 0.75 then the number of buckets will automatically get increased when the table has 12 elements in it. 
        */
        
        // Effect on performance:   
        //    I]   Load factor and initial capacity are two main factors that affect the performance of HashSet operations.  
        
        //   II]   A load factor of 0.75 provides very effective performance with respect to time and space complexity. 
        
        //  III]   If we increase the load factor value more than that then memory overhead will be reduced (because it will decrease internal rebuilding operation) but, 
        //         it will affect the add  and search operation in the hashtable. 
        
        //   IV]   To reduce the rehashing operation we should choose initial capacity wisely. If the initial capacity is greater than the maximum number of entries divided by the load factor,  
        //         no rehash operation will ever occur.  
        
        /*
        Note:  The implementation in a HashSet is not synchronized, in the sense that if multiple threads access a hash set concurrently, and  
               at least one of the threads modifies the set,  it must be synchronized externally. This is typically accomplished by
               synchronizing on some object that naturally encapsulates the set. If no such object exists, the set should be  
               “wrapped” using the Collections.synchronizedSet method.This is best done at creation time, to prevent accidental unsynchronized  
               access to the set as shown below:
        */
        
        /*
            1] internal working: 
                All the classes of Set interface are internally backed up by Map. HashSet uses HashMap for storing its object internally.  
                You must be wondering that to enter a value in HashMap we need a key-value pair, but in HashSet, we are passing only one value. 
        
            2] Storage in HashMap: 
                Actually the value we insert in HashSet acts as a key to the map Object and for its value, java uses a constant variable.  
                So in the key-value pair, all the values will be the same. 
        */
        
            HashSet s = new HashSet(); 
            
            // creating 1 array list
            ArrayList a = new ArrayList(); 
            ArrayList b = new ArrayList(); 
            
            // adding some elements into the both arraylist 
            a.add("Robbert pattison"); 
            a.add("Ben affleak"); 
            a.add("Cristian bell");
            
            b.add("Robbert pattison"); 
            b.add("Ben affleak"); 
            b.add("Cristian bell");
            
            
           // b.add("Tobey Maguire"); 
           // b.add("Alfred gatfield"); 
           // b.add("Tom holand"); 
            
//            System.out.println(a); 
//            System.out.println(b);
            
//          s.add("sigmas"); 
            s.add(a); 
            s.add(b); 
            System.out.println(s);
            // now understand the size for arraylist and its internal storage by printing it. 
            System.out.println(s.size()); // 1 
            
            /*
            Explanation:
            
                 Before storing an Object, HashSet checks whether there is an existing entry 
                using hashCode() and equals() methods. In the above example, two lists are 
                considered equal if they have the same elements in the same order. When you 
                invoke the hashCode()  method on the two lists, they both would give the same 
                hash since they are equal. 
            */
            // HashSet does not store duplicate items,  if you give two Objects that are equal 
            // then it stores only the first one, here it is a.  
            

            // Constructors of HashSet class: 
            /*
            1. HashSet(): This constructor is used to build an empty HashSet object in which the 
                          default initial capacity is 16 and the default load factor is 0.75. 
                          If we wish to create an empty HashSet with the name hs, then, it can be  
                          created as:
            
            
            
                          HashSet<E> hs = new HashSet<E>(); 
            
            2. HashSet(int initialCapacity): This constructor is used to build an empty HashSet  
                                             object in which the initialCapacity is specified at  
                                             the time of object creation. Here, the default loadFactor 
                                             remains 0.75.
            
            
                          HashSet<E> hs = new HashSet<E>(int initialCapacity); 
            
            3. HashSet(int initialCapacity, float loadFactor): This constructor is used to build an  
                                                               empty HashSet object in which the initialCapacity 
                                                               and loadFactor are specified at the time of object creation. 
            
            
                      HashSet<E> hs = new HashSet<E>(int initialCapacity, float loadFactor);
            
            4. HashSet(Collection): This constructor is used to build a HashSet object containing all the elements from the given collection.  
                                    In short, this constructor is used when any conversion is needed from any Collection object to the HashSet object.  
                                    If we wish to create a HashSet with the name hs, it can be created as:


                      HashSet<E> hs = new HashSet<E>(Collection C);
            */
            
                        //          Performing Various Operations on HashSet
            
            // operation 1: addtion  
                        
            HashSet e = new HashSet(); 
            e.add(null); 
           
            
            e.add("Tobey Manguire"); 
            e.add("Andrew Gatfield"); 
            e.add("Tom holand"); 
            e.add("Andrew Gatfield"); 
            e.add(null); 
            e.add(7);
            System.out.println(e); 
            
            /*
            Operation 2: Removing Elements

            The values can be removed from the HashSet using the remove() method.
            */  
            
            e.remove(null);
            System.out.println(e); 
           
            /*
            Operation 3: Iterating through the HashSet
            Iterate through the elements of HashSet using the iterator() method.  
            Also, the most famous one is to use the enhanced for loop. 
           */ 
           
           Iterator i = e.iterator(); 
           while(i.hasNext()){
               System.out.println(i.next());
           } 
           
           /*
           Time Complexity of HashSet Operations: The underlying data structure for HashSet is hashtable.  
           So amortize (average or usual case) time complexity for add, remove and look-up (contains method) 
           operation of HashSet takes O(1) time.
           */ 
           
           // methoods
           /*
           1] clone()	Used to create a shallow copy of the set. 
           2] parallelStream()	Returns a possibly parallel Stream with this collection as its source.
           3] removeIf​(Predicate<? super E> filter)	Removes all of the elements of this collection that satisfy the given predicate. 
           4] toArray​(IntFunction<T[]> generator)	Returns an array containing all of the elements in this collection, using the provided generator function to allocate the returned array. 
           5] forEach​(Consumer<? super T> action)	Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception. 
           
           
           */
    }
}
