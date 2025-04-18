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

// Java Program for Method overloading
// By using Different Types of Arguments 

// Class 1
// Helper class
class Helper {

    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {

        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {

        // Returns product of double numbers
        return a * b;
    }
}

// Class 2
// Main class
public class tut_45_polymorphism {

    // Main driver method
    public static void main(String[] args)
    {

        // Calling method by passing
        // input as in arguments
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
    }
}
