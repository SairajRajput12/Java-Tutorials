import java.util.*; 
public class gtut_2{
    public static void main(String args[]){
        //         ArrayList in java: 
        //         ArrayList is a part of the Java collection framework and it is a class of java.util package. 
        //         It provides us with dynamic arrays in Java. 
        //         Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. 
        //         This class is found in java.util package. 
        //         The main advantages of ArrayList are, if we declare an array then it’s needed to mention the size but in ArrayList, it is not needed to mention the size of ArrayList . 
        //         if you want to mention the size then you can do it. 

        ArrayList a = new ArrayList(); 
        /*
             Since ArrayList is a dynamic array and we do not have to specify the size while creating it, 
             the size of the array automatically increases when we dynamically add and remove items. 
                * Creates a bigger-sized memory on heap memory (for example memory of double size).
                * Copies the current memory elements to the new memory.
                * The new item is added now as there is bigger memory available now.
                * Delete the old memory.
        
        
        Important Features of ArrayList:

            * ArrayList inherits AbstractList class and implements the List interface.
            * ArrayList is initialized by size. However, the size is increased automatically if the collection grows or shrinks if the objects are removed from the collection.
            * Java ArrayList allows us to randomly access the list.
            * ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
            * ArrayList in Java can be seen as a vector in C++.
            * ArrayList is not Synchronized. Its equivalent synchronized class in Java is Vector.
        */
    
        // constructors in ArrayList: 
        //  1] ArrayList(): 
        /*
                This constructor is used to build an empty array list. If we wish to create an empty ArrayList with the name arr, then, it can be created as:

                        ArrayList arr = new ArrayList(); 
        */
        
        /*
        2. ArrayList(Collection c): This constructor is used to build an array list initialized with the elements from the collection c. Suppose, we wish to create an ArrayList arr which contains the elements present in the collection c, then, it can be created as: 


                ArrayList arr = new ArrayList(c); 
        */ 
        /*
        3. ArrayList(int capacity): This constructor is used to build an array list with initial capacity being specified. Suppose we wish to create an ArrayList with the initial size being N, then, it can be created as:

                 ArrayList arr = new ArrayList(N);  
        */
        
        //     Note: You can also create a generic ArrayList:

             // Creating generic integer ArrayList
             // ArrayList<Integer> arrli = new ArrayList<Integer>();
        
             
    }
}

