// Java program to demonstrate Wrapping and UnWrapping
// in Java Classes

public class tut_24_wrapper_class
{
    public static void main(String args[])
    {
        //  byte data type
        byte a = 1;

        // wrapping around Byte object
        Byte byteobj = new Byte(a);
//          Byte byteObj; 
        // int data type
        int b = 10;
  
        //wrapping around Integer object
        Integer intobj = new Integer(b);
  
        // float data type
        float c = 18.6f;
  
        // wrapping around Float object
        Float floatobj = new Float(c);
  
        // double data type
        double d = 250.5;
  
        // Wrapping around Double object
        Double doubleobj = new Double(d);
  
        // char data type
        char e='a';
  
        // wrapping around Character object
        Character charobj=e;
  
        //  printing the values from objects
        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteobj:  " + byteobj);
        System.out.println("Integer object intobj:  " + intobj);
        System.out.println("Float object floatobj:  " + floatobj);
        System.out.println("Double object doubleobj:  " + doubleobj);
        System.out.println("Character object charobj:  " + charobj);
  
        // objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;
  
        // printing the values from data types
        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);
    }
}

/*
Output: 

	Values of Wrapper objects (printing as objects)
	Byte object byteobj:  1
	Integer object intobj:  10
	Float object floatobj:  18.6
	Double object doubleobj:  250.5
	Character object charobj:  a
	Unwrapped values (printing as data types)
	byte value, bv: 1
	int value, iv: 10
	float value, fv: 18.6
	double value, dv: 250.5
	char value, cv: a
*/
