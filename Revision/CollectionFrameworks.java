package Revision;
import java.util.*; // this is used for importing the collection framework


public class CollectionFrameworks {
    public static void main(String[] args){
        /* collection interface is kind of the interface which get implemented by various classes for the purpose to store the data in different fashion, to manage it's access and deletion. 
        // if we consider the collection framework then  we can easily see 3 intrfaces which implements the collection frameworks which are as follows: 
            1. List 
            2. Queue 
            3. Set
    
        1. List - 
            - this is an interface which is the subinterface of the collection. 
            - the list interface is primirialy dedicated for list type of the data structure. 
            - the list interface usually used to store the elements in the list formate.
            - it get implemented by: 
                1. ArrayList
                2. Linked List
                3. Vector. 
    
                1. ArrayList: 
                    - these are the dynamic arrays which has the less computation power. 
                    - the arraylist is usually used to store the elements in hetrogenous type
        */
    
        // since the List is an interface hence we cannot instantiate it's object
        // Demonstration of the arraylist without the generics. 

        /* */        /* collection interface is kind of the interface which get implemented by various classes for the purpose to store the data in different fashion, to manage it's access and deletion. 
        // if we consider the collection framework then  we can easily see 3 intrfaces which implements the collection frameworks which are as follows: 
            1. List 
            2. Queue 
            3. Set
    
        1. List - 
            - this is an interface which is the subinterface of the collection. 
            - the list interface is primirialy dedicated for list type of the data structure. 
            - the list interface usually used to store the elements in the list formate.
            - it get implemented by: 
                1. ArrayList
                2. Linked List
                3. Vector. 
    
                1. ArrayList: 
                    - these are the dynamic arrays which has the less computation power. 
                    - the arraylist is usually used to store the elements in hetrogenous type if we not used the generics 
                    - can accept the null values. 
                    - slower in the computation. 
                    - How it works ?? 
                        - First memory allocated 
                        - Size is checked if it full 
                        - then new memory allocated for new list 
                        - elements are copied 
                        - old one is deleted. 
                    - non synchronised in nature. 

        */
    
        // since the List is an interface hence we cannot instantiate it's object
        /*
            List l = new ArrayList(); 
            l.add(1); 
            l.add(2); 
            l.add(3); 
            l.add("Sairaj"); 
            l.add("Rajput"); 
            l.add(null); 
            System.out.println(l); 
            
            // demonstration of the array list with generics 
            List<Integer> l1 = new ArrayList<Integer>(); // will access the methoods of the List interface. 
            l1.add(1); 
            l1.add(2); 
            // l1.add("sairaj"); // will get error since generics is used. 
            System.out.println(l1);
        */


        /*
                2. LinkedList: 
                    - stores the element in the form of the singly linked list. 
                    - non synchronised in nature. 
                    - insertion order is maintained
                    - can store the null values 
                    - can store the hetrogenous datatypes if generics are not used. 
                    - non synchronised in nature. 
                    
         */
        // Demonstration of the Linked List
	    // List l = new LinkedList(); 
        // l.add(1); 
        // l.add(2); 
        // l.add(3); 
        // l.add(4); 
        // l.add(null); 
        // l.add("sairaj");
        // l.add("bakulya");
        // l.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // System.out.println(l);
        
        
        // List<Integer> l1 = new LinkedList<Integer>(); 
        // l1.add(null);
        // // l1.add("sairaj"); 
        // l1.add(1);
        // System.out.println(l1);
        
        /*
                3. Vector: 
                    - stores the element in the form of the dynamic arrays. 
                    - synchronised in nature. 
                    - insertion order is maintained
                    - can store the null values 
                    - can store the hetrogenous datatypes if generics are not used. 
                    - can store the duplicate values also        
         */

        // List l = new Vector(); 
        // l.add(1); 
        // l.add(2); 
        // l.add(3); 
        // l.add(1); 
        // l.add(null);
        // l.add("sairaj");
        // System.out.println(l);
        
        
        // List<Integer> l1 = new Vector<Integer>(); 
        // l1.add(1); 
        // l1.add(2); 
        // l1.add(3); 
        // // l1.add("sariaj");
        // System.out.println(l1);
        // System.out.println("size of the stack is " + l1.size());
        // System.out.println("first element is " + l1.get(0)); 
        // l1.set(0, 69); 
        // System.out.println(l1);


        /*
                4. Stack: 
                    - LIFO 
                    - Synchronised in nature 
                    - if object is created in reference to the Vector then it used methoods defined in the Vector but follows the implementation from the Stack 
                    - can accept the null values and hetrogenous datatypes(if not generics defined). 
                    - 

                    code: 
                        Vector s = new Stack(); 
                        // since s is the object of stack but reference to the Vector 
                        // hence it uses the methoods defined in the Vector since it is object of Stack hence it prefers the 
                        // implementation of the Stack methoods
                        s.add(1); 
                        s.add(2); 
                        s.add(3);
                        System.out.println(s);
                        System.out.println("Size of the stack is: " + s.size()); 
                        System.out.println("The first element is: " + s.get(0));
                        s.set(1,5); // first argument is index and other is to value to be replaced.
                        System.out.println(s);
        */

            // Stack s1 = new Stack(); 
            // s1.push(1); 
            // s1.push(2); 
            // s1.push(3); 
            // s1.push(4); 
            // s1.push(null); 
            // s1.push("sairaj"); 
            // System.out.println(s1);
            
            // s1.pop(); 
            // System.out.println(s1);
            // System.out.println(s1.search(0)); // -1
            // System.out.println(s1.search(1)); // 0
            // System.out.println(s1.peek()); // removes top element and returns it
            // // System.out.println(s1.elements()); // returns top element but removes it

        /*
            2. Set: 
                - stores unique element
                - interface used to create the storing of the unique elements.  
                - in most of the implementations the order of the insertion is not maintained
                - it is an unordered colection of teh object. 
                - there are 2 interface which extends set interface which are navigable set and sorted set interface. 
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
        

        /*
            1. HashSet: 
                - uses hashtable its internal datastructure. 
                - store null values
                - store hetrogenous datatypes (no generics is used). 
                - insertion order is not maintained since the objects arranged according to their hashcode.  
                - non synchronised
                - How it works ? 
                    - elements start storing 
                    - when the size of the elements exceeds the product of the loadfactor and number of elements 
                    - it doubles it size. 

                - what is load factor ? 
                    - it tells of how much size of the hashtable filled leads to increase in size.
                    - let say if size is 16 and load factor is 0.75 then after completion 12 entries the rehashing occurs. 
                
        */
            // Set set  =  new HashSet(); 
            // set.add(1); 
            // set.add(2); 
            // set.add(3); 
            // set.add(0);
            // set.add(null); 
            // set.add("Sairaj");
            // System.out.println(set);

            Set<Integer> s1 = new HashSet<Integer>(); 
            s1.add(1); 
            s1.add(2); 
            s1.add(0); 
            s1.add(5);
            s1.add(-1);
            Iterator<Integer> it = s1.iterator(); 
            while(it.hasNext()){
                System.out.println(it.next());
            }

        /*
            2. LinkedHashSet: 
                - stores element in the form of the Doubly linked list 
                - retains the insertion order of an element 
                - stores the null values 
                - stores the hetrogenous datatypes(if generics are not defined)
        */

        // LinkedHashSet lhs = new LinkedHashSet(); 
        // lhs.add(1); 
        // lhs.add(2); 
        // lhs.add(3); 
        // lhs.add(0); 
        // lhs.add(-1);
        // lhs.add(null); 
        // lhs.add("sairaj");
        // System.out.println(lhs);
        
        // HashSet lhs1 = new LinkedHashSet(); 
        // lhs1.add(1); 
        // lhs1.add(2); 
        // lhs1.add(3); 
        // lhs1.add(0); 
        // lhs1.add(-1);
        // lhs1.add(null); 
        // // lhs1.add("sairaj");
        // System.out.println(lhs1);

        // System.out.println(lhs1.contains(0));
        // System.out.println(lhs1.headSet(7));
        // System.out.println(lhs1.subSet(1,7));
        // System.out.println(lhs1.tailSet(1));
        

        /*
            3. Sorted Set interface: 
                - extends the set interface 
                - it maintains the sorting of an elements in a sorting order. 
                - not allows hetrogenous datatypes
                - null values are not allowed. 
                - methoods: 
                    - add(val)
                    - last()
                    - first() 
                    - clone() 
                    - contains(val)
                    - subset(val1,val2)
                    - headset(val) 
                    - tailset(val) 


            4. Navigable Set interface: 
                - can navigate from assending order as well as in descending order. 
                - duplicate values are ignored and null values are not allowed. 
                - hetrogenous datatypes cannot be stored. 
                - it behaves as a sorted set and in addition it has the feature of the navigation. 
                - methoods: 
                    - headset(val) 
                    - tailset(val)
                    - subset(val1,val2) 
                    - add(val) 
                    - higher(val)
                    - lower(val)
                    - floor(val)
                    - descendingSet(val) -> it makes it navigable set
        */

        // demonstration of sorted set interface. 
        SortedSet<Integer> s11 = new TreeSet<Integer>(); 
        s11.add(1); 
        s11.add(2); 
        s11.add(3); 
        s11.add(5); 
        s11.add(4); 
        s11.add(6); 
        s11.add(8); 
        s11.add(7); 
        s11.add(0);
        System.out.println(s11);
        s11.remove(1); 
        System.out.println(s11);
        System.out.println(s11.first());
        System.out.println(s11.last());
        System.out.println(s11.contains(0));
        System.out.println(s11.headSet(7));
        System.out.println(s11.subSet(1,7));
        System.out.println(s11.tailSet(1));

        NavigableSet<Integer> s12 = new TreeSet<>(); 
        s12.add(1); 
        s12.add(2); 
        s12.add(3); 
        s12.add(5); 
        s12.add(4); 
        s12.add(6); 
        s12.add(8); 
        s12.add(7); 
        s12.add(0);
        
        // demonstration of navigable set interface. 
        NavigableSet<Integer> s13 = s12.descendingSet(); 
        System.out.println(s13);

        /*
            5. TreeSet: 
                - uses tree data structure.
                - it uses Red and Black tree which is self balancing in nature for storing the elements
                - no null values and hetrogenous datatypes are allowed 
                - it takes O(Log(N)) time for insertion and deletion. 
                - methoods: 
                    - add(val) 
                    - contains(val) 
                    - first() 
                    - last() 
                    - higher(val) 
                    - lower(val)
                    - headset(val)
                    - tailset(val) 
                    - subset(val1,val2)
                    - remove(val)
                    - descendingSet() -> if object is made in reference to the Navigable Set. 
        */


        /*
            3. Queue: 
                - adds elements in the FIFO order. 
                - implementations are the Deque and extended by PriorityQueue. 
                - stores duplicate values but cannot store the null values.
                - methods: 
                    - add(int indx,element)
                    - lastIndexOf(element)
                    - firstIndexof() 
                    - equals() 
                    - hashCode() 
                    - poll() -> returns head along with its removal
                    - element() -> returns head but without removal 
                    - peek() -> same as elements() 
        */

        // classes: 
        // 1. ArrayDeque: 
            /*
                - implements the deque interface 
                - adds elements from the both side of an array
                - non synchronised
                - implemented as a dynamic arrays. 
                - hetrogenous datatypes are allowed(if generics is not used). 
                - null values are not allowed
                - insertion order maintained. 
            */    

        // Deque d = new ArrayDeque(); 
        // d.add(1); 
        // d.add(2); 
        // d.add("sairaj"); 
        // // d.add(null);
        // d.add(4); 
        // d.add(5); 
        // d.add(6);
        // System.out.println(d);
        // d.addFirst(7); 
        // d.addLast(8); 
        // System.out.println(d.poll());
        // System.out.println("After using Poll Methood: "+d);
        // System.out.println(d.pop());
        // System.out.println("After using Pop Methood: " + d);
        
        // d.clear();
        // System.out.println(d);
        // d.offer(1); 
        // d.offer(2);
        // d.offer(4);
        // d.offer(5);
        // d.offer(6); 
        // d.offerFirst(9); 
        // d.offerLast(10);
        // System.out.println(d);
        
        
        // // offer works in same as of add Methood
        // // clear() -> clears whole list
        
        
        // System.out.println(d.getFirst());
        // System.out.println(d.getLast());
        
        // System.out.println(d.peek());
        // System.out.println(d.peekFirst());
        // System.out.println(d.peekLast()); // not removes elemnt
        // System.out.println(d);
        
        // // removeFirst,removeLast,pollFirst,pollLast, poll works as a same. 
        // // pop() works as a same. 
        // // toArrays() -> converts to arrays
        

        // 2. Priority Queue: 
        /*
            - elements are arranged based on their priority. 
            - maxheap/minheap
            - null values are not allowed to store. 
            - insertion order is not maintained
            - hetrogenous datatype is not allowed

        */

        // PriorityQueue pq = new PriorityQueue();

        // pq.add(5);
        // pq.add(1);
        // pq.add(9);
        // pq.add(3);
        // // pq.add("sairaj");
        // pq.add(5); 
        
        // System.out.println(pq);
        
        // // creating max Heap
        // PriorityQueue pq1 = new PriorityQueue(Collections.reverseOrder());
        // pq1.add(5);
        // pq1.add(1);
        // pq1.add(9);
        // pq1.add(3);
        // // pq.add("sairaj");
        // pq1.add(5);
        // System.out.println(pq1);
    

    // Map interface: 
    /*
            - Map is an interface which has another hirerchical order. 
            - if we talk about map then map interface usually stores the element in the form of the key and value pair. 
            - map is not subtype of the Collection Framework. 
            - map contains the unique keys 
            - characteristics: 
                1. Keys cannot be duplicated and each key is mapped to at the most one value. 
                2. order of the keys depends on the speicific implementation. 
                3. There are 2 interface extending the Map in java which are SortedMap and Navigable map. the class which extends the map are HashMap and LinkedHashMap. 
                4. duplicacy allowed only in case of the new keys. 
                5. Internally, for every element, a separate hash is generated and the elements are indexed based on this hash to make it more efficient.
                
            methods: 
                1. void clear() 
                2. boolean containsKey(Object) 
                3. boolean containsValue(Object) 
                4. entrySet() 
                5. equals() 
                6. get(Onject) 
                7. hashCode() 
                8. put(Object,Object) 
                9. keySet() 
                10. boolean isEmpty()
                11. putAll(Map) 
                12. remove(Object) 
                13. size() 
                14. getOrDefault(Object key, V defaultValue)	
                15. values() 
                16. merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction) 
                17. <E> putIfAbsent(K key, V value)        
    */
    
    /*
            1. HashMap: 
                - it is legacy class. 
                - it stores the element in the form of the key and value pair. 
                - HashMap is similiar to the hashtable but it is unsyncrhonised in nature. 
                - order of insertion in key is not retained since the elements are stored based on the hash generated from the value. 
                - it allows you to store the null keys as well. 
                - It does not depend that the data of both the key and value stored.
                - null value as a key and as a value is allowed to store. 
                - hetrogenous mapping only works if in case the generics is not defined.
                - Time complexity of HashMap: HashMap provides constant time complexity for basic operations, get and put if the hash function is properly written and it disperses the elements properly among the buckets. Iteration over HashMap depends on the capacity of HashMap and a number of key-value pairs. Basically, it is directly proportional to the capacity + size. Capacity is the number of buckets in HashMap. So it is not a good idea to keep a high number of buckets in HashMap initially.
    */

        // Map mp = new HashMap(); 
        // mp.put(0,"Milli"); 
        // mp.put(1,"Ramesh"); 
        // mp.put(2,"Kitty"); 
        // mp.put(3,"Bakulya"); 
        // mp.put(4,"Love birds"); 
        // mp.put(5,"Vadafone dog"); 
        // mp.put(6,"Kitli"); 
        // mp.put(7,"Kits"); 
        // mp.put(8,"K1"); 
        // mp.put(9,"K2");
        
        // // checking for hetrogenous datatypes
        // mp.put("Sairaj",69); // -> working
        // mp.put(null,"sairaj"); // -> working 
        // mp.put(null,"rajput"); // -> working - not multiple null we got as a key
        // mp.put("sairaj",null); // order of the storing depends on the hash
        // mp.put("rajput",null);  // multiple nulls can be stored.
        // System.out.println(mp); // insertion order is not retained. 
        // System.out.println(mp.get(0));
        // System.out.println(mp.size());
        // System.out.println(mp.entrySet());
        // System.out.println(mp.hashCode()); // for getting the hashcode of the map
        
        // mp.remove(null); // removing the elements
        // System.out.println(mp.containsKey(null)); // false 
        // System.out.println(mp.containsValue(null)); // true 
        // mp.clear(); // now clearing whole IllegalMonitorStateException
        
        // Map<Integer,String> mp1 = new HashMap<Integer,String>(); 
        // mp1.put(0,"Johan Liebert");
        // mp1.put(1,"Light Yagami"); 
        // mp1.put(2,"Friend");
        // System.out.println(mp1); // it is working
        
        // mp1.put(null,"Batman"); 
        // mp1.put(3,null);
        // // mp1.put(4,4); - not allowed 
        // // hetrogenous datatypes are not allowed. 
        // System.out.println(mp1);

    /*
            2. LinkedHashMap: 
                - stores the objects in key and values pair in the form of the doubly linked list. 
                - similiar to the hashmap but maintains the track of the order of insertion
                - contains the value based on key and implements Map interface and extends HashMap class. 
                - Non-synchronised
                - How it works ? 
                    1. it stores the elements in the form of the nodes which constitutes the doubly linked list. 
                    2. each node is represented as: 
                        2.1 Hash: All the input keys are converted into a hash which is a shorter form of the key so that the search and insertion are faster. 
                        2.2 Key: data is stored in the form of the key and value pair. 
                        2.3 Value: For every key, there is a value associated with it. This parameter stores the value of the keys. Due to generics, this value can be of any form. 
                        2.4 After: reference to the next node 
                        2.5 Before: reference to the previous node
                    3. non synchronised

                - order of insertion maintained
    */  

        // Map mp = new LinkedHashMap(); 
        // mp.put(0,"Milli"); 
        // mp.put(1,"Ramesh"); 
        // mp.put(2,"Kitty"); 
        // mp.put(3,"Bakulya"); 
        // mp.put(4,"Love birds"); 
        // mp.put(5,"Vadafone dog"); 
        // mp.put(6,"Kitli"); 
        // mp.put(7,"Kits"); 
        // mp.put(8,"K1"); 
        // mp.put(9,"K2");
        
        // // checking for hetrogenous datatypes
        // mp.put("Sairaj",69); // -> working
        // mp.put(null,"sairaj"); // -> working 
        // mp.put(null,"rajput"); // -> working - not multiple null we got as a key
        // mp.put("sairaj",null); // order of the storing depends on the hash
        // mp.put("rajput",null);  // multiple nulls can be stored.
        // System.out.println(mp); // insertion order is not retained. 
        // System.out.println(mp.get(0));
        // System.out.println(mp.size());
        // System.out.println(mp.entrySet());
        // System.out.println(mp.hashCode()); // for getting the hashcode of the map
        
        // mp.remove(null); // removing the elements
        // System.out.println(mp.containsKey(null)); // false 
        // System.out.println(mp.containsValue(null)); // true 
        // mp.clear(); // now clearing whole IllegalMonitorStateException
        
        // Map<Integer,String> mp1 = new LinkedHashMap<Integer,String>(); 
        // mp1.put(0,"Johan Liebert");
        // mp1.put(1,"Light Yagami"); 
        // mp1.put(2,"Friend");
        // System.out.println(mp1); // it is working
        
        // mp1.put(null,"Batman"); 
        // mp1.put(3,null);
        // // mp1.put(4,4); - not allowed 
        // // hetrogenous datatypes are not allowed. 
        // System.out.println(mp1);
        
    
    /*
            3. Sorted Map Interface: 
                - stores the objects in sorted order based on their key values. 
                - its sub interface is navigable sorted map. 
                - methoods: 
                    1. Object put(Object,Object)
                    2. Object get(Object) 
                    3. void remove(Object)
                    4. Set<E> entrySet() 
                    5. comparator() 
                    6. headMap(K) 
                    7. tailMap(K)
                    8. subMap(K from,K to)
    */

    /*
            TreeMap: 
                - The TreeMap in Java is used to implement Map interface and NavigableMap along with the AbstractMap Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation  time, depending on which constructor is used. 
                - implements the Navigable Map interface and Sorted Map interface. 
                - null values cannot be stored as a keys
                - implements the Red and black tree for storing the key in sorted manner.
                - time complexity is O(LogN)
    */

        // SortedMap mp = new TreeMap(); 
		// mp.put(1,"sairaj"); 
		// mp.put(0,"OO"); 
		// mp.put(3,"svsvs"); 
		// mp.put(4,"svsvsvs");
        // // mp.put("mahesh",0); - gives exception in case of hetrogenous keys
        // mp.put(2,null); // - works
        // mp.put(2,"mahesh");
		// System.out.println(mp);
		// System.out.println(mp.containsKey(1));
		// System.out.println(mp.containsValue("sairaj"));
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());
        // System.out.println(mp.entrySet());
        // System.out.println(mp.headMap(4));
        // System.out.println(mp.tailMap(0));
        
        
        // mp.remove(0); 
        // System.out.println(mp);
        // System.out.println(mp.comparator());
        
