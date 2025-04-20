class tut_64_exception_handling_all_keyword{
    public static void main(String args[]){
            int a=10,b=5,c=5;          
                try{
                    System.out.println("The division of 2 numer is: "+a/(b-c)); 
                }
                catch(ArithmeticException e){
                    System.out.println("the division is not possile");
                } 
                finally{
                    System.out.println("finally block is executed");
                }
                
              
    }
}


// Java program to demonstrate working of throws
class ThrowsExecp {

    // This method throws an exception
    // to be handled
    // by caller or caller
    // of caller and so on.
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    // This is a caller function
    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}
