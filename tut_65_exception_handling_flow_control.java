//Exception occurs in try block and handled in catch block: If a statement in try block raised an exception, then the rest of the try block doesn’t execute and control passes to the corresponding 
//catch block. After executing the catch block, the control will be transferred to finally block(if present) and then the rest program will be executed. 

// I] Control flow in try-catch:
/*
class tut_65_exception_handling_flow_control{
	public static void main(String args[]){
		int[] arr=new int[4]; 
     		try{
				int i=arr[4]; 
				System.out.println("Inside the try block");		
			}  
			
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("The catch block is executed");
			}
			
			System.out.println("Inside the try-catch block");
	}
}


Explanation: 
	so, in above example the exception has occured in line number 6, then flow goes to directly to catch block. 
	In this way programme is executed and rest part is executed

*/

/*
2. Exception occurred in try-block is not handled in catch block: In this case, default handling mechanism is followed. If finally block is present, it will be executed followed by default handling 
   mechanism. 

try-catch clause :
*/

class tut_65_exception_handling_flow_control{
	public static void main(String args[]){
		int[] arr=new int[4]; 
			try{
				int i=arr[4]; 
				System.out.println("Inside the try block");		
			}  
			
			catch(NullPointerException ex){
				System.out.println("The catch block is executed");
			}
			
			finally{
				System.out.println("here exception is not handled in catch block that's why finally block is executed.");
			}
			
			System.out.println("Inside the try-catch block");
	}
}

/*
3. Exception doesn’t occur in try-block: In this case catch block never runs as they are only meant to be run when an exception occurs. finally block(if present) will be executed followed by rest of 
the program. 

    try-catch clause :
// Java program to demonstrate try-catch
// when an exception doesn't occurred in try block
class GFG
{
    public static void main (String[] args)
    {
         
        try
        {
             
            String str = "123";
                 
            int num = Integer.parseInt(str);
                 
            // this statement will execute
            // as no any exception is raised by above statement
            System.out.println("Inside try block");
             
        }
         
        catch(NumberFormatException ex)
        {
                 
            System.out.println("catch block executed...");
                 
        }
 
        System.out.println("Outside try-catch clause");
    }
}

*/

//                                                    Control flow in try-finally
/*
In this case, no matter whether an exception occur in try-block or not, finally will always be executed. But control flow will depend on whether exception has occurred in try block or not. 

1. Exception raised: If an exception has occurred in try block then control flow will be finally block followed by default exception handling mechanism.


// Java program to demonstrate
// control flow of try-finally clause
// when exception occur in try block
class GFG
{
    public static void main (String[] args)
    {
         
        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[4];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
         
        finally
        {
            System.out.println("finally block executed");
        }
         
        // rest program will not execute
        System.out.println("Outside try-finally clause");
    }
}

*/ 

/*
2. Exception not raised: If an exception does not occur in try block then control flow will be finally block followed by rest of the program

// Java program to demonstrate
// control flow of try-finally clause
// when exception doesn't occur in try block
class GFG
{
    public static void main (String[] args)
    {
         
        try
        {
            String str = "123";
             
            int num = Integer.parseInt(str);
             
            // this statement will execute
            // as no any exception is raised by above statement
            System.out.println("Inside try block");
        }
         
        finally
        {
            System.out.println("finally block executed");
        }
         
        // rest program will be executed
        System.out.println("Outside try-finally clause");
    }
}

*/











