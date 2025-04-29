import java.util.*; 

public class gtut_22{
    public static void main(String args[]){
        System.out.println("This is tutorial number 22:Sorted map interface in java ");
        /* 
        1] SortedMap is an interface in the collection framework. This interface extends the Map i
        interface and provides a total ordering of its elements (elements can be traversed in sorted  
        order of keys).  
       
        2] using a TreeMap when you want a map that satisfies the following criteria:  
              I]   null key or null value is not permitted.
              II]  The keys are sorted either by natural ordering or by a specified comparator.
        
        3] Type Parameters:
                K – the type of keys maintained by this map
                V – the type of mapped values
        
        4] The parent interface of SortedMap is Map<K, V>.  

        5] The subInterfaces of SortedMap are ConcurrentNavigableMap<K, V>, NavigableMap<K, V>.

        6] SortedMap is implemented by ConcurrentSkipListMap, TreeMap. 
        
        7] Creating SortedMap Objects: Since SortedMap is an interface, objects cannot be created of the type SortedMap. 
           We always need a class that extends this list in order to create an object. And also, after the introduction  
           of Generics in Java 1.5, it is possible to restrict the type of object that can be stored in the SortedMap. 
           This type-safe map can be defined as:
           
                 // Obj1, Obj2 are the type of the object to be stored in SortedMap
                 SortedMap<Obj1, Obj2> set = new TreeMap<Obj1, Obj2> ();
        
        8] Performing Various Operations on SortedMap : 
        
        9] All elements are arranged in increasing order based on the value of the keys  
        
        */
        
        //1]  Adding elements: 
        // Default Initialization of a
        // SortedMap
        SortedMap<Integer, String> tm1 = new TreeMap<Integer, String>();
        tm1.put(1,"sairaj");
        tm1.put(4,"sai");
        tm1.put(3,"raj");
        tm1.put(2,"The king"); 
        tm1.put(5,"The king of magics"); 
        System.out.println(tm1);
    
    
        // 2] Changing Elements:
        tm1.put(2,"Aligator sairaj"); 
        System.out.println(tm1);
        
        // 3] Removing element 
        tm1.remove(2); 
        System.out.println(tm1);
        
        // 4] using iteration 
        Set s = tm1.entrySet();
        // Using iterator in SortedMap
        Iterator i = s.iterator();
  
        // Traversing map. Note that the traversal
        // produced sorted (by keys) output .
        while (i.hasNext()) {
            Map.Entry m = (Map.Entry)i.next();
  
            int key = (Integer)m.getKey();
            String value = (String)m.getValue();
  
            System.out.println("Key : " + key
                               + "  value : " + value);
        }
        
        // 10] The class which implements the SortedMap interface is TreeMap.
        
        // 11] 
        
        /*  
        // using comparator
        SortedMap<String, String> tm
            = new TreeMap<String, String>(new Comparator<String>() {
                  public int compare(String a, String b)
                  {
                      return b.compareTo(a);
                  }
              });
        
        */
        
        // 12] Methods of SortedMap interface: 
        /* 
          1] comparator()	Returns the comparator used to order the keys in this map, or  
             null if this map uses the natural ordering of its keys. 
             
          2] entrySet()	Returns a Set view of the mappings contained in this map
        
          3] headMap(K toKey)	Returns a view of the portion of this map whose keys are strictly less than toKey 
          
          4] subMap(K fromKey, K toKey)	Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive
          
          5] tailMap(K fromKey)	Returns a view of the portion of this map whose keys are greater than or equal to fromKey. 
          
        
        */
    }
}




