import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*

//ArithmeticException: It is thrown when an exceptional condition has occurred in an arithmetic operation.
// Java program to demonstrate StringIndexOutOfBoundsException

class tut_63_types_of_exception
{
    public static void main(String args[])
    {
        try {
                String a = "This is like chipping "; // length is 22
                char c = a.charAt(24); // accessing 25th element
                System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException");
        }
    }
}

*/
//NullPointerException: This exception is raised when referring to the members of a null object. Null represents nothing

// Java program to demonstrate ArithmeticException 
/*
class tut_63_types_of_exception
{
    public static void main(String args[])
    {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
}
*/ 
//StringIndexOutOfBound Exception: It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string

// Java program to demonstrate StringIndexOutOfBoundsException 

class tut_63_types_of_exception
{
    public static void main(String args[])
    {
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        
    }

        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
    
        }
    }
}
/*

// FileNotFoundException: This Exception is raised when a file is not accessible or does not open.
//Java program to demonstrate FileNotFoundException

class tut_63_types_of_exception {

        public static void main(String args[])  {
        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
                System.out.println("File does not exist");
        }
        }
}




//This exception is raised when a method could not convert a string into a numeric format.
// Java program to demonstrate NumberFormatException
class  StringIndexOutOfBound_Demo
{
    public static void main(String args[])
    {
        try {
                // "akki" is not a number
                int num = Integer.parseInt ("akki") ;

                System.out.println(num);
        } catch(NumberFormatException e) {
                System.out.println("Number format exception");
        }
        
    }
}






// Java program to demonstrate IOException
class tut_63_types_of_exceptions {

    public static void main(String[] args)
    {

        // Create a new scanner with the specified String
        // Object
        Scanner scan = new Scanner("Hello Geek!");

        // Print the line
        System.out.println("" + scan.nextLine());

        // Check if there is an IO exception
        System.out.println("Exception Output: "+ scan.ioException());

        scan.close();
}
}











// user defined exception: 
class tut_63_types_of_exception extends Exception{
    //store account information
    private static int accno[] = {1001, 1002, 1003, 1004};

    private static String name[] ={"Nish", "Shubh", "Sush", "Abhi", "Akash"};

    private static double bal[] ={10000.00, 12000.00, 5600.0, 999.00, 1100.55};
    
    // default constructor
    Main() {    }
    Main(String str){
        super(str); 
    } 
    

	public static void main(String[] args) {
	      // display the heading for the table
	    try{  
            System.out.println("ACCNO" + "\t" + "CUSTOMER" +"\t" + "BALANCE");
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] +"\t" + bal[i]);

                // display own exception if balance < 1000
                if (bal[i] < 1000)
                {
                Main me =new Main("Balance is less than 1000");
                throw me;
                }
            }
        } //end of try

        catch (Main e) {
            e.printStackTrace();
        }
	}
}

*/
/*
Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, the user can also create exceptions which are called ‘user-defined Exceptions’. 

The following steps are followed for the creation of a user-defined Exception.

    The user should create an exception class as a subclass of the Exception class. Since all the exceptions are subclasses of the Exception class, the user should also make his class a subclass of it. This is done as: 

class MyException extends Exception

    We can write a default constructor in his own exception class.

MyException(){}

    We can also create a parameterized constructor with a string as a parameter.
    We can use this to store exception details. We can call the superclass(Exception) constructor from this and send the string there. 

MyException(String str)
{
   super(str);
}

    To raise an exception of a user-defined type, we need to create an object to his exception class and throw it using the throw clause, as: 

MyException me = new MyException(“Exception details”);
throw me;

    The following program illustrates how to create your own exception class MyException.
    Details of account numbers, customer names, and balance amounts are taken in the form of three arrays.
    In main() method, the details are displayed using a for-loop. At this time, a check is done if in any account the balance amount is less than the minimum balance amount to be apt in the account.
    If it is so, then MyException is raised and a message is displayed “Balance amount is less”.
*/









