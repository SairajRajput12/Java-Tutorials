/*
class for_each   
{
    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, 110 };
              
            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }
    public static int maximum(int[] numbers)
    { 
        int maxSoFar = numbers[0];
          
        // for each loop
        for (int num : numbers) 
        {
              if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
    return maxSoFar;
    }
}
*/



// limitation of for-each loop 
/*
class for_each   
{
    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, 110 };
    	System.out.println("Before modification array was:");
 	
 		for(int mark:marks){ 
 		
 			System.out.println("the value at index"+mark+"is"+marks[mark]);
 			if(mark==5){ 
 				break;
 			}
 		mark++;
 		} 	
    	
    	          
             maximum(marks);
            System.out.println("The highest score is " +marks[0]); 
            System.out.println("The highest score is " +marks[1]);
            System.out.println("The highest score is " +marks[2]);
            System.out.println("The highest score is " +marks[3]);
            System.out.println("The highest score is " +marks[4]);
	    System.out.println("Hence proved,we cannot modify array using for each loop");                       
        }
    }
    public static void maximum(int[] numbers)
    { 
        int maxSoFar = numbers[0];
          
        // for each loop
        for (int num : numbers) 
        {
         num=num*2;
        } 
        
  
    }
}

*/


/*
 
import java.io.*;
import java.util.*;
  
class for_each {
    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        // Type 1
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i : list) {
            int a = i;
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For each loop :: " + (endTime - startTime) + " ms");
          
        // Type 2
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int j = 0; j < list.size(); j++) {
            int a = list.get(j);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using collection.size() :: " + (endTime - startTime) + " ms");
          
        // Type 3
        startTime = Calendar.getInstance().getTimeInMillis();
        int size = list.size();
        for (int j = 0; j < size; j++) {
            int a = list.get(j);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("By calculating collection.size() first :: " + (endTime - startTime) + " ms");
      
        // Type 4
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int j = list.size()-1; j >= 0; j--) {
            int a = list.get(j);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using [int j = list.size(); j > size ; j--] :: " + (endTime - startTime) + " ms");
    }
}
*/

                                    
                                    
                                    // unreachable error will be displayed

// Java program to illustrate usage of
// statement after return statement
 
// Main class
/*
class for_each {
 
    // Since return type of below method is void
    // so this method should return any value
    // Method 1
    void demofunction(double j)
    {
        return;
 
        // Here get compile error since can't
        // write any statement after return keyword
 
        ++j;
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
 
        // Calling the above defined function
        new for_each().demofunction(5);
    }
}
 */ 
 
 
 
 // Java program to illustrate usage
// of return keyword
 
// Main class
class tut_11_for_each_loops {
 
    // Since return type of RR method is
    // void so this method should not return any value
    // Method 1
    void demofunction(double val)
    {
 
        // Condition check
        if (val < 0) {
 

            System.out.println(val);
            return;
            //System.out.println("oshea");    
          
        }
        else
            ++val;
    }

    // Method 2
    // Main drive method
    public static void main(String[] args)
    {
 
        // CAlling the above method
        // new for_each().demofunction(-1);
 
        // Display message to illustrate
        // successful execution of program
        System.out.println("Program Executed Successfully");
    }
}
