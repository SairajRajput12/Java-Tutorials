/*
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}
*/

/*
import java.util.Scanner;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public void Salary(){
   	System.out.println("Salary: "+salary);
    } 
    
    public void Name(){
   	System.out.println("Name: "+name);
    }
    
    public void setName(){
   	System.out.println("Enter your new name"); 
   	Scanner s=new Scanner(System.in); 
   	String st=s.nextLine();  
   	name=st;
   	System.out.println("your new name is: "+name); 
    }
    
    public int getSalary(){
        return salary;
    }
}
*/ 

class tommy{ 
	String name; 
	int kills; 
	String game; 
	
    public void printDetails(){
        System.out.println("Game protagnist name: " + name);
        System.out.println("Kills: "+ kills); 
        System.out.println("game: "+ game);
        
    }

    public void hit(){ 
     System.out.println("hitting");
    } 

    public void run(){ 
     System.out.println("running");
    }  
    
    public void jump(){ 
     System.out.println("jumping");
    }  
    
}  
public class tut_36_oops {
    public static void main(String[] args) {
      /*  System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        */ 
    
    /*    
        Employee h=new Employee(); 
        h.id=58; 
        h.salary=4500000; 
        h.name="Sairaj"; 
        h.printDetails();
        h.Salary(); 
        h.Name(); 
        h.setName(); 
        h.Name(); 
        
     */ 
     
     tommy t=new tommy(); 
     t.name="Tommy vercetee"; 
     t.kills=350; 
     t.game="Gta vice city"; 
     t.printDetails();
     t.hit(); 
     t.run(); 
     t.jump();
        
    }
}

