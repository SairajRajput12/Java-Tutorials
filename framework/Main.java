import java.util.*; 
 
public class Main
{
	public static void main(String[] args) {
        // difference between list iterrator and List iterator. 
        List a=new ArrayList(); 
        a.add("sairaj");
        a.add("IT engineer"); 
        a.add("20"); 
        System.out.println(a); 
        
        // how to retrive each object from collction object.we use cursors as follows:  
        // there are 3 types of cursors: 
        // 1] Iterator. 
        // 2] List iterator. 
        // 3] Enumeration.
        
        //A]  using iterator
        Iterator it=a.iterator(); 
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        } 
       		// we can get iterator cursor using .iterator() methood. 
        	// we can use iterator cursor to any collection of object 
        	// we can retrive the elements in only forward direction. 
        	// by using iterator we can only read and remove elements.
        
        System.out.println();
        
        
        //B] List iterator 
        ListIterator i=a.listIterator(); 
        while(i.hasNext()){
            System.out.print(i.next()+" "); 
        } 
        	// we can get  ListIterator using .listIterator() methood
        	// we can use iterator cursor to only list implemented classes.
        	// e.g, ArrayList,LinkedList,Vector,Stack,etc. 
        	// using list iterator cursor we can retrive the collection elements  in forward and backword direction 
        	// by using the list itetrator we can only read,replace and remove elements. 
        
        
        
	}
}


















