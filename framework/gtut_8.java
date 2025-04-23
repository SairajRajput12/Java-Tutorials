import java.util.*; 

/**
 *
 * @author dell
 */
public class gtut_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
            Deque interface present in java.util package is a subtype of the queue interface.
            The Deque is related to the double-ended queue that supports the addition or removal of elements from either end of the data structure.         
            It can either be used as a queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO). 
            Deque is the acronym for double-ended queue.
            // Obj is the type of the object to be stored in Deque Deque<Obj> deque = new ArrayDeque<Obj> ();
        */
        
        // Obj is the type of the object to be stored in Deque 
//                Deque<Object> deque = new ArrayDeque<Object> (); 
    // Implementation: 
    
                Deque <String> d = new LinkedList<String>();
                    d.add("1 (head)"); 
                    d.add("2 (tail)"); 
                    d.add("3 (head)"); 
                    d.add("4 (tail)"); 
                    d.add("5 (head)"); 
                    d.add("6 (tail)"); 
                    d.add("7 (head)"); 
                
                System.out.println(d); 
                
                // we can remove the last and first element as followss 
                    d.removeFirst(); 
                    d.removeLast(); 
                System.out.println("After removing the first and the last element the resulted queue will be as follows\n"+d);     
                
                // Operations performed in the queue is: 
                
                /*
                Adding Elements: In order to add an element in a deque, we can use the add() method. The difference between a queue and a deque is that in deque, 
                the addition is possible from any direction. Therefore, there are other two methods available named addFirst() and addLast() which are used to add 
                the elements at either end. 
                */
                
                d.addFirst("1(head)"); 
                d.addLast("7(head)"); 
                System.out.println(d); 
                
                /*
                2. Removing Elements: In order to remove an element from a deque, there are various methods available. Since we can also remove from both the ends, 
                   the deque interface provides us with removeFirst(), removeLast() methods. Apart from that, this interface also provides us with the poll(), pop(), 
                   pollFirst(), pollLast() methods where pop() is used to remove and return the head of the deque. 
                   However, poll() is used because this offers the same functionality as pop() and doesnt return an exception when the deque is empty. 
                */
                
                /*
                3. Iterating through the Deque: Since a deque can be iterated from both the directions, the iterator method of the deque interface provides us two ways to iterate. 
                    One from the first and the other from the back. 
                */
                
                //In dequeue for iterating from last element we generally use descendingIterator() methood 
                
                Iterator<String> is = d.iterator(); 
                System.out.println(); 
                System.out.println("Iterating in assending order");
                while(is.hasNext()){
                    System.out.println(is.next());
                }
                
                Iterator<String> i = d.descendingIterator(); 
                System.out.println(); 
                System.out.println("Iterating in descending order");
                // Iterating in descending order
                while(i.hasNext()){
                    System.out.println(i.next());
                }
                
    // Classes that implements it: 
    /*
    ArrayDeque: ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array. 
        This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 
        Array deques have no capacity restrictions and they grow as necessary to support usage. They are not thread-safe which means 
        that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads. 
        ArrayDeque class is likely to be faster than Stack when used as a stack. ArrayDeque class is likely to be faster than LinkedList 
        when used as a queue. Let’s see how to create a queue object using this class.  
    */
    
    // The methoods which are present in the queue:
    //    1] It has methood same as queue 
    //    2] descendingIterator()	This method returns an iterator for the deque. The elements will be returned in order from last(tail) to first(head). 
    //    3] getFirst()	This method is used to retrieve, but not remove, the first element of this deque.
    //    4] getLast()	This method is used to retrieve, but not remove, the last element of this deque.
    //    5] offer(element) This method is used to add an element at the head of the queue. This method is preferable to addFirst() method since this method does not throws an exception when the capacity of the container is full since it returns false. 
    //    6] offerLast(element): This method is used to add an element at the tail of the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false. 
    //    7] peekFirst(): This method is used to retrieve the element at the head of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty
    //    8] peekLast() : This method is used to retrieve the element at the tail of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty.
    //    9] pollLast() : This method is used to retrieve and remove the element at the tail of the deque. This method returns null if the deque is empty. 
    //    10] pollFirst() : This method is used to retrieve and remove the element at the head of the deque. This method returns null if the deque is empty.
    //    11] removeFirst()	This method is used to remove an element from the head of the queue.
    //    12] removeLast()	This method is used to remove an element from the tail of the queue.
    
    
    // Here in Dequqe we can add multiple null values. 
    // It follows insertion order. 
    // It does not follows sorting order. 
            d.add(null);  
            d.add(null); 
            System.out.println(d); 
    }
}
