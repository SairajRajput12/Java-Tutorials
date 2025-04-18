/*
Polymorphism is considered one of the important features of Object-Oriented Programming. Polymorphism allows us to perform a single action in different ways. 
In other words, polymorphism allows you to define one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, 
So it means many forms.

In Java polymorphism is mainly divided into two types: 

    A] Compile-time Polymorphism:
    B] Runtime Polymorphism: 
    

Type 1: Compile-time polymorphism: 
	It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading. 
	Note: But Java doesn’t support the Operator Overloading. 
	
	
*/

/*
class Helper{ 

	static int multiply(int a,int b){ 
		return a*b;
	} 
	
	static double multiply(double a,double b){ 
		return a*b;
	} 

}

public class tut_48_polymorphism_in_java{ 
	public static void main(String args[]){ 
		System.out.println(Helper.multiply(2,3));
		System.out.println(Helper.multiply(2.5,3.2)); 
		
	}

}
*/

/*
// Java program for Method Overloading
// by Using Different Numbers of Arguments
*/

/*
class Helper{ 

	static int multiply(int a,int b){ 
		return a*b;
	} 
	
	static double multiply(double a,double b,double c){ 
		return a*b;
	} 

}

public class tut_48_polymorphism_in_java{ 
	public static void main(String args[]){ 
		System.out.println(Helper.multiply(2,3));
		System.out.println(Helper.multiply(2.5,3.2,3.3)); 
		
	}

}

*/

/*
class parent{ 

	void print(){ 
		System.out.println("Parent class");
	}
}


class subclass1 extends parent{ 

	void print(){ 
		System.out.println("Subclass 1");
	}
}


class subclass2 extends parent{ 

	void print(){ 
		System.out.println("Subclass 2");
	}
}

public class tut_48_polymorphism_in_java{ 
	public static void main(String args[]){ 
		//System.out.println(Helper.multiply(2,3));
		//System.out.println(Helper.multiply(2.5,3.2,3.3)); 
		
		parent p; 
		p=new subclass1();
		//p=new subclass1(); 
		//p.print(); 
		// now printing subclass 2 methood 
		
		//p=new subclass2(); 
		//p.print(); 
		p.print();
	}

}

*/

/*Output explanation: 

Here in this program, When an object of child class is created, then the method inside the child class is called. 
This is because The method in the parent class is overridden by the child class. Since The method is overridden, 
This method has more priority than the parent method inside the child class. So, the body inside the child class 
is executed
*/
/*


// A Java program to illustrate Dynamic Method
// Dispatch using hierarchical inheritance
class A
{
  void m1 ()
  {
    System.out.println ("Inside A's m1 method");
  }
}

class B extends A
{
// overriding m1()
  void m1 ()
  {
    System.out.println ("Inside B's m1 method");
  }
}

class C extends A
{
//overriding m1()
  void m1 ()
  {
    System.out.println ("Inside C's m1 method");
  }
}

// Driver class
class tut_48_polymorphism_in_java
{
  public static void main (String args[])
  {
// object of type A
    A a = new A ();

// object of type B
    B b = new B ();

// object of type C
    C c = new C ();

// obtain a reference of type A
    A ref;

// ref refers to an A object
      ref = a;

// calling A's version of m1()
      ref.m1 ();

// now ref refers to a B object
// B ref;
      ref = b;

// calling B's version of m1()
      ref.m1 ();

// now ref refers to a C object
      ref = c;

// calling C's version of m1(
      ref.m1 ();
  }
}

*/
/*
The above program creates one superclass called A and it’s two subclasses B and C. These subclasses overrides m1( ) method.

       1] Inside the main() method in Dispatch class, initially objects of type A, B, and C are declared.
       
       2] Now a reference of type A, called ref, is also declared, initially it will point to null.
	  A ref; // obtain a reference of type A
	 
       3] Now we are assigning a reference to each type of object (either A’s or B’s or C’s) to ref, one-by-one, and uses that reference to invoke m1( ). 
          As the output shows, the version of m1( ) executed is determined by the type of object being referred to at the time of the call.

	  ref = a; // r refers to an A object
	  ref.m1(); // calling A's version of m1()

	  ref = b; // now r refers to a B object
	  ref.m1(); // calling B's version of m1()
	  
	  ref = c; // now r refers to a C object
	  ref.m1(); // calling C's version of m1()
	  

//                          Runtime Polymorphism with Data Members           
	  
	  
	  In Java, we can override methods only, not the variables(data members), so runtime polymorphism cannot be achieved by data members	  	
*/

class A{ 
int x=10; 

}

class B extends A{ 
int x=20;
}


public class tut_48_polymorphism_in_java{ 
	public static void main(String args[]){ 
		A a = new B(); 
		System.out.println(a.x);
	}

}

//output: 10

/*
    Dynamic method dispatch allow Java to support overriding of methods which is central for run-time polymorphism.
    It allows a class to specify methods that will be common to all of its derivatives, while allowing subclasses to define the specific implementation of some or all of those methods.
    It also allow subclasses to add its specific methods subclasses to define the specific implementation of some.

							Static vs Dynamic binding

    Static binding is done during compile-time while dynamic binding is done during run-time.
    private, final and static methods and variables uses static binding and bonded by compiler while overridden methods are bonded during runtime based upon type of runtime object

*/





