import java.util.*; 
public class gtut_9 {
    public static void main(String a[]) {
            System.out.println();
            System.out.println();
            System.out.println("This is tutorial number 9 from GFG : Array Deques"); 
            // The array deques implements  2 interface which are as follows: 
            //      1] deque. 
            //      2] Queue. 
            
           
            // present in java.util package. 
            // It is a kind of array. 
            
            /* 
                Important features: 
                    1] Array deques have no capacity restrictions and they grow as necessary to support usage. 
                    2] They are not thread-safe which means that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads. 
                    3] null elements are prohibited in ArrayDeque. 
                    4] ArrayDeque class is likely to be faster than Stack when used as a stack
                    5] ArrayDeque class is likely to be faster than LinkedList when used as a queue.
                    6] It is dynamically resizable from both sides. 
                        
                        public class ArrayDeque<E>  extends AbstractCollection<E>  implements Deque<E>, Cloneable, Serializable 
                        Here, E refers to the element which can refer to any class, such as Integer or String class. 
            */
            
            // constructors: 
            /*
                1] ArrayDeque(): This constructor is used to create an empty ArrayDeque and by default holds an initial capacity to hold 16 elements. 
                
                2] ArrayDeque(Collection<? extends E> c): This constructor is used to create an ArrayDeque containing all the elements the same as that of the specified collection. 
                    
                        ArrayDeque<E> dq = new ArrayDeque<E>(Collection col); 
                
                3] ArrayDeque(int numofElements): This constructor is used to create an empty ArrayDeque and holds the capacity to contain a specified number of elements. 
                        
                        ArrayDeque<E> dq = new ArrayDeque<E>(int numofElements);    
            */
            
            // Methoods in ArrayDeque are as follows: 
            // 1] It has all methoods that of queue, Deque and Collection interface. 
            // 2] clone()	The method copies the deque. 
            // 3] element() 	The method returns element at the head of the deque. 
            // 4] removeFirstOccurrence​(Object o)    Removes the first occurrence of the specified element in this deque (when traversing the deque from head to tail).
            // 5] removeLastOccurrence​(Object o)   Removes the last occurrence of the specified element in this deque (when traversing the deque from head to tail). 
            // 6] retainAll​(Collection<?> c)	Retains only the elements in this collection that are contained in the specified collection (optional operation). 
            // 7] spliterator()	Creates a late-binding and fail-fast Spliterator over the elements in this deque. 
            // 8] toArray​(T[] a)	Returns an array containing all of the elements in this deque in proper sequence (from first to the last element); the runtime type of the returned array is 
            //    that of the specified array. 
            // 9] equals()	Compares the specified object with this collection for equality.
            // 10]hashcode()	Returns the hash code value for this collection. 
            // 11] parallelStream()	Returns a possibly parallel Stream with this collection as its source. 
            // 12] stream()	Returns a sequential Stream with this collection as its source.
            // 13] toArray​(IntFunction<T[]> generator)	Returns an array containing all of the elements in this collection, using the provided generator function to allocate the returned array. 
            

            
            // initialising array deque with empty constructor. 
            ArrayDeque<String> d = new ArrayDeque<String>(); // initial capacity is 16 
            
            // operation: 
            // 1] Adding elements.  
                /* 
                    Operation 1: Adding Elements
                        In order to add an element to the ArrayDeque, we can use the methods  add(), addFirst(), addLast(), offer(), offerFirst(), offerLast() methods.

                             add()
                             addFirst()
                             addLast()
                             offer()
                             offerFirst()
                             offerLast()
                */

            d.add("sadaf"); 
            d.add("sanket"); 
            d.add("dhawal"); 
            d.add("Atharva"); 
            d.add("Prajwal"); 
            d.add("Tushar"); 
            d.add("Ritesh"); 
            d.add("Ammar"); 
            d.add("Sairaj"); 
            d.add("Yashraj"); 
            d.addFirst("Lakshmikant"); 
            d.addLast("Parth"); 
            
//            System.out.println(d);
            
            // 2] clear the whole list 
            d.clear();   
            d.add("vanshika"); 
            d.add("harshwardhan"); 
            d.add("om"); 
            d.add("parikta"); 
            d.add("ridhi"); 
            d.add("govind"); 
            d.add("sharvari"); 
            d.add("suyash"); 
            d.add("ketu"); 
            d.add("gaurav"); 
            d.addFirst("swayam"); 
            d.addLast("manasi"); 
//            System.out.println("Now new list is as follows:");
//            System.out.println(d);
            
            // 3] Iterating in both direction: 
            
            /* 
            Operation 2: Accessing the Elements

                After adding the elements, if we wish to access the elements, we can use inbuilt methods like getFirst(), getLast(), etc.

                        getFirst()
                        getLast()
                        peek()
                        peekFirst()
                        peekLast()
            
            */
                System.out.println();
                System.out.println();
                System.out.println("Iterating in forward direction");
                Iterator<String> i = d.iterator(); 
                    while(i.hasNext()){
                           System.out.println(i.next());
                    } 
                
                System.out.println();
                System.out.println();
                System.out.println("Iterating in backward direction");    
                Iterator<String> it = d.descendingIterator(); 
                    while(it.hasNext()){
                           System.out.println(it.next());
                    } 
                    
                System.out.println();
                System.out.println(); 
                
                System.out.println("The head of the current list is :" +d.element()); 
                
            // 4] toArray(): 
                System.out.println();
                System.out.println();
                Object[] h = new Object[20];  
                h = d.toArray(); 
                
            // 5] Removing an element 
            /* In order to remove an element from a deque, there are various methods available. Since we can also remove from both the ends, the deque interface provides us with removeFirst(), 
            removeLast() methods. Apart from that, this interface also provides us with the poll(), pop(), pollFirst(), pollLast() methods where pop() is used to remove and return the head of the 
            deque. However, poll() is used because this offers the same functionality as pop() and doesn’t return an exception when the deque is empty. These sets of operations are as listed below as 
            follows:

                         remove()
                         removeFirst()
                         removeLast()
                         poll()
                         pollFirst()
                         pollLast()
                         pop()
            */
            
            // ArrayDeque follows insertion order but not sorting order. 
            
                    
    }    
}
