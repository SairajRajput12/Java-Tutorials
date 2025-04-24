
import java.util.*; 

public class tut{
	public static void main(String args[]){
		/* 
	 	in jdk 1.0 version: 
			java provides classes, interface,stack,hashtables,properties and dictionary. 
		 in jdk 1.2 version 
				in this version the collection framework was introduced. 
			
			some classes i.e Vectors,Stack,Hashtables,etc were introduced in JDK 1.0 but when Collection Framework was introduced in JDK 1.2 version these classes were modified or say 
			reengineered so that they can be adjusted in new collection hirerchy, so these older classes are known as legacy classes. 
			
			
								  Collection 
					    _______________________|_________________________ 
					   |		               |                    | 
					 1] List                   2] Set              3] Queue 
					    * ArrayList     (1.2)  
					    * Linked List   (1.2)     
					    * Vector        (1.0)  
								  
			
			
			
			1] Vector: 
				 * legacy class and was introduced in JDK 1.0 version. 
				 * implemented class of LIST interface and is present in java.util package. 
				 * Syntax: 
				 		package java.util; 
				 		class Vector implements List{ 
				 			// constructors 
				 			// methoods
				 		} 
				 * underlined data structure of the vector is growable and resizable array. 
			
				properties: 
					1] index based data structure 
					2] can store different data-type ( i.e hetrogenous data-type). 
					3] can store duplicate values as well as null values. 
					4] follows the insertion order but not sorting order.  
					5] ArrayList are non-synchronized collection while vectors are synchronized.  
			
		
			Note: All  legacy classes are synchronized	 
		
			// methoods of vector class: 
			// it contains List and Collection interface methoods. 
				// 1] addElement(Object obj) 
				// 2] firstElement(); 
				// 3] lastElement() 
				// 4] removeElement(Object obj) 
				// 5] removeElementAt(int index) 
				// 6] removeAllElements(); 
				// 7] capacity(); -------------------> return the number of elements in the vector that can e stored into it. 		
				// all methoods are synchronized  
			Note: we can find the capacity of the vector but not the arraylist. 
		
		*/ 
		
	//Implementation: 
	
		Vector v = new Vector(); // this is an empty constructor
	        	// initial capacity = 10 of the empty constructor 
	        	// 1] Vector(Collection obj) ------->    it stores the another Collection object 
	        	// 2] Vector (int initialCapacity)-----> we can set the initial capacity manually. 
	        	// 3] Vector(int initialCapacity, int capacityElement)------> we can set the ratio of increase in the initial capacity of the object. 
	        
	            v.addElement("sairaj"); 
	            v.addElement("the god of the world");
		        v.addElement(20); 
	    	    v.addElement("Creator of the world");		
	    	System.out.println(v); 
		    
		    System.out.println(v.firstElement());
		    System.out.println(v.lastElement()); 
		    System.out.println(v.capacity());// it will display the initial capacity which is 10. 
	
		  // now we are going to use another constructor 
		  Vector v1 = new Vector(25); 
		  System.out.println(v1.capacity()); // it will display 25 
		  Vector v2 = new Vector(v); 
		  System.out.println(v2);
		  Vector v3 = new Vector(15,2); 
		        v3.addElement("sairaj"); 
		        v3.addElement(20); 
		        v3.addElement("The morning star"); 
		        v3.addElement("The inventor"); 
		        v3.addElement("Pro-Gammer"); 
		  System.out.println(v3); 
		  System.out.println(v3.capacity());
		        v3.setElementAt("Male",0); 
		  System.out.println(v3);
	}
}
		
