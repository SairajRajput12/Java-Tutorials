/*
An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behaviour. A Java interface contains 
static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not the method body. It is used to achieve abstraction and 
multiple inheritance in Java. In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body. Java Interface also represents the IS-A relationship.

When we decide a type of entity by its behaviour and not via attribute we should define it as an interface.

Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body). 


To declare an interface, use the interface keyword. It is used to provide total abstraction. That means all the methods in an interface are declared with an empty body and are 
public and all fields are public, static, and final by default. A class that implements an interface must implement all the methods declared in the interface. To implement interface 
use implements keyword.

Why do we use an Interface?

    * It is used to achieve total abstraction.
    * Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
    * Any class can extend only 1 class but can any any class implement infinite number of interface.
    * It is also used to achieve loose coupling.
    * Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?
    

*/

// Java program to demonstrate working of
// interface

import java.io.*;

// A simple interface
interface In1 {

// public, static and final
final int a = 10;

// public and abstract
void display();
}

// A class that implements the interface.
class tut_55_interfaces implements In1 {

// Implementing the capabilities of
// interface.
public void display(){  
 System.out.println("Geek");
    
}

// Driver Code
public static void main(String[] args)
{
  
tut_55_interfaces t = new tut_55_interfaces();
  
t.display();
  
System.out.println(a);
  
 
}
}

/*
// Java program to demonstrate the
// real-world example of Interfaces
 
import java.io.*;
 
interface Vehicle {
     
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
 
class Bicycle implements Vehicle{
     
    int speed;
    int gear;
     
    // to change gear
    @Override
    public void changeGear(int newGear){
         
        gear = newGear;
    }
     
    // to increase speed
    @Override
    public void speedUp(int increment){
         
        speed = speed + increment;
    }
     
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
         
        speed = speed - decrement;
    }
     
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}
 
class Bike implements Vehicle {
     
    int speed;
    int gear;
     
    // to change gear
    @Override
    public void changeGear(int newGear){
         
        gear = newGear;
    }
     
    // to increase speed
    @Override
    public void speedUp(int increment){
         
        speed = speed + increment;
    }
     
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
         
        speed = speed - decrement;
    }
     
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
     
}
class GFG {
     
    public static void main (String[] args) {
     
        // creating an inatance of Bicycle
        // doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
         
        System.out.println("Bicycle present state :");
        bicycle.printStates();
         
        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
         
        System.out.println("Bike present state :");
        bike.printStates();
    }
}

*/


// nested interface in java


