import java.io.*;
 
//class tut_26_constructor {
    /*
    tut_26_constructor() { super(); }
    public static void main(String[] args)
    {
        tut_26_constructor geek = new tut_26_constructor();
    }
    */
    // Java Program to illustrate calling a
// no-argument constructor

/*
 // data members of the class.
    String name;
    int id;
 
    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    tut_26_constructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

 
// Class 2

    // main driver method
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        tut_26_constructor geek1 = new tut_26_constructor("adam", 1);
        System.out.println("GeekName :" + geek1.name
                           + " and GeekId :" + geek1.id);
    }
    
 */
 
 
 //}


// Java Program to illustrate constructor overloading
// using same task (addition operation ) for different
// types of arguments.
 
/*
import java.io.*;
 
class Geek
{
    // constructor with one argument
    Geek(String name)
    {
        System.out.println("Constructor with one " +
                      "argument - String : " + name);
    }
 
    // constructor with two arguments
    Geek(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
 
    }
 
    // Constructor with one argument but with different
    // type than previous..
    Geek(long id)
    {
        System.out.println("Constructor with one argument : " +
                                            "Long : " + id);
    }
}
 
class tut_26_constructor
{
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments
 
        // Invoke the constructor with one argument of
        // type 'String'.
        Geek geek2 = new Geek("Shikhar");
 
        // Invoke the constructor with two arguments
        Geek geek3 = new Geek("Dharmesh", 26);
 
        // Invoke the constructor with one argument of
        // type 'Long'.
        Geek geek4 = new Geek(325614567);
    }
}

*/

/*package whatever //do not write package name here */
/* 
import java.io.*;
 
class tut_26_constructor
{
public static void main(String[] args)
{
 
GFG hello= new GFG();
}
}
*/ 


//copy constructor 
//		  The kind of the constructor that copies the content of one object into the another object is called copy constructor.
/*
class A{ 
String name; 
int age; 

	A(String name,int age){ 
		this.name=name; 
		this.age=age; 
		System.out.println("name:"+name+"\nage:"+age);
	}

	A(A ref){ 
		name=ref.name; 
		age=ref.age;		
		System.out.println("name:"+name+"\nage:"+age);
	}

} 


class tut_26_constructor{ 

	public static void main(String args[]){ 
		A a=new A("sairaj",21);
		A b=new A(a);
	}

}
*/

/*
In the above programme, the content of object a is copied into object b
*/












