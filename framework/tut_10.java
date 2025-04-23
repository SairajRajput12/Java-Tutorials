import java.util.*; 

// this is tutorial number 10: Stack data structure 
/* 
	Stack: 
	        1] legacy class introduced in jdk 1.0 version 
		2] Child class of Vector present in java.util 
		3] Syntax: 
				package java.util; 
				class Stack extends Vector{
		    		// constructors 
					// methoods
				} 
		4] follows LIFO ( last in first out) 
		5] the only accesile element is the last element 
		6] stack can be implemented on asis of arrays,ArraList,LinkedList or Vectors,etc. 
		7] it is an index ased data-structure. 
	
	Methoods and constructors of Stack: 
		1] push() 
		2] pop() 
		3] peek() 
		4] search(Obj o) --------> returns the index value of the Object o from stack 
		6] empty() 
			 
*/ 

public class tut_10{ 
	public static void main(String args[]){ 
	
		Stack s = new Stack(); 
		s.add("sairaj"); 
		s.add("pro-gammer"); 
		s.add(20); 
		s.add("the god of the new world"); 
		s.add("bhikari"); 
		System.out.println(s); 
		System.out.println(s.pop()); // removes the object at the top of the stack and returns it 
		System.out.println(s); 
		System.out.println(s.peek()); // returns top most element but not remove it 
		System.out.println(s.search("sairaj"));
		System.out.println(s.empty());
		
	}
} 


