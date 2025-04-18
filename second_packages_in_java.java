// All the classes and interfaces of this package
// will be accessible but not subpackages.
//import package.*;

// Only mentioned class of this package will be accessible.
//import package.classname;

// Class name is generally used when two packages have the same
// class name. For example in below code both packages have
// date class so using a fully qualified name to avoid conflict
//import java.util.Date;
//import my.package.Date;


/* import 'MyClass' class from 'names' myPackage */
// Java program to illustrate if-else-if ladder
 
import java.io.*;
 
class second_packages_in_java {
    public static void main(String[] args)
    {
        // initializing expression
        int i = 20;
 
        // condition 1
        if (i == 10){
            System.out.println("i is 10\n");
 	}
        // condition 2
        else if (i == 15){
            System.out.println("i is 15\n");
 		}
        // condition 3
        else if (i == 20){
            System.out.println("i is 20\n");
 		}
        else{
            System.out.println("i is not present\n");
 	}
        System.out.println("Outside if-else-if");
    }
}
