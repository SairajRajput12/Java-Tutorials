import first_package.compare; 
//first_package---> package name; 
//compare--->class name; 

public class tut_1_package_basics {
    public static void main(String args[])
    {
        compare c=new compare(5,6); 
        c.getmax(); 
        c.show(); 
        
        System.out.println("We have succesfully created our first package");
    }
}
