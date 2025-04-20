
/* 


				//     using data members variable
class parent{
    int cash=98000; 
}

class child extends parent{
    int cash=150; 
    void show(){
        System.out.println("The amount earned by child is: "+cash); 
        System.out.println("The amount that he got from his father is: "+super.cash);
    }
}


public class tut_58_super_keyword
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
    child ramesh=new child(); 
    ramesh.show(); 
	}
}

				//using super in case of methoods

// Java program to show use of super with methods
 
// superclass Person
class Person {
    void message()
    {
        System.out.println("This is person class\n");
    }
}
// Subclass Student
class Student extends Person {
    void message()
    {
        System.out.println("This is student class");
    }
    // Note that display() is
    // only in Student class
    void display()
    {
        // will invoke or call current
        // class message() method
        message();
 
        // will invoke or call parent
        // class message() method
        super.message();
    }
}
// Driver Program

class Test {
    public static void main(String args[])
    {
        Student s = new Student();
 
        // calling display() of Student
        s.display();
    }
}

			
			// using superkeywords in case of constructors. 
class must_do{
    public must_do(){
        System.out.println("you must do DSA before going into competitive coding");
    }
}

class competitive extends must_do{
    public competitive(){
        super(); 
        System.out.println("before go for competitive coding "); 
    }
}


public class tut_58_super_keyword
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
            competitive c=new competitive(); 
            
	}
}




*/


