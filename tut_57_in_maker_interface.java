/*
It is an empty interface (no field or methods). Examples of marker interface are Serializable, Cloneable and Remote interface. All these interfaces are empty interfaces. 

public interface Serializable 
{
  // nothing here
}


Examples of Marker Interface which are used in real-time applications :


$ keypoint: 
	1] it is an empty interface. 
	2] it mainly delevers the run-time-type information about the object. 
	3] in java we have 3 maker interfaces: 
	
	a] seralzable interface: present in java.io.package
				it saves object state into the file. 
	
	b] clonable interface: present in java.lang.cloneable
			       it is used to make the clone of the object 

	c] Remote interface: present in java.RMI 
			     it is used to make remote  application.  
			     

1] Cloneable interface : Cloneable interface is present in java.lang package. There is a method clone() in Object class. A class that implements the Cloneable interface indicates that it is legal for 
			 clone() method to make a field-for-field copy of instances of that class. Invoking Object’s clone method on an instance of the class that does not implement the Cloneable  
			 interface results in an exception CloneNotSupportedException being thrown. By convention, classes that implement this interface should override Object.clone() method.
		         Refer here for more details.
		        

			     

2] searealizable interface: Serializable interface is present in java.io package. It is used to make an object eligible for saving its state into a file. This is called Serialization.
			   Classes that do not implement this interface will not have any of their state serialized or deserialized. All subtypes of a serializable class are themselves serializable.

		     
		   
*/
//throws cloneNotSupportedException
// implements cloneable
// Java program to illustrate Cloneable interface
import java.lang.Cloneable;
import java.util.Scanner;  
import java.io.*; 
/*
public class Main implements Cloneable{ 

int id; 
String name; 
double cost; 

	public Main(int id, String name, double cost){
		this.id=id; 
		this.name=name; 
		this.cost=cost; 
	} 
	
	public void show(){
		System.out.println("Product Name: "+name); 
		System.out.println("Product ID: "+id); 
		System.out.println("Product cost: "+cost); 
	} 
	
// 	overriding clone methood 
    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
        protected Object clone() throws CloneNotSupportedException
        {
        return super.clone();
        }
	
	public static void main(String args[]) throws CloneNotSupportedException{
		Scanner lux=new Scanner(System.in); 
		System.out.println("Enter Name: ");
		String name=lux.nextLine(); 
		System.out.println("Enter ID: "); 
		int id=lux.nextInt(); 
		System.out.println("Enter cost: "); 
		double cost=lux.nextDouble(); 
		// the product p1 is the object which is going to be clone
		Main p1=new Main(id,name,cost);  
		// the product object p2 is which is cloned from p1 
		Main p2= (Main)p1.clone(); 
		p2.show(); 
	} 
}

*/
class save implements Serializable{
    int i; 
}


public class tut_57_in_maker_interface{
	    public static void main(String args[]) throws IOException, ClassNotFoundException{
        save obj=new save(); 
        obj.i=69; 
        File f=new File("obj.txt"); 
        FileOutputStream fos=new FileOutputStream(f); 
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj); 
        
        FileInputStream fis=new FileInputStream(f); 
        ObjectInputStream ois=new ObjectInputStream(fis); 
        save obj1=(save) ois.readObject(); 
        System.out.println("value of obj1 is" +obj1.i);
    } 
}
