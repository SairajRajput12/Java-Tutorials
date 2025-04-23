import java.util.ArrayList; 
//collection frameworks in java: 
// in java the collection is an inteface which is present in java.util.Collection. 
/*
Syntax: 
	public interface Collection<E> extends iterable<E> 
	{
		// methoods 
	} 

Note: 
	 none class can inherit Collection interface
*/

// methoods of collection interface: 

public class tut_1 extends ArrayList{ 
	public static void main(String args[]){
		System.out.println("Hello this snippet is working!"); 
		System.out.println("Let's start coding as below: "); 
		
		ArrayList a=new ArrayList(); 
	// methood 1: public boolean add();
	
		// this methood is used to add object into the collection object 
		// here, as shown in below "batman" is treated as an object
		    a.add("batman");   
		    a.add("bruce wayne"); 
		    a.add("DC");
		// if this methood returns true it means the object is succesfully added into the collection object. 
		System.out.println(a); 
		
    //methood 2: public boolean addAll(Collection c); 
        // this methood adds the another collection object all containing object into the collection object. 
        ArrayList b = new ArrayList();
            b.add("super man"); 
            b.add("henry cavil"); 
            b.add("DC"); 
		System.out.println(b); 
        // now adding the both object using addAll() 
        a.addAll(b); 
        // i have added the all objects of collection b object into the a collection object 
        System.out.println(a);
        
    // methood 3: public boolean contains() 
        // this methood returns true or false according to the presence or absence of element. 
        System.out.println("the a object have batman? :"+a.contains("batman")); 
        System.out.println("the a object have ironman? :"+a.contains("ironman"));
	
   // methood 4: public boolean isEmpty(Object o): returns true or false on empty of Collection object 
        System.out.println("the object a is empty? :"+a.isEmpty());
        
  // methood 5: a.size() ------> returns the number of object contained in particular collection object 
        System.out.println("the size of the object is :"+a.size());

  // method 6: a.remove(int index) or a.remove(Object o) 
        System.out.println(a.remove(2)); 
        System.out.println(a);

  // methood 7: al1.removeAll(al2) ---> removes the common object between al1 and al2 from al1 
  
  // methood 8: a.clear()--> it clears all object of collection object a 
        a.clear(); 
        System.out.println(a); 
        System.out.println("now the object a is empty? :"+a.isEmpty());

  
	    
	}
}
