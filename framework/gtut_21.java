import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("This tutorial number 21: LinkedHashMap ");
        // 1] The LinkedHashMap Class is just like HashMap with an additional feature of maintaining an order of elements inserted into it.  
        // 2] HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion,  
        //    which the LinkedHashMap provides where the elements can be accessed in their insertion order. 
        // 3] Important Features of a LinkedHashMap are listed as follows: 
                /*
                        1] A LinkedHashMap contains values based on the key. It implements the Map interface and extends the HashMap class. 
                        2] It contains only unique elements. 
                        3] It may have one null key and multiple null values. 
                        4] It is non-synchronized. 
                        5] It is the same as HashMap with an additional feature that it maintains insertion order. For example, when we run the  
                           code with a HashMap, we get a different order of elements.
                        6] It prints the elements in same order as they were inserted.
                */
        // 4] Syntax: 
        /*
                public class LinkedHashMap<K,​V> extends HashMap<K,​V> implements Map<K,​V>    
                    Here, K is the key Object type and V is the value Object type 
                            K – The type of the keys in the map.
                            V – The type of values mapped in the map.
        */
        
        // 5] How LinkedHashMap Work Internally? 
        /*
                    1] In this class, the data is stored in the form of nodes. The implementation of the LinkedHashMap is very similar to a doubly-linked list. 
                    2] Therefore, each node of the LinkedHashMap is represented as: 
                               1)  Hash   :  All the input keys are converted into a hash which is a shorter form of the key so that the search and insertion are faster.
                               2)  Key    :  Since this class extends HashMap, the data is stored in the form of a key-value pair. Therefore, this parameter is the key to the data. 
                               3)  Value  :  For every key, there is a value associated with it. This parameter stores the value of the keys. Due to generics, this value can be of any form.
                               4)  After  :  Since the LinkedHashMap stores the insertion order, this contains the address to the next node of the LinkedHashMap. 
                               5)  Before :  This parameter contains the address to the previous node of the LinkedHashMap 
                   
        */
        
        // 6] Non- Synchronized LinkedHashMap 
        // 7] Constructors: 
                /*
                        1]  LinkedHashMap(): This is used to construct a default LinkedHashMap constructor 
                        2]  LinkedHashMap(int capacity): It is used to initialize a particular LinkedHashMap with a specified capacity. 
                        3]  LinkedHashMap(Map<? extends K,​? extends V> map): It is used to initialize a particular LinkedHashMap with the elements of the specified map. 
                        4]  LinkedHashMap(int capacity, float fillRatio): It is used to initialize both the capacity and fill ratio for a LinkedHashMap. A fillRatio also called as loadFactor  
                            is a metric that determines when to increase the size of the LinkedHashMap automatically. By default, this value is 0.75 which means that the size of the map is  
                            increased when the map is 75% full. 
                        5]  LinkedHashMap(int capacity, float fillRatio, boolean Order): This constructor is also used to initialize both the capacity and fill ratio for a LinkedHashMap along  
                            with whether to follow the insertion order or not. 
        
                            Here, For the Order attribute, true is passed for the last access order and false is passed for the insertion order.
                */ 
        // Operations performed: 
            // Declaration: 
                LinkedHashMap <Integer , String> h = new LinkedHashMap(); 
                h.put(0, " Dr. manhattan"); 
                h.put(1, " Lucifer");  
                h.put(3, " Iron man"); 
                h.put(4," Dr. supremen strange"); 
                h.put(2, " Wanda"); 
                h.put(5, " Dr.Doom");
                System.out.println("Old List :"+h);
                h.remove(1); 
                
                System.out.println("Updated List :"+h); 
                for(Map.Entry<Integer, String> EachEle : h.entrySet()){
                    System.out.println(EachEle.getKey() + " " + EachEle.getValue()); 
                }
                
                
                System.out.println(); 
                System.out.println(); 
                System.out.println("Everything is fine!");
                
                
    }
}