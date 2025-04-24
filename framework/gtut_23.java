import java.util.*; 
public class gtut_23
{
	public static void main(String[] args) {
		System.out.println("This is tutorial 23: TreeMap");
		// 1] The TreeMap in Java is used to implement Map interface and NavigableMap along with the AbstractMap Class.  
		//    The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation  
		//    time, depending on which constructor is used.

        // 2] Features of a TreeMap: 
        /*
                 i]   This class is a member of the Java Collections Framework. 
                 ii]  The class implements Map interfaces including NavigableMap, SortedMap, and extends AbstractMap class. 
                 iii] TreeMap in Java does not allow null keys (like Map) and thus a NullPointerException is thrown. However, multiple null 
                      values can be associated with different keys. 
                 iv]  Entry pairs returned by the methods in this class and its views represent snapshots of mappings at the time they were  
                      produced. They do not support the Entry.setValue method. 
                      
                      
        */
        
        // 3] Constructors in TreeMap : 
        /* 
                i]   TreeMap() : This constructor is used to build an empty treemap that will be sorted by using the natural order of its keys. 
                ii]  TreeMap(Comparator comp) : This constructor is used to build an empty TreeMap object in which the elements will need an external specification of the sorting order.
                iii] TreeMap(Map M) : This constructor is used to initialize a TreeMap with the entries from the given map M which will be sorted by using the natural order of the keys.
                iv]  TreeMap(SortedMap sm) : This constructor is used to initialize a TreeMap with the entries from the given sorted map which will be stored in the same order as the given sorted map.
        */ 
        
        
        // 4] Methods in the TreeMap Class : disscussed in sorted tree map. 
        // 5] Performing Various Operations on TreeMap : 
        
        //  1]  Operation 1: Adding Elements 
         // Default Initialization of a TreeMap
        TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
   
        // Inserting the elements in TreeMap
        // using put() method
        tm1.put(3, "Geeks");
        tm1.put(2, "For");
        tm1.put(1, "Geeks");
        System.out.println(tm1);
        
        // same methoods is  use in another other operations
          // For-each loop for traversal over Map
        // via entrySet() Method
        for (Map.Entry mapElement : tm1.entrySet()) {
  
            int key = (int)mapElement.getKey();
  
            // Finding the value
            String value = (String)mapElement.getValue();
  
            // Printing the key and value
            System.out.println(key + " : " + value);
        }
       
       
        
        
	}
}


