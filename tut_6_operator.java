import java.util.Scanner; 
import java.io.*;

                    // now making programme for exercise 
/*                   
public class basic_element{ 

	public static void main(String [] args){ 
	Scanner s=new Scanner(System.in);
		double sum=0; 
			for(int i=0;i<5;i++){ 
				double x=s.nextInt(); 
  			sum=sum+x;
			} 
		double total=500; 
		double div=((sum)/total)*100; 
		System.out.println("your percentage in cbse board is"+div);
	}
} 
*/

//problem set 1 
/*
public class basic_element{ 

	public static void main(String[] args){ 
		int num = 1;
	while (num < 19) {
		  num = num + 1;
	}
		System.out.println(num); 
	} 
}
*/

// Java Program to demonstrate Byte Data Type
 
// Class 

class tut_6_operator {
 
    // Main driver method
    public static void main(String args[]) {
 
  /*      byte a = 126;
 
        // byte is 8 bit value
        System.out.println(a);
 
        a++;
        System.out.println(a);
 
        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        a++;
        a++;
        System.out.println(a);
 
        // Looping back within the range
        a++;
        System.out.println(a); */
            // Main driver method
    
    

        // Declaring and initializing float value
 
      /*   float value1 = 9.87f;
        // Print statement
        // System.out.println(value1);
       // float value2 = 9.87f;
        System.out.println(value1); 
        int j=7; */  
        
        
        
        				// GFG questions on operator assosiativity 
        				
      /*  				
                int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
 
        // precedence rules for arithmetic operators.
        // (* = / = %) > (+ = -)
        // prints a+(b/d)
        System.out.println("a+b/d = " + (a + b / d));
 
        // if same precedence then associative
        // rules are followed.
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        System.out.println("a+b*d-e/f = "
                           + (a + b * d - e / f));
     */ 
     
     	//  int a = 20, b = 10, c = 0;
 
        // a=b+++c is compiled as
        // b++ +c
        // a=b+c then b=b+1
   /*     System.out.println(b++ + c);               // gives output 10 
  	System.out.println(b); 
  	a=b+c;
        System.out.println("Value of a(b+c), "
                           + " b(b+1), c = " + a + ", " + b
                           + ", " + c);
     */
 
        // a=b+++++c is compiled as
        // b++ ++ +c
        // which gives error.
        // a=b+++++c;
        // System.out.println(b+++++c);
        
                                                     //                                          string addition
       //  int x = 5, y = 8;
 
        // concatenates x and y as
        // first x is added to "concatenation (x+y) = "
        // producing "concatenation (x+y) = 5"
        // and then 8 is further concatenated.
      //  System.out.println("Concatenation (x+y)= " + x + y);                  // 58
 
        // addition of x and y
        //System.out.println("Addition (x+y) = " + (x + y));                   //13
        
        
                              // bitwise operator 
                       
     /*    int a = 5;
        int b = 7;
 
        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor         [ gives 1 when corresponding bits are there]
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));
 
        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 1's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);
 
        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    */ 
       String binary[]={
          "0000","0001","0010","0011","0100","0101",
          "0110","0111","1000","1001","1010",
          "1011","1100","1101","1110","1111"
        };
       
      // initializing the values of a and b
      int a=3; // 0+2+1 or 0011 in binary
      int b=6; // 4+2+0 or 0110 in binary
       
      // bitwise or
      int c= a | b;
       
      // bitwise and
      int d= a & b;
       
      // bitwise xor
      int e= a ^ b;
       
      // bitwise not
      int f= (~a & b)|(a &~b);
      int g= ~a & 0x0f;
       
      // in java we can fuun directly the binary form of any integer.  
      System.out.println(" a= "+binary[a]);
      System.out.println(" b= "+binary[b]);
      System.out.println(" a|b= "+ binary[c]);
      System.out.println(" a&b= "+binary[d]);
      System.out.println(" a^b= "+binary[e]);
      System.out.println("~a & b|a&~b= "+binary[f]);
      System.out.println("~a= "+binary[g]); 
      
      
    }
}
