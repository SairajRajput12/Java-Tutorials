/*
Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters,
or a mixture of both. Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java. 
In Method overloading compared to parent argument, child argument will get the highest priority. 
Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java. In Method overloading compared to parent argument, child argument will get the highest priority. 

**Different Ways of Method Overloading in Java

    --->Changing the Number of Parameters. 
    	Method overloading can be achieved by changing the number of parameters while passing to different methods.
    	
    --->Changing Data Types of the Arguments.
    	In many cases, methods can be considered Overloaded if they have the same name but have different parameter types, methods are considered to be overloaded.
    	
    --->Changing the Order of the Parameters of Methods
    
    	Method overloading can also be implemented by rearranging the parameters of two or more overloaded methods. 
    	For example, if the parameters of method 1 are (String name, int roll_no) and the other method is (int roll_no, String name) but both have the same name, 
    	then these 2 methods are considered to be overloaded with different sequences of parameters.
    	
*/
/*
class greet{ 

	public void greats(int x){ 
		System.out.println("Hello this is greeting methood with one parameter i.e x="+x);
	}
	
	public void greats(int x,int y){ 
		System.out.println("Hello this is greeting methood with two parameter i.e x="+x+"and y="+y);
	}	
}

class tut_52_methood_overloading{ 
	public static void main(String args[]){ 
		greet g=new greet(); 
		g.greats(5); 
		g.greats(5,10);
	}
}
*/


// Java Program to Illustrate Method Overloading
// By Changing Data Types of the Parameters
// Importing required classes
/*

*/
/*
// A Java program with overloaded main() 
import java.io.*; 
  
public class Test { 
  
    // Normal main() 
    public static void main(String[] args) 
    { 
        System.out.println("Hi Geek (from main)"); 
        Test.main("Geek"); 
    } 
  
    // Overloaded main methods 
    public static void main(String arg1) 
    { 
        System.out.println("Hi, " + arg1); 
        Test.main("Dear Geek", "My Geek"); 
    } 
    public static void main(String arg1, String arg2) 
    { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 
}
*/



/*
Note: 

	******************************************** important**********************************************************************
	*******   	1] we can overload static methood. 									   *
	*******	        2] we cannot overload static which are differ by one methood. 						   *
	*******  	3] java does not support operator overloading. 								   *	
	*******		4] java does not support return type overloading.							   *
	******* 	5] impossuble in case of different return type. 							   *
	****************************************************************************************************************************


A] programme demonstrating 1st statement: 

	public class tut_52_methood_overloading{ 
	
	       public static void foo(){ 
			System.out.println("Foo() is called");
		}
	
	       public static void foo(int a){
			System.out.println("Test foo with one parameter integer is called ");	
		}
		public static void main(String args[]){ 
			tut_52_methood_overloading t=new tut_52_methood_overloading(); 
			t.foo();
			t.foo(100);
		}
	
	
	}


B] programme demonstrating second statement: 


	public class tut_52_methood_overloading{
		public static void foo(){ 
			System.out.println("Foo() is called");
		}
	
	       public  void foo(int a){
			System.out.println("Test foo with one parameter integer is called ");	
		}
		public static void main(String args[]){ 
			tut_52_methood_overloading t=new tut_52_methood_overloading(); 
			t.foo();
			t.foo(100);
		}
	
		
		}
		
	
Advantages of Method Overloading 

    Method overloading improves the Readability and reusability of the program.
    Method overloading reduces the complexity of the program.
    Using method overloading, programmers can perform a task efficiently and effectively.
    Using method overloading, it is possible to access methods performing related functions with slightly different arguments and types.
    Objects of a class can also be initialized in different ways using the constructors.
*/



// methood overloading in java: 
/*
class geek{ 

	public void details(String name, int age,int roll_num){ 
		System.out.println("Name: "+name+"Age: "+age+"Roll number: "+roll_num);
	}
	
	public void details(int age,String name,int roll_num){ 
		System.out.println("Name: "+name+"Age: "+age+"Roll number: "+roll_num);
	}
	
	
}

public class tut_52_methood_overloading{
	
		public static void main(String args[]){ 
			geek g=new geek(); 
			g.details("sairaj",25,50); 
			g.details(25,"sairaj",50);
		}
	
		
}
*/

// demonstrating case of return type in case of different return type 

/*
class geek{ 

	public int add(int a,int b){ 
		return a+b;
	} 
	
	public double add(int a,int b){ 
		return (double)a+(double)b;
	}
	
}

public class tut_52_methood_overloading{
	
		public static void main(String args[]){ 
			geek g=new geek(); 
			g.add(2,3); 
			g.add(23,36);
		}
	
		
}

*/
/*
error will be get
*/
		
	




















