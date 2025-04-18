// String--------> The array of charecters is known as string. it is also known as word.
/*
important points: 
        1] strings are immutable in nature.means we cannot change the characters of the string. a String object is likely to have one or many references. If several references point to the same String without even knowing it, it would be bad if one of the references modified that String value. That's why String objects are immutable. this reason is reffering due to interning. 
        
        -> the imutability property causes poor performance due to creation of multiple copies due to changing value of that existing string. it causes large time taken means large time complexity.  
        
        2] we cannot access the string with index like in c++. we have to use charAt() length. 
        
        3] we can assign the value to the string. 
        
        4] we can add the string,characters and integers. while adding integers and characters they first converted into the string then 
        added into the current string. 
        
        5] addition of strings starts from left to right. 
        e.g, System.out.println(10+20+30+40+"abc"+10+20+30); // 100abc102030

        6] substring is a continous part of string.  

        7] when 2 variables have same content then they are pointing to the same memory location.   
        
        8] we cannot use comparision operator in case of string. 
*/



//public class 	tut_4_string{ 
//	public static void main(String args[]){ 
		//String s2="sairaj";                                            
		//System.out.println(s2);
		  // direct declaration 
		// output: sairaj 
	
		// now,declaring using "new" keyword. 
		//String d=new String("Sairaj");
		//System.out.println(d); 
		//output:Sairaj 
		
		//byte[] b_arr1 = {71, 101, 101, 107, 115};
		//String s_byte =new String(b_arr); //Geeks 
		//System.out.println(s_byte);
		
		// another class 
		//byte[] b_arr = {71, 101, 101, 107, 115};
                //String s = new String(b_arr, "US-ASCII"); //Geeks
		//System.out.println(s);
	
	
		//byte[] b_arr = {71, 101, 101, 107, 115};
		//String s = new String(b_arr, 1, 3); // eek 
		//System.out.println(s);	
		// output: eek 
	
		//StringBuffer s_buffer = new StringBuffer("Geeks");
                //String s = new String(s_buffer); //Geeks
		//System.out.println(s);
		
		//output: Geeks 



// string methods
		
/*

1] int length(): Returns the number of characters in the String.

	"GeeksforGeeks".length();  // returns 13

2] Char charAt(int i): Returns the character at ith index.

	"GeeksforGeeks".charAt(3); // returns  ‘k’

3]String substring (int i): Return the substring from the ith  index character to end.

"GeeksforGeeks".substring(3); // returns “ksforGeeks”

4]String substring (int i, int j): Returns the substring from i to j-1 index.

 "GeeksforGeeks".substring(2, 5); // returns “eks”

5]String concat( String str): Concatenates specified string to the end of this string.

 String s1 = ”Geeks”;
 String s2 = ”forGeeks”;
 String output = s1.concat(s2); // returns “GeeksforGeeks”

6]int indexOf (String s): Returns the index within the string of the first occurrence of the specified string.

 String s = ”Learn Share Learn”;
 int output = s.indexOf(“Share”); // returns 6 -> (furst occurance). 

7]int indexOf (String s, int i): Returns the index within the string of the first occurrence of the specified string, starting at the specified index.

 String s = ”Learn Share Learn”;
 int output = s.indexOf("ea",3);// returns 13

8]Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified string.

 String s = ”Learn Share Learn”;
 int output = s.lastIndexOf("a"); // returns 14

9]boolean equals( Object otherObj): Compares this string to the specified object.

 Boolean out = “Geeks”.equals(“Geeks”); // returns true
 Boolean out = “Geeks”.equals(“geeks”); // returns false

10]boolean  equalsIgnoreCase (String anotherString): Compares string to another string, ignoring case considerations.

 Boolean out= “Geeks”.equalsIgnoreCase(“Geeks”); // returns true
 Boolean out = “Geeks”.equalsIgnoreCase(“geeks”); // returns true
 
  Boolean out = “Geeks”.equalsIgnoreCase(“geeks”); // returns true

11] int compareTo( String anotherString): Compares two string lexicographically.

 int out = s1.compareTo(s2);  // where s1 and s2 are
                             // strings to be compared

 This returns difference s1-s2. If :
 out < 0  // s1 comes before s2 // it compares lexographically(means comparing the ASCI value of each character.and returns there difference).  
 out = 0  // s1 and s2 are equal.
 out > 0   // s1 comes after s2.

12] int compareToIgnoreCase( String anotherString): Compares two string lexicographically, ignoring case considerations.

 int out = s1.compareToIgnoreCase(s2);  
// where s1 and s2 are 
// strings to be compared

 This returns difference s1-s2. If :
 out < 0  // s1 comes before s2
 out = 0   // s1 and s2 are equal.
 out > 0   // s1 comes after s2.

 Note- In this case, it will not consider case of a letter (it will ignore whether it is uppercase or lowercase).
String toLowerCase(): Converts all the characters in the String to lower case.

String word1 = “HeLLo”;
String word3 = word1.toLowerCase(); // returns “hello"

13]String toUpperCase(): Converts all the characters in the String to upper case.

String word1 = “HeLLo”;
String word2 = word1.toUpperCase(); // returns “HELLO”

14] String trim(): Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.

String word1 = “ Learn Share Learn “;
String word2 = word1.trim(); // returns “Learn Share Learn”

15] String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.

String s1 = “feeksforfeeks“;
String s2 = “feeksforfeeks”.replace(‘f’ ,’g’); // returns “geeksgorgeeks”

Note:- s1 is still feeksforfeeks and s2 is geektringBuilder();
 
        // str.append("GFG");
 
        // // print string
        // System.out.println("String = sgorgeeks


*/

