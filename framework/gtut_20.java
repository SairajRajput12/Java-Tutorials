import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This is tutorial number 20: HashTable");
        // 1]   The Hashtable class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.  
        //      To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.   
       
        // 2]   Features of Hashtable: 
                /*
                        1]  It is similar to HashMap, but is synchronized. 
                        2]  Hashtable stores key/value pair in hash table. 
                        3]  In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and  
                            the resulting hash code is used as the index at which the value is stored within the table.
                        4]  The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75. 
                        5]  HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration. 
                        6] Insertion order is not retained.
                        7] Key is not get duplicated. 
                        8] It can't store null value
                        9] It can't store duplicate value if keys are different.Otherwise it will going to update it. 
                        10] Here, it can store Hetrogenous data-type both in case of key and value.
        
                */  
        // 3] Type Parameters:

            // * K – the type of keys maintained by this map
            // * V – the type of mapped values
            // Constructors: 
                // 1. Hashtable(): This creates an empty hashtable with the default load factor of 0.75 and an initial capacity is 11. 
                // 2. Hashtable(int initialCapacity): This creates a hash table that has an initial size specified by initialCapacity and the default load factor is 0.75. 
                // 3. Hashtable(int size, float fillRatio): This version creates a hash table that has an initial size specified by size and fill ratio specified by fillRatio.  
                //    fill ratio: Basically, it determines how full a hash table can be before it is resized upward and its Value lies between 0.0 to 1.0 
                // 4. Hashtable(Map<? extends K,? extends V> m): This creates a hash table that is initialized with the elements in m. 
                //     e.g, Hashtable<K, V> ht = new Hashtable<K, V>(Map m); 
                            /*
                      // Each constructor code: 
                            1]  Hashtable<Integer, String> ht1 = new Hashtable<>();  ---------------> This is using default constructor. 
                            2]  Hashtale <Integer , String> ht1 = new Hashtable<>(9);---------------> This is using which creates HashTable of initial capacity 9. 
                            3]  Hashtable<Integer, String> ht = new Hashtable<Integer, String>(3, 0.5f);-----------> This is by specifying the fill ratio and initial capacity of Hashtable. (fill ratio varies between 0.0f to 1.0f) 
                            4]   Map<Integer, String> hm = new HashMap<>(); // No need to mention generic type twice. 
                                      // Initialization of a Hashtable
                                 // using Generics
                                     Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(hm);----------------> This creates hashtable initialised with elements of hm. 
        
            
                            */ 
                            
        // 4] Performing Various Operations on Hashtable:   
        /*
            1. Adding Elements:
            2. Changing Elements:
            3. Removing Element: 
            4. Traversal of a Hashtable: 
        */ 
        
        Hashtable <String , Integer>  ht = new Hashtable<String,Integer>(); 
       
        // Declaration:
        ht.put("sairaj", 20); 
        ht.put("Dhiraj", 19); 
        ht.put("rushikesh", 18); 
        ht.put("Aditya", 17); 
        ht.put("Wanda", 16); 
        ht.put("One", 15); 
        ht.put("Aniket", 14); 
        ht.put("Omkar", 13); 
        ht.put("Soham", 12); 
        ht.put("aditya", 22);
        ht.put("yuvraj", 22);
//        System.out.println("Adding null key and null value");
        ht.put("Ajay", 56); 
        // ht.put("Ajay", "Ajay"); 
        System.out.println("After adding 12 elements The final capacity of the HashTable is :"+ht.size());

        
//        System.out.println("Adding null key and null value");
        // 3. Removing Element: 
        ht.remove("One");
        
        // Transversal in HashTable: 
        
        
        System.out.println(ht);
        System.out.println(); 
        System.out.println(); 
        
        for (Map.Entry<String, Integer> e : ht.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue()); 
        }    
        System.out.println(); 
        System.out.println(); 
       
        System.out.println("Everything is fine!"); 
        
        // 5] Internal Working of Hashtable: 
                    // *    Hashtable datastructure is an array of buckets which stores the key/value pairs in them.  
                    //      It makes use of hashCode() method to determine which bucket the key/value pair should map.
        
                    // *    The hash function helps to determine the location for a given key in the bucket list. Generally,  
                    //      hashcode is a non-negative integer that is equal for equal Objects and may or may not be equal for unequal Objects.  
        
                    // *    It is possible that two unequal Objects have the same hashcode. This is called a collision. To resolve collisions, hashtable  
                    //      uses an array of lists.  
        
                    // *    The pairs mapped to a single bucket (array index) are stored in a list and list reference is stored in the array index. 
        
        // 6]  Methoods of HashTable: 
        /*
            1] elements()	Returns an enumeration of the values in this hashtable. 
            2] entrySet()	Returns a Set view of the mappings contained in this map. 
            3] get(Object key)	Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key. 
            4] keys()	Returns an enumeration of the keys in this hashtable. 
            5] values()	Returns a Collection view of the values contained in this map. 
            6] putIfAbsent​(K key, V value)	If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and  
                                                returns null, else returns the current value.  
       
        */

    }
}
