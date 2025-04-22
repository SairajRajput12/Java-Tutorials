import java.util.*; 
// sorting the collection

public class gtut_1{
	public static void main(String args[]){ 
            //Operation 2: sorting the collection object. 
            /*  
                List l = new ArrayList(); 
                l.add("bokada sairaj da! "); 
                l.add("the father of god of new world"); 
                l.add("The father of kira"); 
                l.add("The father of L"); 
                l.add("the creator and father of avengers");   
                Collections.addAll(l,"the creator of iron man story","the father of ash","Backchodiyo ka sardar sabse asardar","the follower of nobel peoples","the one of the greatest deciple of sherlok holmes and acharya chanyakya");    
//                System.out.println(l);
                // now sorting the whole list using the sort() methood  
                Collections.sort(l);
//                System.out.println(l); 
             */ 
             
            // Operation 3: searching operation using .binarySearch() this methood will returns the index of the searching element ArrayList. 
            /*    
                System.out.println(Collections.binarySearch(l,"bokada sairaj da! "));
                System.out.println(Collections.binarySearch(l,"the hall of fame "));
                Iterator it = l.iterator(); 
                while(it.hasNext()){
                    System.out.println(it.next());
                }    
                
                List l2 = new ArrayList();
               
                l2.add("father of tommy vercetee"); 
                l2.add("The guru of rockstar game"); 
                Collections.copy(l, l2); 
                System.out.println(l);
                
                Iterator i = l.iterator(); 
                while(i.hasNext()){
                    System.out.println(i.next());
                } 
            */ 
            /*
            Operation 5: Disjoint Collection
                java.util.Collections.disjoint() is used to check whether two specified collections are disjoint or not. More formally, two collections are disjoint if they have no 
                elements in common. It returns true if the two collections do not have any element in common.  
            */
            
            List<String> list1 = new ArrayList<>();

        // Add elements to list1
        list1.add("Shoes");
        list1.add("Toys");
        list1.add("Horse");
        list1.add("Tiger");

        // Create list2
        List<String> list2 = new ArrayList<>();

        // Add elements to list2
        list2.add("Bat");
        list2.add("Frog");
        list2.add("Lion"); 
        System.out.println(Collections.disjoint(list1, list2));
        // returns true 
        
        
        
        }
}