/*Programme demonstrating string methods*/		
		
/*		 String s= "GeeksforGeeks";
        // or String s= new String ("GeeksforGeeks");
  
        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());
  
        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "
                           + s.charAt(3));
  
        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));
  
        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));
  
        // Concatenates string2 to the end of string1.
        String s1 = "Geeks";
        String s2 = "forGeeks";
	System.out.println("Concatenated string  = " +
                            s1.concat(s2));
  
        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + 
                           s4.indexOf("Share"));
  
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + 
                           s4.indexOf('a',3));
  
        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);
  
        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out);
          
        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "GeeKyMe";
        System.out.println("Changing to lower Case " +
                            word1.toLowerCase());
  
        // Converting cases
        String word2 = "GeekyME";
        System.out.println("Changing to UPPER Case " + 
                            word2.toUpperCase());
  
        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim()); 
        
        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2); 
*/        
    /*    output
	
	String length = 13
		Character at 3rd position = k
		Substring ksforGeeks
		Substring  = eks
		Concatenated string  = GeeksforGeeks
		Index of Share 6
		Index of a  = 8
		Checking Equality  false
		Checking Equality  true
		Checking Equality false
		the difference between ASCII value is=-31
		Changing to lower Case geekyme
		Changing to UPPER Case GEEKYME
		Trim the word Learn Share Learn
		Original String feeksforfeeks
		Replaced f with g -> geeksgorgeeks
*/
	
//	} 

 //}

import java.util.Scanner;

public class tut_4_string{ 

