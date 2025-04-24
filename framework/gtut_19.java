import java.util.*; 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This is tutorial number 19: HashMap in java"); 
        // 1] HashMap<K, V> is a part of Java’s collection since Java 1.2.  
        // 2] This class is present in java.util package. 
        // 3] It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer).  
        // 4] One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace 
        //    the element of the corresponding key.
        // 5] It is legacy class. 
        // 6] It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, and you can access  
        //    them by an index of another type (e.g. an Integer). 
        // 7] One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element  
        //    of the corresponding key. 
        // 8] HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, but there should be only one null key  
        //    object and there can be any number of null values.
        // 9] This class makes no guarantees as to the order of the map. To use this class and its methods, you need to import java.util.HashMap package or  
        //    its superclass. 
        // 10] Insertion order is not retained. 
        // 11] Duplicate element can be added in case if key is diferent. 
        // 12] null  value can be stored. multiple null value can be added if key are different. 
        // 13] It does not depend that the data of both the key and value stored. 
        
        
        
        
        
        /*
            1]  Syntax: Declaration
                  public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
       
            2]  Parameters: It takes two parameters namely as follows:

                   The type of keys maintained by this map
                   The type of mapped values
        
            3] Constructors in HashMap is as follows:
                        HashMap provides 4 constructors and the access modifier of each is public which are listed as follows:
                                    HashMap()
                                    HashMap(int initialCapacity)
                                    HashMap(int initialCapacity, float loadFactor)
                                    HashMap(Map map)
             
        */
        /*
        Now discussing above constructors one by one alongside implementing the same with help of clean java programs.

            Constructor 1: HashMap() It is the default constructor which creates an instance of HashMap with an initial capacity of 16 and load factor of 0.75.
            Constructor 2: HashMap(int initialCapacity)  It creates a HashMap instance with a specified initial capacity and load factor of 0.75.
            Constructor 3: HashMap(int initialCapacity, float loadFactor)  It creates a HashMap instance with a specified initial capacity and specified load factor. 
            Constructor 4: HashMap(Map map): It creates an instance of HashMap with the same mappings as the specified map.
        */    
        
        // Implementation: 
        // 1. Declaration:
        HashMap<Integer,String> h = new HashMap <Integer,String>(); 
        // 2. Adding elements
        h.put(1, "Thomas Shelby"); 
        h.put(2, " Cristain bale"); 
        h.put(3, " RDJ"); 
        h.put(4, " Tobey Manguire"); 
        h.put(5, " Peter Parker");
        // h.put("g", 7);
        
        System.out.println("Presenting the list of sigmas using HashMap :\n"+h); 
        h.put(2, "robbert pattision");
        System.out.println("Presenting the updated list of sigmas using HashMap :\n"+h); 
        h.put(6, " Peter Parker");
        System.out.println("Presenting the list of sigmas using HashMap :\n"+h); 
        h.put(null, null); 
        h.put(7, null); 
        h.put(8, null);
        System.out.println("Presenting the list of sigmas using HashMap :\n"+h); 
        // 3. Changing Elements: After adding the elements if we wish to change the element, it can be done by again adding the element with the put() method.  
        h.put(2, "Rocky Bhai"); 
        System.out.println("Presenting the updated list of sigmas  using put() methood in HashMap :\n"+h);
        
        // 4.  Removing Element: In order to remove an element from the Map, we can use the remove() method. This method takes the key value and removes the mapping for a key from this map if it  
        //     is present in the map.
        h.put(9, "uava"); 
        System.out.println("Presenting the updated list of sigmas  using put() methood in HashMap :\n"+h);
        h.remove(9);
        System.out.println("List after removing 9th element :"+ h); 
        
        // 5.  Transversing is done by For LOOP. 
        
        // Internal Structure of HashMap
        /*
        Internally HashMap contains an array of Node and a node is represented as a class that contains 4 fields: 

                 int hash
                 K key
                 V value
                 Node next
        It's kind of LinkedList.

        */
        
        // Performance of HashMap: 
        /*
        Performance of HashMap depends on 2 parameters which are named as follows:

          I]  Initial Capacity -  It is the capacity of HashMap at the time of its creation (It is the number of buckets a  
                                  HashMap can hold when the HashMap is instantiated). 
          II] Load Factor  - It is the percent value of the capacity after which the capacity of Hashmap is to be increased (It is the percentage fill  
                             of buckets after which Rehashing takes place). 
        
          III] 3. Threshold – It is the product of Load Factor and Initial Capacity. In java, by default, it is (16 * 0.75 = 12).  
                              That is, Rehashing takes place after inserting 12 key-value pairs into the HashMap. 
        
          IV] Rehashing – It is the process of doubling the capacity of the HashMap after it reaches its Threshold. In java, HashMap continues to rehash(by default) in 
              the following sequence – 2^4, 2^5, 2^6, 2^7, …. so on. 
        */
        
        // Note : Read Unsynchronized HashMap after reading multithreading. 
        /* Time complexity of HashMap: HashMap provides constant time complexity for basic operations, get and put if the hash function is properly written and it disperses the elements properly among the 
           buckets. Iteration over HashMap depends on the capacity of HashMap and a number of key-value pairs. Basically, it is directly proportional to the capacity + size. Capacity is the number of buckets 
           in HashMap. So it is not a good idea to keep a high number of buckets in HashMap initially.
 
	   Applications of HashMap: HashMap is mainly the implementation of hashing. It is useful when we need efficient implementation of search, insert and delete operations. Please refer to the applications 
	   of hashing  for details.
	*/
        
        // Methods in HashMap:  
        // it has methood same as in Set interface.
        // 1] compute(K key, BiFunction<? super K, ? super V,? extends V> remappingFunction)	Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current 
        //   mapping). 
        // 2] computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)	If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null. 
        // 3] computeIfPresent(K key, BiFunction<? super K, ? super V,? extends V> remappingFunction)	If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.  
        // 4] get(Object key)	Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key. 
        // 5] keySet()	Returns a Set view of the keys contained in this map. 
        // 6] merge(K key, V value, BiFunction<? super V, ? super V,? extends V> remappingFunction)	If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value. 
        // 7] putAll(Map<? extends K,? extends V> m)	Copies all of the mappings from the specified map to this map. 
        // 8] replace(K key, V value)	Replaces the entry for the specified key only if it is currently mapped to some value. 
        // 9] replace(K key, V oldValue, V newValue)	Replaces the entry for the specified key only if currently mapped to the specified value. 
        // 10] replaceAll(BiFunction<? super K,? super V,? extends V> function) Replaces each entry’s value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

        
        System.out.println(); 
        System.out.println(); 
        System.out.println("Everything is fine!");
    }
}
	
