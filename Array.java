// Java program to illustrate creating an array
// of integers,  puts some values in the array,
// and prints each value to standard output.
 
 
 /*
class Array {
    public static void main(String[] args)
    {
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.            
        arr = new int[5];
 
 // arrays are declared dynamically in case of java language.
 	
 	 
 	//	there is an another way: 
 	//		int[] arr=new int[5]; 
  	
  	
  	
        // initialize the first elements of the array
        arr[0] = 10;
 
        // initialize the second elements of the array
        arr[1] = 20;
 
        // so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i
                               + " : " + arr[i]);
    }
}

*/

// Arrays of object

// Java program to illustrate creating
//  an array of objects
/*
class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
 
// Elements of the array are objects of a class Student.
public class Array {
    public static void main(String[] args)
    {
        // declares an Array of integers.
        Student[] arr;                                         // here i have created array of an object.
 
        // allocating memory for 5 objects of type Student.
        arr = new Student[5];                  
 
        // initialize the first elements of the array
        arr[0] = new Student(1, "aman");
 
        // initialize the second elements of the array
        arr[1] = new Student(2, "vaibhav");
 
        // so on...
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                               + arr[i].roll_no + " "
                               + arr[i].name);
    }
}
*/
                
                
 // Direct declaration
// Java program to illustrate creating       
//  an array of objects
/*   
class Student
{
    
    public String name;
    Student(String name)
    {
        this.name = name;
    }
      @Override
    public String toString(){
        return name;
    }
}
   
// Elements of the array are objects of a class Student.
public class Array
{
    public static void main (String[] args)
    {
           // declares an Array and initializing  the elements of the array
        Student[] myStudents = new Student[]{new Student("Dharma"),new Student("sanvi"),new Student("Rupa"),new Student("Ajay")};
         // Array of 5 students created but No students are there in the array
   
        // accessing the elements of the specified array
        for(Student m:myStudents){   
            System.out.println(m);
        }
    }
}
*/


// Array showing it bounds out of index error

// Code for showing error "ArrayIndexOutOfBoundsException"
 /*
public class Array {
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
 
        System.out.println(
            "Trying to access element outside the size of array");
        System.out.println(arr[5]);
    }
}
*/



//                                                            Multidimensional array

/*
public class Array {
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int arr[][]
            = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
 
        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
 
            System.out.println();
        }
    }
}
*/


//                                                      passing arrays to methods

// Java program to demonstrate
// passing of array to method
/*
 
public class Array {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };
        
        // passing array to method m1
        sum(arr);
    }
    
    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++)
        sum += arr[i];
        
        System.out.println("sum of array values : " + sum);
        
        String[] StrArray = new String[3]; 
        System.out.println(StrArray.getClass()); 
        System.out.println("sum of array values : " + sum);
        System.out.println(StrArray.getClass().getSuperclass()); 
    }
}

*/


// As, usual method can also, return array which is given below in programme.
// Java program to demonstrate
// return of array from method
/* 
class Array {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = m1();
 
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
 
    public static int[] m1()
    {
        // returning  array
        return new int[] { 1, 2, 3 };
    }
}
*/




// Class objects of arrays: 
// Java program to demonstrate
// Class Objects for Arrays
/* 
class Array {
    public static void main(String args[])
    {
        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];
 
        // array of Strings
        String[] strArray = new String[3];
 
        System.out.println(intArray.getClass());
        System.out.println(
            intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
    }
}

*/

/* output of above programme means: 
    The string “[I” is the run-time type signature for the class object “array with component type int.”
    The only direct super class of an array type is java.lang.Object.
    The string “[B” is the run-time type signature for the class object “array with component type byte.”
    The string “[S” is the run-time type signature for the class object “array with component type short.”
    The string “[L” is the run-time type signature for the class object “array with component type of a Class.” The Class name is then followed.
*/

    
//Clonning of arrays: 
// Java program to demonstrate
// cloning of one-dimensional arrays


// class Array {
//     public static void main(String args[])
//     {
//         int intArray[] = { 1, 2, 3 };
 
//         int cloneArray[] = intArray.clone();

//         int anotherArray[] = intArray; 
 
//         // will print false as deep copy is created
//         // for one-dimensional array
//         System.out.println(intArray == cloneArray);
//         System.out.println(intArray == anotherArray);
//         anotherArray[0] = 2; 
//         System.out.println(intArray == anotherArray);

 
//         for (int i = 0; i < cloneArray.length; i++) {
//             System.out.print(cloneArray[i] + " ");
//         }

//         System.out.println();
//         for (int i = 0; i < cloneArray.length; i++) {
//             System.out.print(intArray[i] + " ");
//         }
//     }
// }



// Java program to demonstrate
// cloning of multi-dimensional arrays

// class Array {
//     public static void main(String args[])
//     {
//         int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };
 
//         int cloneArray[][] = intArray.clone();
 
//         // will print false
//         System.out.println(intArray == cloneArray);
 
//         // will print true as shallow copy is created
//         // i.e. sub-arrays are shared
//         System.out.println(intArray[0] == cloneArray[0]);
//         System.out.println(intArray[1] == cloneArray[1]);
//     }
// }



