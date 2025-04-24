import java.util.*; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This is tutorial number 18: Map interface");
        /*
            1] This interface is present in java.util package. 
            2] The Map interface is not a subtype of the Collection interface.  
              Therefore it behaves a bit differently from the rest of the collection types. 
            3] A map contains unique keys.
            4] Maps are perfect to use for key-value association mapping such as dictionaries. 
            5] The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys.  
            6] Some common scenarios are as follows for an example:  
                *     A map of error codes and their descriptions. 
                *     A map of zip codes and cities. 
                *     A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages. 
                *     A map of classes and students. Each class (key) is associated with a list of students (value). 
        
        
            7] Map hm = new HashMap(); 
                        // Obj is the type of the object to be stored in Map 
        
            8]Characteristics of a Map Interface: 
                
                I]   A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and  
                     null values like the HashMap and LinkedHashMap, but some do not like the TreeMap. 
                
                II]  The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap have predictable orders,  
                     while HashMap does not. 
                    
                III] There are two interfaces for implementing Map in java. They are Map and SortedMap, and three classes: HashMap, TreeMap, and  
                     LinkedHashMap. 
            
            9] Insertion order us not retained and sorted order is follwed.
            
            10] Internally, for every element, a separate hash is generated and the elements are indexed based on this hash to make it more efficient. 
            
            11] Duplicacy is allowed only in case of new key. 
        */ 
        
        
        // methoods of Map interface: 
        // 1]  clear()	 
        // 2]  containsKey(Object)   This method is used to check whether a particular key is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.	 
        // 3]  containsValue(Object) This method is used to check whether a particular value is being mapped by a single or more than one key in the Map. It takes the value as a parameter and returns True if that value is mapped by any of the key in the map. 
        // 4]  entrySet()            This method is used to create a set out of the same elements contained in the map. It basically returns a set view of the map or we can create a new set and store the map elements into them. 
        // 5]  equals(Object o)      This method is used to create a set out of the same elements contained in the map. It basically returns a set view of the map or we can create a new set and store the map elements into them. 
        // 6]  get(Object)	This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key. 
        // 7]  hashCode()	This method is used to generate a hashCode for the given map containing keys and values. 
        // 8]  isEmpty()	This method is used to check if a map is having any entry for key and value pairs. If no mapping exists, then this returns true. 
        // 9]  keySet()	This method is used to return a Set view of the keys contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa. 
        // 10] put(Object, Object)	This method is used to associate the specified value with the specified key in this map. 
        // 11] putAll(Map)	This method is used to copy all of the mappings from the specified map to this map. 
        // 12] remove(Object)	This method is used to remove the mapping for a key from this map if it is present in the map. 
        // 13] size()	This method is used to return the number of key/value pairs available in the map. 
        // 14] values()	This method is used to create a collection out of the values of the map. It basically returns a Collection view of the values in the HashMap. 
        // 15] getOrDefault(Object key, V defaultValue)	Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key. 
        // 16] merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value. 
        // 17] putIfAbsent(K key, V value)	If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the curassociaterent value.              
   //Implementation:      
        // Performing Various Operations using Map Interface and HashMap Class 
        

        // 1] Adding elements: 
                // Declaration 
                Map<Integer, String> m = new HashMap<Integer,String>(); 
                m.put(1," sairaj"); 
                m.put(2," mammi"); 
                m.put(3, " didi"); 
                m.put(4," papa"); 
                m.put(5, "Boka"); // key and value can be stored with any data type  
                m.put(5,"kitty"); // Here, the value of key 5 is updated.  
               //  m.put(null,null );
                System.out.println("Initial Map :"+m); // It can store null values. 
        // 2] Changing Element  
                m.put(5, "K1 and K2"); 
                m.put(6, "Kittli"); 
                m.put(7, "Boka"); 
                m.put(8,"Ghanti wali manjar");
                System.out.println("Updated List :"+ m);
                
        // 3] Removing Elements  
        
                m.remove(5); 
                m.remove(6); 
                m.remove(7); 
                System.out.println("Updated List After remving some elements  :"+ m); 
                
                        
        // 4] Iterating through the Map: But if it get null value then it will throw NullPointer Exception.
               for (Map.Entry mapElement : m.entrySet()){
                        int key = (int)mapElement.getKey();
                // Finding the value
                    String value = (String)mapElement.getValue();
                    System.out.println(key + " : "+ value);
               }
        
        
        System.out.println(); 
        System.out.println(); 
        System.out.println("Everything is fine!");
    }
}
















