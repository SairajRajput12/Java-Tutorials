import java.util.List; 
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.ListIterator; 
import java.util.Set; 
import java.util.HashSet; 


public class tut_2_ArrayList{
    public static void main(String args[]){
        // List l=new ArrayList(); 
        // //  List ka refrence de ke ArrayList ka ek object bana diya 
        // //1]  all elements are added according to the position of their index in case of list     
       		 // l.add("iron man"); 
        	// l.add("Hulk"); 
        	// l.add("hokaye"); 
        	// l.add("captain america"); 
        	// l.add("Thor"); 
        	// l.add("wanda"); 
        
        // System.out.println(l);
        
        
        // we can use allAll() methood to add the multiple objects in single instruction. 
        
        // // 2] duplicate elements can be added in case of list 
        	// l.add("wanda"); 
        	// l.add("strange"); 
        	// l.add("spider man"); 
        // System.out.println(l);
        
        // // 3] multiple null value can be stored 
        	// l.add(null); 
        // System.out.println(l); 
        
        // // 4] in this way it follows insertion approach. while in case of set it doesnot follow in every case.  
        // Iterator itr=l.iterator(); 
        	// while(itr.hasNext()){
        	//     System.out.println(itr.next());
        	// }
        
        // // as shown above it follows insertion approach 
        
        // System.out.println("using list iterator");
        // ListIterator it= l.listIterator(); 
        	// while(it.hasNext()){
        	//     System.out.println(it.next());
        	// }
        
        // now using all these method in case of set 
        //1]   in case of set it uses hashcode. 
        Set s = new HashSet(); 
        s.add("wonder woman"); 
        s.add("superman"); 
        s.add("batman"); 
        s.add("flash"); 
        s.add("aquaman"); 
        System.out.println(s);
        
        //2]  can't store multiple duplicate values and same goes for null value  
        s.add("superman"); 
        s.add(null); 
        s.add(null); 
        System.out.println(s); 
        
        //3] it does not follows insertion approach in all cases. 
        Iterator i=s.iterator(); 
        while(i.hasNext()){
            System.out.println(i.next());
        }
    	/*
    	Key Points:
                ArrayList is Underlined data Structure Resizable Array or Growable Array.
    		ArrayList Duplicates Are Allowed.
   	        Insertion Order is Preserved.
    		Heterogeneous objects are allowed.
    		Null insertion is possible.
        */
    }
}