//              shallow vs deep copy: 
/*
1]Shallow copy------------> shallow means above or partially.
	        |--------->Here, refrence address of object is stored.
	        |------->So, changes can be made easily in copy.
	        
When we do a copy of some entity to create two or more than two entities such that changes in one entity are reflected in the other entities as well, then we can say we have done a shallow copy. 
In shallow copy, new memory allocation never happens for the other entities, and the only reference is copied to the other entities. The following example demonstrates the same.

2]Deep copy------------>copy of original object is stored and refrence is finally copied.
               |------->deep copy allocates different memory allocations to copied object.
               |--->changes in original copy will not affect child copy.
               
When we do a copy of some entity to create two or more than two entities such that changes in one entity are not reflected in the other entities, then we can say we have done a deep copy.
 In the deep copy, a new memory allocation happens for the other entities, and reference is not copied to the other entities. Each entity has its own independent reference. 
 The following example demonstrates the same.


*/

/*
import java.util.Scanner;
 
class Array {
    public static void main(String[] args)
    {
        // Scanner class to take
        // values from console
        Scanner scanner = new Scanner(System.in);
 
        // totalTestCases = total
        // number of TestCases
        // eachTestCaseValues =
        // values in each TestCase as
        // an Array values
        int totalTestCases, eachTestCaseValues;
 
        // takes total number of
        // TestCases as integer number
        totalTestCases = scanner.nextInt();
 
        // An array is formed as row
        // values for total testCases
        int[][] arrayMain = new int[totalTestCases][];
 
        // for loop to take input of
        // values in each TestCase
        for (int i = 0; i < arrayMain.length; i++) {
            eachTestCaseValues = scanner.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];
            for (int j = 0; j < arrayMain[i].length; j++) {
                arrayMain[i][j] = scanner.nextInt();
            }
        } // All input entry is done.

   // Start executing output
        // according to condition provided
        for (int i = 0; i < arrayMain.length; i++) {
 
            // Initialize total number of
            // even & odd numbers to zero
            int nEvenNumbers = 0, nOddNumbers = 0;
 
            // prints TestCase number with
            // total number of its arguments
            System.out.println("TestCase " + i + " with "
                               + arrayMain[i].length
                               + " values:");
            for (int j = 0; j < arrayMain[i].length; j++) {
                System.out.print(arrayMain[i][j] + " ");
 
                // even & odd counter updated as
                // eligible number is found
                if (arrayMain[i][j] % 2 == 0) {
                    nEvenNumbers++;
                }
                else {
                    nOddNumbers++;
                }
            }
            System.out.println();
 
            // Prints total numbers of
            // even & odd
            System.out.println(
                "Total Even numbers: " + nEvenNumbers
                + ", Total Odd numbers: " + nOddNumbers);
        }
    }
}
*/

// Program to demonstrate 2-D jagged array in Java
/*
class Array {
    public static void main(String[] args)
    {
        // Declaring 2-D array with 2 rows
        int arr[][] = new int[2][];
 
        // Making the above array Jagged
 
        // First row has 3 columns
        arr[0] = new int[3];
 
        // Second row has 2 columns
        arr[1] = new int[2];
 
        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
*/




//       jagged array: 

/*
A jagged array is an array of arrays such that member arrays can be of different sizes, i.e., we can create a 2-D array but with a variable number of columns in each row.
 These types of arrays are also known as Jagged arrays. 
 
 Syntax: data_type array_name[][] = new data_type[n][];  //n: no. of rows
             array_name[] = new data_type[n1] //n1= no. of columns in row-1
             array_name[] = new data_type[n2] //n2= no. of columns in row-2
             array_name[] = new data_type[n3] //n3= no. of columns in row-3
                                   .
                                   .
                                   .
             array_name[] = new data_type[nk]  //nk=no. of columns in row-n 
             
 Alternative ways: 
 	          int arr_name[][] = new int[][]  {
                                  new int[] {10, 20, 30 ,40},
                                  new int[] {50, 60, 70, 80, 90, 100},
                                  new int[] {110, 120}
                                      };
                                      
                              OR                                     
                                                         
                    int[][] arr_name = {
                          new int[] {10, 20, 30 ,40},
                          new int[] {50, 60, 70, 80, 90, 100},
                          new int[] {110, 120}
                              };
                              
                              OR                                     
                                                         
                    int[][] arr_name = {
                           {10, 20, 30 ,40},
                           {50, 60, 70, 80, 90, 100},
                           {110, 120}
                              };

*/

// Another Java program to demonstrate 2-D jagged
// array such that first row has 1 element, second
// row has two elements and so on.

class Array {
    public static void main(String[] args)
    {
        int r = 5;
 
        // Declaring 2-D array with 5 rows
        int arr[][] = new int[r][];
 
        // Creating a 2D array such that first row
        // has 1 element, second row has two
        // elements and so on.
        for (int i = 0; i < arr.length; i++)
            arr[i] = new int[i + 1];
 
        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}



































