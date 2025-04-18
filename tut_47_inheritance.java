/*
class A {
    protected int x = 10, y = 20;
}
 
class tut_47_inheritance{
    public static void main(String args[])
    {
        A a = new A();
        System.out.println(a.x + " " + a.y);
    }
}
*/
/*4) Java uses ‘extends’ keywords for inheritance. Unlike C++, Java doesn’t provide an inheritance specifier like public, protected, or private. 
Therefore, we cannot change the protection level of members of the base class in Java, if some data member is public or protected in the base class then 
it remains public or protected in the derived class. Like C++, private members of a base class are not accessible in a derived class. 

Unlike C++, in Java, we don’t have to remember those rules of inheritance which are a combination of base class access specifier and inheritance specifier. 

5) In Java, methods are virtual by default. In C++, we explicitly use virtual keywords (Refer to this article for more details).

6) Java uses a separate keyword interface for interfaces and abstract keywords for abstract classes and abstract functions. 
7) Unlike C++, Java doesn’t support multiple inheritances. A class cannot inherit from more than one class. However, A class can implement multiple interfaces.

8) In C++, the default constructor of the parent class is automatically called, but if we want to call a parameterized constructor of a parent class, we must use the Initializer list. Like C++, the default constructor of the parent class is automatically called in Java, but if we want to call parameterized constructor then we must use super to call the parent constructor. See the following Java example.


*/

// An abstract class example

class Base {
    private int b;
    Base(int x)
    {
        b = x;
        System.out.println("Base constructor called");
    }
}

class Derived extends Base {
    private int d;
    Derived(int x, int y)
    {
        // Calling parent class parameterized constructor
        // Call to parent constructor must be the first line
        // in a Derived class
        super(x);
        d = y;
        System.out.println("Derived constructor called");
    }
}

class tut_47_inheritance {
    public static void main(String[] args)
    {
        Derived obj = new Derived(1, 2);
    }
}