        // // using comparator
        // Comparator<String> reverseOrder = (s1, s2) -> s2.compareTo(s1);

        // // Initializing TreeMap with the custom comparator
        // TreeMap<String, Integer> map = new TreeMap<>(reverseOrder);

        // map.put("Joker", 2);
        // map.put("Riddler", 5);
        // map.put("Two Face", 3);

        // // Output will be sorted in reverse (descending) key order
        // for (Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

        // System.out.println(map.comparator());
        
        // NavigableMap mp = new TreeMap(); 
		// mp.put(1,"sairaj"); 
		// mp.put(0,"OO"); 
		// mp.put(3,"svsvs"); 
		// mp.put(4,"svsvsvs");
        // // mp.put("mahesh",0); - gives exception in case of hetrogenous keys
        // mp.put(2,null); // - works
        // mp.put(2,"mahesh");
		// System.out.println(mp);
		// System.out.println(mp.containsKey(1));
		// System.out.println(mp.containsValue("sairaj"));
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());
        // System.out.println(mp.entrySet());
        // System.out.println(mp.headMap(4));
        // System.out.println(mp.tailMap(0));
        
        
        // mp.remove(0); 
        // System.out.println(mp);
        // System.out.println(mp.comparator());
        

        /*
            HashTable: 
                - The Hashtable class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value. To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method. 

                - synchronised in nature 
                - stores the value in key and value pairs. 
                - insertion order is not retained 
                - null values and duplicate values are not allowed 
                - stores the hetrogenous datatypes both cases. 
                
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
