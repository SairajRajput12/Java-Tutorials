/*
// Java Program to demonstrate Different
// Ways of Initializing a final Variable
  
// Main class 
class GFG {
    
    // a final variable
    // direct initialize
    final int THRESHOLD = 5;
     
    // a blank final variable
    final int CAPACITY;
      
    // another blank final variable
    final int  MINIMUM;
      
    // a final static variable PI
    // direct initialize
    static final double PI = 3.141592653589793;
      
    // a  blank final static  variable
    static final double EULERCONSTANT;
      
    // instance initializer block for 
    // initializing CAPACITY
    {
        CAPACITY = 25;
    }
      
    // static initializer  block for 
    // initializing EULERCONSTANT
    static{
        EULERCONSTANT = 2.3;
    }
      
    // constructor for initializing MINIMUM
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    public GFG() 
    {
        MINIMUM = -1;
    }
}


// what about final refrence variable ? 
class Main{
    public static void main(String args[]){
        final StringBuffer sb=new StringBuffer("king"); 
        System.out.println("first initialisation the value of string is: "+sb); 
        sb.append(" of kings"); 
        System.out.println("after appending the value is: "+sb); 
        System.out.println("the mutation is possible in case of final refrence variable"); 
    }
}




// Java Program to demonstrate Final
// with for-each Statement
  
// Main class
class GFG {
  
    // Main driver method
    public static void main(String[] args)
    {
  
        // Declaring and initializing
        // custom integer array
        int arr[] = { 1, 2, 3 };
  
        // final with for-each statement
        // legal statement
        for (final int i : arr)
            System.out.print(i + " ");
    }
}

Output

1 2 3 

Output explanation: Since the “i” variable goes out of scope with each iteration of the loop, it is actually re-declaration each iteration, allowing the same token (i.e. i) to be used to represent 
multiple variables. 
*/
















