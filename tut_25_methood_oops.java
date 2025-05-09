// Java Program to Illustrate Methods
 
// Importing required classes 
/*
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
class methood_oops {
 
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

*/ 

// Java Program to Illustrate Method Calling
// Via Different Ways of Calling a Method
 
// Importing required classes
import java.io.*;
 
// Class 1
// Helper class
class Test {
 
    public static int i = 0;
 
    // Constructor of class
    Test()
    {
 
        // Counts the number of the objects of the class
        i++;
    }
 
    // Method 1
    // To access static members of the class and
    // and for getting total no of objects
    // of the same class created so far
    public static int get()
    {
 
        // statements to be executed....
        return i;
    }
 
    // Method 2
    // Instance method calling object directly
    // that is created inside another class 'GFG'.
 
    // Can also be called by object directly created in the
    // same class and from another method defined in the
    // same class and return integer value as return type is
    // int.
     public int m1()
    {
 
        // Display message only
        System.out.println(
            "Inside the method m1 by object of GFG class");
 
        // Calling m2() method within the same class.
        this.m2();
 
        // Statements to be executed if any
        return 1;
    }
 
    // Method 3
    // Returns nothing
    public void m2()
    {
 
        // Print statement
        System.out.println(
            "In method m2 came from method m1");
    }
}
 
// Class 2
// Main class
class tut_25_methood_oops {
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of above class inside the class
        Test obj = new Test();
 
        // Calling method 2 inside main() method
        int i = obj.m1();
 
        // Display message only
        System.out.println(
            "Control returned after method m1 :" + i);
        // Call m2() method
        // obj.m2();
        int no_of_objects = Test.get();
 
        // Print statement
        System.out.print(
            "No of instances created till now : ");
 
        System.out.println(no_of_objects);
    }
} 


