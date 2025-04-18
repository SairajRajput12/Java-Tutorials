// CODE: 
import java.util.Scanner;

// Java program to illustrate Constructor Chaining
// within same class Using this() keyword

/*
class tut_26_constructor_chaining
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    tut_26_constructor_chaining()
    {
       // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
    tut_26_constructor_chaining(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
 
    // parameterized constructor 3
    tut_26_constructor_chaining(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
        // invokes default constructor first
        new tut_26_constructor_chaining();
    }
}

*/
/*
Rules of constructor chaining : 

    1] The this() expression should always be the first line of the constructor.
    2] There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
    3] Constructor chaining can be achieved in any order.
     

Q]What happens if we change the order of constructors?
--> Nothing, Constructor chaining can be achieved in any order
*/




// Java program to illustrate Constructor Chaining to
// other class using super() keyword

/*
class test
{
    String name;
 
    // constructor 1
    test()
    {
        this("");
        System.out.println("No-argument constructor of" +
                                           " base class");
    }
 
    // constructor 2
    test(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                                              + " of base");
    }
}
 
class Derived extends test
{
    // constructor 3
    Derived()
    {
        System.out.println("No-argument constructor " +
                           "of derived");
    }
 
    // parameterized constructor 4
    Derived(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                           "constructor of derived");
    }


}

class tut_26_constructor_chaining{
     public static void main(String args[])
    {
        // calls parameterized constructor 4
        //Derived obj = new Derived("test");
 
        // Calls No-argument constructor
         Derived obj = new Derived();
    }
}
*/
/*
Note : Similar to constructor chaining in same class, super() should be the first line of the constructor as super class’s constructor are invoked before the sub class’s constructor.
*/



/*
class tut_26_constructor_chaining
{
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }
 
    // no-arg constructor
    tut_26_constructor_chaining()
    {
        System.out.println("default");
    }
 
    // constructor with one argument.
    tut_26_constructor_chaining(int x)
    {
        System.out.println(x);
    }
 
    public static void main(String[] args)
    {
        // Object creation by calling no-argument
        // constructor.
        new tut_26_constructor_chaining();
 
        // Object creation by calling parameterized
        // constructor with one parameter.
        new tut_26_constructor_chaining(10);
    }
}

*/






// 						implementation 

/*
class tut_26_constructor_chaining{ 
	tut_26_constructor_chaining(){ 
		System.out.println("\n             ID:APNA CODING           ");
	} 
	
	tut_26_constructor_chaining(String name){ 
		this(); 
		System.out.println("Name:"+name);
	}
	
	tut_26_constructor_chaining(String name,int rank){ 
		this("sairaj");
		System.out.println("RANK: "+rank+" stars");
	}
	
	public static void main(String args[]){ 
		Scanner s=new Scanner(System.in);
		String st=s.nextLine(); 
		int ran=s.nextInt(); 
		tut_26_constructor_chaining t=new tut_26_constructor_chaining("sairaj",5);
	}
}
*/







