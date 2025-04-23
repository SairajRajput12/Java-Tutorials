// this is tutorial number 7 where the implementation about the linked list framework is given below: 
import java.util.*; 
public class tut_7{ 
	public static void main(String[] args) {
            LinkedList l= new LinkedList(); 
            l.add("sairaj"); 
            l.add("IT"); 
            l.add(21); 
            l.add("Future researcher"); 
            l.addFirst("Briliant");     
            Iterator it=l.iterator();  
            System.out.println(l);
                while(it.hasNext()){
                    System.out.println(it.next());
                }
	}
}

/* interface Collection{ 
        boolean add(Object obj); 
        boolean addAll(Collection c); 
        boolean remove(Object o); 
        boolean removeAll(Collection c); 
        boolean isEmpty(); 
        int size(); 
        Iterator iterator(); 
        ----etc. 
        
} 

interface List extends Collection{
    void add(int index,Object obj); 
    void addAll(int index); 
    Object get(int index); 
    Object remove(int index); 
    Object set(int index,Object newobj);---------> it replaces the object 
    int indextOf(Object obj); 
    int lastIndexOf(Object obj);  
    ----etc. 
} 

class Linked List implements List,Deque{
    //  contains the Collection,List and dequeue methoods 
    void addFirst(Object obj); 
    void addList(Object obj); 
    Object getFirst(); 
    Object getLast(); 
    Object removeFirst(); 
    Object removeLast(); 
}
*/


















