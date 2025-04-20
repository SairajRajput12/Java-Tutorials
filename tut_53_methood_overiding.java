/* 
In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that 
is already provided by one of its super-classes or parent classes.

Note: 
	1] When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, 
	   then the method in the subclass is said to override the method in the super-class. 
	   
	2] Method overriding is one of the way by which java achieve Run Time Polymorphism 
	
	3]  it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.   	

Programme to demonstrate the run time polymorphism: 

class parent{ 
	public void print(){ 
		System.out.println("Hello, print is called from the class parent");
	}	
} 

class child extends parent{ 
	public void print(){ 
		System.out.println("Hello, print is called from the child class ");
	}
}

class tut_53_methood_overiding{ 
	public static void main(String args[]){ 
		System.out.println("creating parent class object"); 
		parent p=new parent(); 
		p.print(); 
		System.out.println("creating child class object"); 
		child c=new child(); 
		c.print();
		System.out.println("methood overriding implemented succesfully");
	}
	
}

*/


/*
Note: 
	1] The access modifier for an overriding method can allow more, but not less, access than the overridden method. 
	   For example, a protected instance method in the super-class can be made public, but not private, in the subclass. 
	   Doing so, will generate compile-time error.
	   
	2] Final methods can not be overridden : If we don’t want a method to be overridden, we declare it as final.
	
	CODE: 
	
	
	// A Java program to demonstrate that
	// final methods cannot be overridden
  
	class Parent {
	    // Can't be overridden
	    final void show() {}
	}
  
	class Child extends Parent {
	    // This would produce error
	    void show() {}
	}


	3] Static methood can't be override.we can't overide static method differ by static keyword 
		
	 programme demonstrating this statement is given below: 
	 
		class parent{ 
			public void print(){ 
				System.out.println("Hello, print is called from the class parent");
			}
	
			public static void print1(){ 
				System.out.println("Hello,static methood name print is called from the parent class ");
			}	
		} 

		class child extends parent{ 
			public void print(){ 
				System.out.println("Hello, print is called from the child class ");
			} 
	
			public static void print1(){ 
				System.out.println("Hello,static methood name print is called from the child class ");
			} 
	
	
		}

	class tut_53_methood_overiding{ 
		public static void main(String args[]){ 
			System.out.println("Method overiding in case of static methood"); 
			parent p=new child(); 
			p.print(); 
			p.print1();
		}
	
	}
	
	4] Private methods can not be overridden : Private methods cannot be overridden as they are bonded during compile time. 
	   Therefore we can’t even override private methods in a subclass.(See this for details).

 	5] The overriding method must have same return type (or subtype)  
 	
 	6]Invoking overridden method from sub-class : We can call parent class method in overriding method using super keyword.
 
	7] we can't override constructor 
	
	8]Overriding and abstract method: Abstract methods in an interface or abstract class are meant to be overridden in derived concrete classes otherwise a compile-time error will be thrown.

	9] Overriding and synchronized/strictfp method : The presence of synchronized/strictfp modifier with method have no effect on the rules of overriding, 
	   i.e. it’s possible that a synchronized/strictfp method can override a non synchronized/strictfp one and vice-versa. 




class parent{ 
	public void print(){ 
		System.out.println("Hello, print is called from the class parent");
	}	
} 

class child extends parent{ 
	public void print(){ 
		super.print(); 
		System.out.println("Hello, print is called from the child class ");
	}
}

class tut_53_methood_overiding{ 
	public static void main(String args[]){ 
			System.out.println("Creating child class object"); 
			child s=new child(); 
			s.print();
	}
}

Dynamic Method Dispatch is one of the most powerful mechanisms that object-oriented design brings to bear on code reuse and robustness. 
The ability to exist code libraries to call methods on instances of new classes without recompiling while maintaining a clean abstract interface is a profoundly powerful tool.
Overridden methods allow us to call methods of any of the derived classes without even knowing the type of derived class object.


Overriding and Inheritance : Part of the key to successfully applying polymorphism is understanding that the superclasses and subclasses form a hierarchy which moves from lesser to greater 
specialization. Used correctly, the superclass provides all elements that a subclass can use directly.
 It also defines those methods that the derived class must implement on its own. This allows the subclass the flexibility to define its methods, yet still enforces a consistent interface. 
 Thus, by combining inheritance with overridden methods, a superclass can define the general form of the methods that will be used by all of its subclasses.

// A Simple Java program to demonstrate application
// of overriding in Java
  
// Base Class
class Employee {
    public static int base = 10000;
    int salary()
    {
        return base;
    }
}
  
// Inherited class
class Manager extends Employee {
    // This method overrides salary() of Parent
    int salary()
    {
        return base + 20000;
    }
}
  
// Inherited class
class Clerk extends Employee {
    // This method overrides salary() of Parent
    int salary()
    {
        return base + 10000;
    }
}
  
// Driver class
class Main {
    // This method can be used to print the salary of
    // any type of employee using base class reference
    static void printSalary(Employee e)
    {
        System.out.println(e.salary());
    }
    public static void main(String[] args)
    {
        Employee obj1 = new Manager();
  
        // We could also get type of employee using
        // one more overridden method.loke getType()
        System.out.print("Manager's salary : ");
        printSalary(obj1);
  
        Employee obj2 = new Clerk();
        System.out.print("Clerk's salary : ");
        printSalary(obj2);
    }
}
*/

/*
    Dynamic method dispatch is also known as run time polymorphism.
    It is the process through which a call to an overridden method is resolved at runtime.
    This technique is used to resolve a call to an overridden method at runtime rather than compile time.
    To properly understand Dynamic method dispatch in Java, it is important to understand the concept of upcasting because dynamic method dispatch is based on upcasting.
 

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class tut_53_methood_overiding{
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed


    }
}
*/