	public static void main(String args[]){  
	
	/*1] String literals
		String s="sairaj"; 
		System.out.println(s);		
		s="sairaj is best"; 
		System.out.println(s); 
	*/ 
	
	// 2] using new keyword
	/*
                String s=new String("sairaj");	 
                System.out.println(s);
                s="sairaj is the best guy in the world"; 
                System.out.println(s);
        */ 
	
	
	//Now, let's go for string buffer class.(growing,mutable and writtable) 
	//1] append():
	/*
	String s1=new String("sairaj");
	s1.concat(" Rajput");
	
	StringBuffer s = new StringBuffer("sairaj");
	System.out.println("initial value of both string"+s);
	
	// Let's talk about string methoods. 
	
	
	s.append(" Rajput"); 
	System.out.println("value of string from StringBuffer class after using append methood "+s);	 
	System.out.println("value of String from string class after using concat methood "+s1); 
	
	// hence string from class string is immutable.
	*/  
	
	//2]insert():
	
	StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.insert(1, "Java");
        // Now original string is changed
        System.out.println(sb1);
	
	//output:hJavaello  
	
	
	//3]replace(): The replace() method replaces the given string from the specified beginIndex and endIndex-1.
	
	StringBuffer sb4=new StringBuffer("Hello"); 
        sb4.replace(1,3,"Java"); 
        System.out.println(sb4);
	//Output: Hjavalo
	
	//4]delete() method

    	//The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex-1
        // e.g: 
   
   	StringBuffer sb2=new StringBuffer("Hello"); 
        sb2.delete(1,3); 
        System.out.println(sb2); 
        //output:Hlo

	
	//5]reverse():The reverse() method of StringBuilder class reverses the current string. Example: 
	StringBuffer sb3 = new StringBuffer("Hello");
        sb3.reverse();
        System.out.println(sb3);	
	
	//output:olleH 
	
	//6]capacity():The capacity() method of StringBuffer class returns the current capacity of the buffer.  
	//The default capacity of the buffer is 16.  
	//If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. 
	StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
        // Now (16*2)+2=34     i.e (oldcapacity*2)+2 
        
        /*
        Do keep the following points in the back of your mind:  

 	 	  1.java.lang.StringBuffer extends (or inherits from) Object class.
	          2.All Implemented Interfaces of StringBuffer class: Serializable, Appendable, CharSequence.
	          3.public final class StringBuffer extends Object implements Serializable, CharSequence, Appendable.
	          4.String buffers are safe for use by multiple threads. The methods can be synchronized wherever necessary so that all the operations on any particular 
	            instance behave as if they occur in some serial order.
	          5.Whenever an operation occurs involving a source sequence (such as appending or inserting from a source sequence) this class synchronizes only on the
	          6.string buffer performing the operation, not on the source.
	          7.It inherits some of the methods from the Object class which such as clone(), equals(), finalize(), getClass(), hashCode(), notifies(), notifyAll().
        */
        
        // Creating adn storing string by creating object of
        // StringBuffer
        StringBuffer s = new StringBuffer("GeeksforGeeks");
 
        // Getting the length of the string
        int p = s.length();
 
        // Getting the capacity of the string
        int q = s.capacity();
 
        // Printing the length and capacity of
        // above generated input string on console
        System.out.println("Length of string GeeksforGeeks="
                           + p);
        System.out.println(
            "Capacity of string GeeksforGeeks=" + q); 
            
            
        // stringbuilder:  
        /*
        important points: 
                1] String -> internign -> immutability -> poor performance  
                2] it does not have to uppercase or to lower case functions. 
        
        constructor:
            
                1]  StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
       		2]  StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
  		3]  StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence.
  		4]  StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string. 
        */ 
            
        // Create a StringBuilder object
        // using StringBuilder() constructor
        // StringBuilder str = new StringBuilder();
 
        // str.append("GFG");
 
        // // print string
        // System.out.println("String = " + str.toString());
 
        // create a StringBuilder object
        // using StringBuilder(CharSequence) constructor
        StringBuilder str1 = new StringBuilder("AAAABBBCCCC"); // initial capacity -> 16. 
 
        // print string
        System.out.println("String1 = " + str1.toString());
 
        // create a StringBuilder object
        // using StringBuilder(capacity) constructor
        StringBuilder str2 = new StringBuilder(10);
 
        // print string
        System.out.println("String2 capacity = "
                           + str2.capacity());
 
        // create a StringBuilder object
        // using StringBuilder(String) constructor
        StringBuilder str3
            = new StringBuilder(str1.toString());
 
        // print string
        System.out.println("String3 = " + str3.toString());
        
         // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str = new StringBuilder("AAAABBBCCCC"); 
 
        // print string
        System.out.println("String = "
                           + str.toString());
 
        // reverse the string
        StringBuilder reverseStr = str.reverse(); // reversing the string. 
 
        // print string
        System.out.println("Reverse String = "
                           + reverseStr.toString());
 
        // Append ', '(44) to the String
        str.appendCodePoint(44);
 
        // Print the modified String
        System.out.println("Modified StringBuilder = "+ str);


        // get capacity
        int capacity = str.capacity();
 
        // print the result
        System.out.println("StringBuilder = " + str);
        System.out.println("Capacity of StringBuilder = "
                           + capacity);

        // set char at: 
        StringBuilder snp = new StringBuilder("hello"); 
        System.out.println(snp); 
        snp.setCharAt(0, 'm');  // set character
        System.out.println(snp);  


        // inserting the character using insert method: 
        snp.insert(2,"makima");  // inserting character. 
        System.out.println(snp); 


        // deleting character: 
        snp.deleteCharAt(0);  // deleting character at particular index. 
        System.out.println(snp); 
        snp.deleteCharAt(0);  // deleting character. 
        System.out.println(snp);

        // delete(i,j): 
        snp.delete(6, 9); // end wala character nahi dekhta but considers from first character. 
        System.out.println(snp); 

        
        
        //Question 2:  print all substrings. 
        String mno = "abcd"; 
        for(int i = 0; i < mno.length(); i ++){
                for(int j = (i+1) ; j <= mno.length();  j ++){
                        System.out.println(mno.substring(i, j)+" ");
                }
        }

        // Question 3: toggle characters of the string: 
        // e.g, Physics to pHYSICS  
        
        // using string builder. 
        Scanner sl = new Scanner(System.in); 

        StringBuilder skp = new StringBuilder(sl.nextLine());  

        for (int i = 0; i < skp.length(); i++) {
                int asci = skp.charAt(i); 
                if(asci >= 65 && asci <= 90){
                        asci = asci + 32; 
                }
                else if(asci >= 97 && asci <= 122){
                        asci = asci - 32; 
                }
                else{
                        continue; 
                }
                char k  = (char)asci; 
                skp.setCharAt(i, k);
        }

        System.out.println(skp);
}
}
