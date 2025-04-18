/*
As the name suggests, Object-Oriented Programming or OOPs refers to languages that use objects in programming, they use objects as a primary source to implement what is to happen in the code. 
Objects are seen by the viewer or user, performing tasks assigned by you. Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc.in programming. 
The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.  

Let us discuss prerequisites by polishing concepts of method declaration and message passing. Starting off with the method declaration, it consists of six components: 

   A] ACCESS MODIFIER:  
        Defines the access type of the method i.e. from where it can be accessed in your application. In Java, there are 4 types of access specifiers: 
       
        1] public: Accessible in all classes in your application.
        2] protected: Accessible within the package in which it is defined and in its subclass(es) (including subclasses declared outside the package).
        3] private: Accessible only within the class in which it is defined.
        4] default (declared/defined without using any modifier): Accessible within the same class and package within which its class is defined. 
      
    
   A] The return type: The data type of the value returned by the method or void if it does not return a value.
   B] Method Name: The rules for field names apply to method names as well, but the convention is a little different.
   C] Parameter list: Comma-separated list of the input parameters that are defined, preceded by their data type, within the enclosed parentheses. 
     If there are no parameters, you must use empty parentheses ().
   D] Exception list: The exceptions you expect the method to throw. You can specify these exception(s).
   E] Method body: It is the block of code, enclosed between braces, that you need to execute to perform your intended operations. 
   
   
-> OOPS concepts are as follows: 

    a)Class
    b)Object 
    c)Method and method passing
    d)Pillars of OOPs
        -Abstraction
        -Encapsulation
        -Inheritance
        -Polymorphism
            A] Compile-time polymorphism
            B] Runtime polymorphism



A class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. 
Using classes, you can create multiple objects with the same behavior instead of writing their code multiple times. This includes classes for objects occurring more than once in your code. 
In general, class declarations can include these components in order: 

    1] Modifiers: A class can be public or have default access (Refer to this for details).
    2] Class name: The class name should begin with the initial letter capitalized by convention.
    3] Superclass (if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
    4] Interfaces (if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
    5] Body: The class body is surrounded by braces, { }. 
    

An object is a "basic unit of Object-Oriented Programming" that represents real-life entities. A typical Java program creates many objects, which as you know, interact by invoking methods. The objects are what perform your code, they are the part of your code visible to the viewer/user. An object mainly consists of: 

    1] State: It is represented by the attributes of an object. It also reflects the properties of an object.
    2] Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.
    3] Identity: It is a unique name given to an object that enables it to interact with other objects.
    4] Method: A method is a collection of statements that perform some specific task and return the result to the caller. A method can perform some specific task without returning anything. 
       Methods allow us to reuse the code without retyping it, which is why they are considered time savers. 
       In Java, every method must be part of some class, which is different from languages like C, C++, and Python. 


Let us now discuss the 4 pillars of OOPs: 
	
Pillar 1: Abstraction

Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or non-essential units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
Data Abstraction may also be defined as the process of identifying only the required characteristics of an object, ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the object. 



Pillar 2: Encapsulation

It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together the code and the data it manipulates. Another way to think about encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield. 

    Technically, in encapsulation, the variables or the data in a class is hidden from any other class and can be accessed only through any member function of the class in which they are declared.
    In encapsulation, the data in a class is hidden from other classes, which is similar to what data-hiding does. So, the terms “encapsulation” and “data-hiding” are used interchangeably.
    Encapsulation can be achieved by declaring all the variables in a class as private and writing public methods in the class to set and get the values of the variables.
    
  
Pillar 3: Inheritance 

Inheritance is an important pillar of OOP (Object Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class. 

Let us discuss some frequently used important terminologies:

    A] Superclass: The class whose features are inherited is known as superclass (also known as base or parent class).
    B] Subclass: The class that inherits the other class is known as subclass (also known as derived or extended or child class). 
    	The subclass can add its own fields and methods in addition to the superclass fields and methods.
   C] Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, 
     we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.
	
	
Pillar 4: Polymorphism

It refers to the ability of object-oriented programming languages to differentiate between entities with the same name efficiently. 
This is done by Java with the help of the signature and declaration of these entities. 


                                              Ways to create an object of a class          
There are four ways to create objects in java. Strictly speaking there is only one way(by using new keyword), and the rest internally use new keyword. 

 1]Using new keyword: It is the most common and general way to create an object in java. Example:

	// creating object of class Test
	Test t = new Test();

 2]Using Class.forName(String className) method: There is a pre-defined class in java.lang package with name Class. 
    The forName(String className) method returns the Class object associated with the class with the given string name. We have to give a fully qualified name for a class. 
    On calling new Instance() method on this Class object returns new instance of the class with the given string name.

	// creating object of public class Test
	// consider class Test present in com.p1 package
	Test obj = (Test)Class.forName("com.p1.Test").newInstance();

 3]Using clone() method: clone() method is present in Object class. It creates and returns a copy of the object.

        
	// creating object of class Test
	Test t1 = new Test();

	// creating clone of above object
	Test t2 = (Test)t1.clone();

 4]Deserialization: De-serialization is a technique of reading an object from the saved state in a file. Refer Serialization/De-Serialization in java

      	FileInputStream file = new FileInputStream(filename);
	ObjectInputStream in = new ObjectInputStream(file);
	Object obj = in.readObject();



							
								Anonymous objects

Anonymous objects are objects that are instantiated but are not stored in a reference variable.  

    They are used for immediate method calling.
    They will be destroyed after method calling.
    They are widely used in different libraries. For example, in AWT libraries, they are used to perform some action on capturing an event(eg a key press).
    In the example below, when a key is button(referred by the btn) is pressed, we are simply creating anonymous object of EventHandler class for just calling handle method.

btn.setOnAction(new EventHandler()
{
    public void handle(ActionEvent event)
    {
        System.out.println("Hello World!");
    }
});

*/

// Java Program to Illustrate Methods
 
// Importing required classes
import java.io.*;
 
// Class 1
// Helper class
class Addition {
 
    // Initially taking sum as 0
    // as we have not started computation
    int sum = 0;
 
    // Method
    // To add two numbers
    public int addTwoInt(int a, int b)
    {
 
        // Adding two integer value
        sum = a + b;
 
        // Returning summation of two values
        return sum;
    }
}
 
// Class 2
// Helper class
class tut_24_oops {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of class 1 inside main() method
        Addition add = new Addition();
 
        // Calling method of above class
        // to add two integer
        // using instance created
        int s = add.addTwoInt(1, 2);
 
        // Printing the sum of two numbers
        System.out.println("Sum of two integer values :"
                           + s);
    }
}











































