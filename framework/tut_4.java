import java.util.*; 
 
public class tut_4
{
	public static void main(String[] args) {
        // Enumeration: it is a kind of cursor: 
        Vector a=new Vector(); 
        a.add("sairaj");
        a.add("efficient engineer"); 
        a.add("20"); 
        System.out.println(a);  
       
        // writting first programme of enumeration cursor: 
        Enumeration e=a.elements(); 
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}

