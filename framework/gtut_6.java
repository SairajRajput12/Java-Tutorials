import java.util.*;

/**
 *
 * @author dell
 */
public class gtut_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("this is tutorial number 6 from gfg"); 
        
        // queue interface in java 
            // 1]  The Queue interface is present in java.util package and extends the Collection interface. 
            // 2]  FIFO (First In First Out) 
            // 3]  It is an ordered list of objects with its use limited to inserting elements at the end of the list and 
            //     deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.
            //  Obj is the type of the object to be stored in Queue 
             // syntax:        Queue<Obj> queue = new PriorityQueue<Obj> ();  
            // Implementation:     
             Queue<String> q = new PriorityQueue<>(); 
                q.add("sairaj"); 
                q.add("tushar"); 
                q.add("yashraj"); 
                q.add("dhawal"); 
                q.add("sanket"); 
                q.add("lakshmikant"); 
                q.add("sadaf"); 
                q.add("atharva"); 
                q.add("prajwal"); 
                q.add("ritesh"); 
                q.add("ammar"); 
                q.add("parth"); 
//                q.add(null); 
//                q.add(null); 
                q.add("sairaj"); 
                
             
             System.out.println(q);
             System.out.println("Ammar has left the addmission"); 
                 
             System.out.println("the admission is cancelled by ammar is :"+ q.remove("ammar"));
             // then the list will be 
             System.out.println(q); 
             
             // The first student of the queue is: 
             System.out.println(q.peek());
             
             // The total number of the list is
             System.out.println("the total number of the members in the queue is :"+  q.size()); 
             // To remove the head of queue. 
             // you can also use only remove() methood without passing any index or argument in it.
            
             // From this above programme we have concluded that: 
             //     queue does not follows insertion order but follows sorting order. 
             // Operations on the queue interface: 
             //     1] Adding the elements. 
                      // done 
             //     2] Removing the elements. 
                      // done
                      
                      /* 
                             System.out.println("Initial Queue " + pq);
                             pq.remove("Geeks");
                             System.out.println("After Remove " + pq);
                             System.out.println("Poll Method " + pq.poll());
                             System.out.println("Final Queue " + pq);         
                      */
             //     3] Iterating the elements. 
                Iterator i = q.iterator(); 
//                System.out.println(i); 
                while(i.hasNext()){
                    System.out.println(i.next());
                }
//                System.out.println(i); 
          

            /*
              
            // Features of Queue: 
               1] The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. 
                  It follows FIFO concept.

               2] The Java Queue supports all methods of Collection interface including insertion, deletion, etc.

               3] LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
               
               4] If any null operation is performed on BlockingQueues, NullPointerException is thrown.

               5] The Queues which are available in java.util package are Unbounded Queues.

               6] All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively. 
                  The Deques support element insertion and removal at both ends. 
            
               7] It can't store null values. 

               8] It can store the duplicate value. 

               

            // Classes that implement the Queue Interface:
              // 1] PriorityQueue: PriorityQueue class which is implemented in the collection framework provides us a way to process the 
                    objects based on the priority.It is known that a queue follows the First-In-First-Out algorithm, but sometimes the 
                    elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play. 
                    
            
                 2]  LinkedList is a class which is implemented in the collection framework which inherently implements the linked list data
                     structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is 
                     a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element 
                     is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or 
                     queues. 

                     // it follows insertion order 
                 3]  PriorityBlockingQueue is to be noted that both the implementations, the PriorityQueue and LinkedList are not thread-safe. 
                     PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed. 
                     PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations. 
                     Since it is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError. Let’s see how to create a queue object using this
                     class.                
            */
            
            /*
                Methoods in Queue interface: 
                    1] add(int index, element): This method is used to add an element at a particular index in the queue. When a single parameter is passed, it simply adds the element at the end of the queue.
                    2] The queue has all methood same as that of Collection. 
                    3] lastIndexOf(element): returns the index of the last occurence of the element and will return -1 if element is not present.
                    4] equals(element): compare the equality of the given element with the elements present in the queue. 
                    5] hashCode(): This methood returns the hascode of the particular element of the queue. 
                    6] Object poll(): This methood removes the head of the queue or returns the null if the queue is empty. 
                    7] Object element(): This methood is used to retrive the head of the queue but it does not remove it. 
                    8] Object peek(): This method is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. 
            
            */ 
            Iterator ic = q.iterator(); 
//                System.out.println(i); 
            int inti=0;    
            while(ic.hasNext()){
                     
                    System.out.println("The hascode of the "+ inti+ " th element is :"+ic.hashCode());
                    inti++; 
                    System.out.println(ic.next());
          
                }
            
            
            System.out.println("The hascode of the first element is :"+q.hashCode()); 
            
            
                    
    }
}
