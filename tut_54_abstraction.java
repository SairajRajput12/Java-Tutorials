/*
Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or the non-essential units are not displayed to the user.
Ex: A car is viewed as a car rather than its individual components.

In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

Abstract classes and Abstract methods :  

    An abstract class is a class that is declared with an abstract keyword.
    An abstract method is a method that is declared without implementation.
    An abstract class may or may not have all abstract methods. Some of them can be concrete methods
    A method-defined abstract must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
    Any class that contains one or more abstract methods must also be declared with an abstract keyword.
    There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
    
When to use abstract classes and abstract methods with an example

There are situations in which we will want to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method.
 Sometimes we will want to create a superclass that only defines a generalization form that will be shared by all of its subclasses, leaving it to each subclass to fill in the details.

Consider a classic “shape” example, perhaps used in a computer-aided design system or game simulation. The base type is “shape” and each shape has a color, size, and so on. 
From this, specific types of shapes are derived(inherited)-circle, square, triangle, and so on — each of which may have additional characteristics and behaviors. 
For example, certain shapes can be flipped. Some behaviors may be different, such as when you want to calculate the area of a shape. 
The type hierarchy embodies both the similarities and differences between the shapes. 


 */
 
 /*

 Encapsulation vs Data Abstraction

    Encapsulation is data hiding(information hiding) while Abstraction is detailed hiding(implementation hiding).
    While encapsulation groups together data and methods that act upon the data, data abstraction deal with exposing the interface to the user and hiding the details of implementation.
    Encapsulated classes are java classes that follow data hiding and abstraction while We can implement abstraction by using abstract classes and interfaces. 
    Encapsulation is a procedure that takes place at the implementation level, while abstraction is a design-level process.

Advantages of Abstraction

    It reduces the complexity of viewing things.
    Avoids code duplication and increases reusability.
    Helps to increase the security of an application or program as only essential details are provided to the user.
    It improves the maintainability of the application. 
    It improves the modularity of the application. 
    The enhancement will become very easy because without affecting end-users we can able to perform any type of changes in our internal system. 
    
    Constructor looks like method but it is not. It does not have a return type and its name is same as the class name.

But, a constructor cannot be overridden. If you try to write a super class’s constructor in the sub class compiler treats it as a method and expects a return type and generates a compile time error.
    
    
    
School system using java:
 
 import java.util.Scanner; 
 
abstract class college{ 
 	public int age; 
 	public String name; 
 	public int roll_no;  
 	public int cost; 
 
	  	abstract public void details(); 
	 	abstract public void payment();
 }
 
class register extends college{ 
	
	public register(int age,int roll_no,String name,int cost){ 
			System.out.println("Entering into registration section"); 
			this.age=age; 
			this.name=name; 
			this.roll_no=roll_no; 
			this.cost=cost; 	
			System.out.println("Registration done succesfully"); 
	}
	
	public void details(){ 
		System.out.println("The details are given below");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("roll number: "+roll_no);
		System.out.println("cost: "+cost);	
	} 
	
	public void payment(){ 
		System.out.println("please pay"+cost+"rupees");
	}
 
 }
 
 class cantine extends college{ 
	
 	
	 public cantine(int age,int roll_no,String name,int cost){ 
			System.out.println("Entering into canteen section"); 
			this.age=age; 
			this.name=name; 
			this.roll_no=roll_no; 
			this.cost=cost; 	
			System.out.println("How was meal?"); 
	}
	
	public void details(){ 
		System.out.println("The details are given below");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("roll number: "+roll_no);
		System.out.println("cost: "+cost);	
	} 
	
	public void payment(){ 
		System.out.println("please pay "+cost+" rupees");
	}
 }
 
 public class tut_54_abstraction{ 
 	public static void main(String args[]){  
		Scanner s=new Scanner(System.in);
 		System.out.println("Enter the password"); 
 		int pass=12345; 
 		int upass=s.nextInt();  
 		int age1,roll1,price; 
 		String name1; 
 		int choice; 
 		if(upass==pass){ 
 				System.out.println("1] Canteen\n2] Registration form\n enter your choice"); 
 				choice=s.nextInt(); 
 					if(choice==1){
 						Scanner s1=new Scanner(System.in);
 					
 						System.out.println("Enter the price of the registration");  
						price=s.nextInt();
						
 						System.out.println("Enter the age"); 
 						age1=s.nextInt(); 
 						
 						System.out.println("Enter the name"); 
 			       			name1=s1.nextLine();
 			       			
 					       
 						System.out.println("Enter the roll number"); 
 			                        roll1=s.nextInt();
 						
 						register r=new register(age1,roll1,name1,price); 
 						r.details(); 
 						r.payment();	
 				} 
 			
 			else if(choice==2){ 
 						Scanner s2=new Scanner(System.in);
 						
 						System.out.println("Enter the price of the meal");  
						price=s.nextInt();
						
 						System.out.println("Enter the age"); 
 						age1=s.nextInt(); 
 						
 						System.out.println("Enter the name"); 
 			       			name1=s2.nextLine();
 			       			
 					       
 						System.out.println("Enter the roll number"); 
 			                        roll1=s.nextInt();
 						
 						 
 						cantine r=new cantine(age1,roll1,name1,price); 
 						r.details(); 
 						r.payment();	
 			}
 			
 		}
 		
 		else{ 
 			System.out.println("Access denied");
 		}
 				
 	}
 }
 
 
 In java, the following some important observations about abstract classes are as follows:

   1] An instance of an abstract class can not be created.       
   2] Constructors are allowed.
   3] We can have an abstract class without any abstract method.
   4] There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final method can not be abstract itself as 
      it will yield an error: “Illegal combination of modifiers: abstract and final”
   5] We can define static methods in an abstract class
   6] We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
   7] If a class contains at least one abstract method then compulsory should declare a class as abstract 
   8] If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class 
      should provide implementation to the remaining abstract method
      
      
 
 */
 
 /*
 Observation 2: 
 Like C++, an abstract class can contain constructors in Java. And a constructor of an abstract class is called when an instance of an inherited class is created.
 It is as shown in the program below as follows: 
 
 // Java Program to Illustrate Abstract Class
// Can contain Constructors
 
// Class 1
// Abstract class
abstract class Base {
 
    // Constructor of class 1
    Base()
    {
        // Print statement
        System.out.println("Base Constructor Called");
    }
 
    // Abstract method inside class1
    abstract void fun();
}
 
// Class 2
class Derived extends Base {
 
    // Constructor of class2
    Derived()
    {
        System.out.println("Derived Constructor Called");
    }
 
    // Method of class2
    void fun()
    {
        System.out.println("Derived fun() called");
        }
}
 
// Class 3
// Main class
class tut_54_abstraction {
 
    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 2
        // inside main() method
        Derived d = new Derived();
        d.fun();
    }
}


Observation 3: In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated but can only be inherited. 
	       It is as shown below as follows with help of a clean java program.
	      

/ Java Program to illustrate Abstract class
// Without any abstract method
 
// Class 1
// An abstract class without any abstract method
abstract class Base {
 
    // Demo method. This is not an abstract method.
    void fun()
    {
        // Print message if class 1 function is called
        System.out.println("Function of Base class is called");
    }
}
 
// Class 2
class Derived extends Base {
  //This class only inherits the Base class methods and properties
 
}
 
// Class 3
class tut_54_abstraction {
 
    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 2
        Derived d = new Derived();
 
        // Calling function defined in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun();
    }
}
 */
 
 /*
 Observation 4: Abstract classes can also have final methods (methods that cannot be overridden)
// Java Program to Illustrate Abstract classes
// Can also have Final Methods
 
// Class 1
// Abstract class
abstract class Base {
 
    final void fun()
    {
        System.out.println("Base fun() called");
    }
}
 
// Class 2
class Derived extends Base {
   
}
 
// Class 3
// Main class
class tut_54_abstraction {
 
    // Main driver method
    public static void main(String args[])
    {
        {
            // Creating object of abstract class
                        Base b = new Derived();
            // Calling method on object created above
            // inside main method
 
            b.fun();
        }
    }
}
 
 
Observation 6: Similar to the interface we can define static methods in an abstract class that can be called independently without an object. 

// Java Program to Illustrate
// Static Methods in Abstract
// Class Can be called Independently
 
// Class 1
// Abstract class
abstract class Helper {
 
    // Abstract method
    static void demofun()
    {
 
        // Print statement
        System.out.println("Geeks for Geeks");
    }
}
 
// Class 2
// Main class extending Helper class
public class tut_54_abstraction extends Helper {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Calling method inside main()
        // as defined in above class
        Helper.demofun();
    }
}
 */
 
 /*
 
 Observation 7: We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
 abstract class A{ 
 	abstract class B{ 
 		abstract public void myFirst();  
 	}
 
 }
 
 class C extends A{ 
 	class D extends B{  
 		public void myFirst(){
 			 System.out.println("Challa ja bhsdk");
 		}
 	}
 }
 class tut_54_abstraction {

// Main driver method
public static void main(String args[])
{
C outer= new C(); 
C.D inner=outer.new D(); 
inner.myFirst();  

}
}
 
 
Observation 9: If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level 
	       Child class should provide implementation to the remaining abstract method.
 
 
 abstract class greet{ 
 
 	abstract public void m1();
 	abstract public void m2(); 
 	abstract public void m3(); 
 	abstract public void m4();
 }
 
 abstract class subahKa extends greet{ 
 	public void m1(){ 
 		System.out.println("Good morning");
 	}
 }
 
 abstract class bakiKa extends subahKa{ 
 	public void m2(){ 
 		System.out.println("Goof afternoon");
 	}
 	
 	public void m3(){
 		System.out.println("Good afternoon");
 	}
 } 
 
class kira_wish extends bakiKa{ 
	public void m4(){ 
		System.out.println("Good night");
	}
}
class tut_54_abstraction {

// Main driver method
	public static void main(String args[]){
 		kira_wish k=new kira_wish();
		k.m1(); 
		k.m2(); 
		k.m3(); 
		k.m4();
	}
}

*/
 
