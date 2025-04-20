// A Class that represents use-defined exception

// class MyException extends Exception {
//     public MyException(String s)
//     {
//         // Call constructor of parent Exception
//         super(s);
//     }
// }

// A Class that uses above MyException
// public class Main {
//     // Driver Program
//     public static void main(String args[])
//     {
//         try {
//             // Throw an object of user defined exception
//             throw new MyException("GeeksGeeks");
//         }
//         catch (MyException ex) {
//             System.out.println("Caught");

//             // Print the message from MyException object
//             System.out.println(ex.getMessage());
//         }
//     }
// }


// In the above code, the constructor of MyException requires a string as its argument. The string is passed to the parent class Exception’s constructor using super(). The constructor of the Exception  class can also be called without a parameter and the call to super is not mandatory. 

// A Class that represents use-defined exception

class MyException extends Exception {
}

// A Class that uses above MyException
public class setText {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException();
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}

