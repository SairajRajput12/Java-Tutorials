// Java program to illustrate the concept of Multiple Inheritance using Interfaces

// interface One {
//     public void printGeek();
// }

// interface Two {
//     public void printFor();
// }

// interface Three extends One, Two {
//     public void printGeek();
// }

// class Child implements Three {
//     @Override
//     public void printGeek() {
//         System.out.println("Geeks");
//     }

//     @Override
//     public void printFor() {
//         System.out.println("for");
//     }
// }

// // Driver class
// public class Tut46TypesOfInheritanceInJava {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.printGeek();
//         c.printFor();
//         c.printGeek();
//     }
// }


// Java and multiple inheritance 

//First parent  

/*
class A{ 

//on calling first methood it will call this
	public void print(){ 
		System.out.println("Inside class A"); 
	}
} 

class B{
	public void print(){ 
		System.out.println("Inside class B");
	}
} 



class tut_46_Types_of_inheritance_in_java extends A,B{ 

	public static void main(String args[]){ 
		tut_46_Types_of_inheritance_in_java t=new tut_46_Types_of_inheritance_in_java(); 
		t.print();
	}

}

*/
//output: error will get

/*Conclusion: 
As depicted from code above, on calling the method fun() using Test object will cause complications such as whether to call Parent1’s fun() or Parent2’s fun() method. */





//        IInd illustration: 
// Java Program to Illustrate Unsupportance of
// Multiple Inheritance
// Diamond Problem Similar Scenario

// Importing input output classes
//import java.io.*;

//  Class 1
// A Grand parent class in diamond
/*
class GrandParent {
 
  public void fun() {
 
    // Print statement to be executed when this method is called
    System.out.println("Grandparent");
  }
}
 
// Class 2
// First Parent class
class Parent1 extends GrandParent {
 public void fun() {
 
    // Print statement to be executed when this method is called
    System.out.println("Parent1");
  }
}
 
// Class 3
// Second Parent Class
class Parent2 extends GrandParent {
 public  void fun() {
 
    // Print statement to be executed when this method is called
    System.out.println("Parent2");
  }
}
// Class 4
// Inheriting from multiple classes
class tut_46_Types_of_inheritance_in_java extends Parent1, Parent2 {
 
  // Main driver method
  public static void main(String args[]) {
 
    // Creating object of this class i main() method
    tut_46_Types_of_inheritance_in_java t = new tut_46_Types_of_inheritance_in_java();
 
    // Now calling fun() method from its parent classes
    // which will throw compilation error
    t.fun();
  }
}

*/



/* 
Again it throws compiler error when run fun() method as multiple inheritances cause a diamond problem when allowed in other languages like C++. From the code, 
we see that: On calling the method fun() using Test object will cause complications such as whether to call Parent1’s fun() or Parent2’s fun() method. 
Therefore, in order to avoid such complications, Java does not support multiple inheritances of classes.

Multiple inheritance is not supported by Java using classes, handling the complexity that causes due to multiple inheritances is very complex. 
It creates problems during various operations like casting, constructor chaining, etc, and the above all reason is that there are very few scenarios on which 
we actually need multiple inheritances, so better to omit it for keeping things simple and straightforward.
  
*/



// Java program to demonstrate Multiple Inheritance
// through default methods

// Interface 1

interface PI1 {

    // Default method
    default void show()
    {
        // Print statement if method is called
        // from interface 1
        System.out.println("Default PI1");
    }
}

// Interface 2
interface PI2 {

    // Default method
    default void show()
    {

        // Print statement if method is called
        // from interface 2
        System.out.println("Default PI2");
    }
}
// Main class
// Implementation class code
class Tut46TypesOfInheritanceInJava implements PI1, PI2 {

    // Overriding default show method
    @Override
    public void show()
    {
        System.out.println("Calling from main methood.");
        // Using super keyword to call the show
        // method of PI1 interface
        PI1.super.show();//Should not be used directly in the main method;

        // Using super keyword to call the show
        // method of PI2 interface
        PI2.super.show();//Should not be used directly in the main method;
    }

    //Method for only executing the show() of PI1
    public void showOfPI1() {
        PI1.super.show();//Should not be used directly in the main method;
    }

    //Method for only executing the show() of PI2
    public void showOfPI2() {
        PI2.super.show(); //Should not be used directly in the main method;
    }

    // Main driver method
    public static void main(String args[])
    {

        // Creating object of this class in main() method
        Tut46TypesOfInheritanceInJava d = new Tut46TypesOfInheritanceInJava();
        d.show();
        System.out.println("Now Executing showOfPI1() showOfPI2()");
        d.showOfPI1();
        d.showOfPI2();
    }
}




//Difference of inheritance between cpp and java 

/*
The purpose of inheritance is the same in C++ and Java. Inheritance is used in both languages for reusing code and/or creating an ‘is-a’ relationship.
 The following examples will demonstrate the differences between Java and C++ that provide support for inheritance. 

1) In Java, all classes inherit from the Object class directly or indirectly. Therefore, there is always a single inheritance tree of classes in Java, and the Object Class is the root of the tree. 
In Java, when creating a class it automatically inherits from the Object Class. In C++ however, there is a forest of classes; when we create a class that doesn’t inherit from another,
 we create a new tree in a forest.
 */
/*
public class Test {
    // members of test
}
class tut_fourty_six {
    public static void main(String[] args)
    {
        Test t = new Test();
        System.out.println("t is instanceof Object: "
                           + (t instanceof Object));
    }
}
*/
