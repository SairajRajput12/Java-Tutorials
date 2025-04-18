import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class tut_4_testing{
    public static void main(String args[]){
        // // byte[] b_arr1 = {71, 101, 101, 107, 115};
		// // String s_byte =new String(b_arr1); //Geeks 
		// // System.out.println(s_byte); // prints Geeks it converts the array of hte integer value into the string 

        // // byte[] b_arr = {71, 101, 101, 107, 115};
        // // String s = new String(b_arr, StandardCharsets.US_ASCII); //Geeks
        // // Using "US-ASCII" as a string works, but it can throw a UnsupportedEncodingException, which is checked, unless you're using a newer Java version where it's internally handled.


		// // System.out.println(s);

        // // byte[] b_arr2 = {71, 101, 101, 107, 115};
		// // String s1 = new String(b_arr2, 1, 3); // eek 
		// // System.out.println(s1);	
		// // output: eek 
		
        // String str1 = "feeksforfeeks";
        // System.out.println("Original String " + str1);
        // String str2 = "feeksforfeeks".replace('f' ,'g') ;
        // System.out.println("Replaced f with g -> " + str2); 


        // StringBuffer string = new StringBuffer("Sairaj");
        // System.out.println("initial value of the string buffer was: "+string); 
        // string.append(" Rajput"); 
        // System.out.println("Value of the string after appending another string "+string);

        // StringBuffer sb1 = new StringBuffer("Hello ");
        // sb1.insert(1, "Java");
        // Now original string is changed
        // System.out.println(sb1);

        // replace(): The replace() method replaces the given string from the specified beginIndex and endIndex-1 

        // StringBuffer sb4=new StringBuffer("Hello"); 
        // sb4.replace(1,3,"Java"); 
        // System.out.println(sb4);
        //Output: Hjavalo

        // StringBuffer sb2=new StringBuffer("Hello"); 
        // System.out.println(sb2);
        // sb2.delete(1,3); 
        // System.out.println(sb2);

	    // StringBuffer sb3 = new StringBuffer("Hello");
        // sb3.reverse();
        // System.out.println(sb3);
        
        
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity()); // default 16
        // sb.append("Hello");
        // System.out.println(sb.capacity()); // now 16
        // sb.append("java is my favourite language");
        // System.out.println(sb.capacity());
        // Now (16*2)+2=34     i.e (oldcapacity*2)+2 

        // discovery bit: whether different array of same elements point to the same reference or not ?? 
        // int[] int_arr = {1,2,3,4}; 
        // int[] int_arr1 = {1,2,3,4}; 

        // if(int_arr == int_arr1){
        //     System.out.println("Yes it is equal. ");
        // }

        // String sa = "sariaj"; 
        // String sa1 = "sariaj"; 

        // if(sa == sa1){
        //     System.out.println("Equal strings");
        // }

        // byte[] byte_arr = {1,2,3,4}; 
        // byte[] byte_arr1 = {1,2,3,4}; 
        // String sa2 = new String(byte_arr); 
        // String sa3 = new String(byte_arr1);  
        // if(sa2 == sa3){
        //     System.out.println("Equal strings from the same array");
        // }

        // toggle character from the string 
        // Scanner sc = new Scanner(System.in); 
        // StringBuilder skp = new StringBuilder(sc.nextLine());  

        // for(int i = 0; i < skp.length(); i ++)
        // {
        //     int c = (int)skp.charAt(i); 
        //     if(c >= 65 && c <= 90){
        //         System.out.println("toggling starts");
        //         char d = (char)(c + 32); 
        //         System.out.println(d);
        //         skp.setCharAt(i, d); // mistake i mistakenly used character as the first parameter. 
        //     } 
        // }

        // System.out.println("New value of the string is: "+skp);
        // byte a = 126;
        // byte b; 
        // System.out.println(a);
        // a ++; 
        // System.out.println(a); // 127
        // // System.out.println(b);  // cannot use uninitialise byte variale
        
        // byte c = 011; 
        // int d = 00100; 
        // System.out.println(c); // prints value 9 means it will be 8 + 1 => 9. 
        // System.out.println(d); // prints the value of teh bit in the power of 8. 
        
        byte a = 126;
 
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
        System.out.println(a); 

        
        

    }
}
