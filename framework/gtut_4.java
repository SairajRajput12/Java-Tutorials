import java.util.*; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gtut_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       //  Operation 1:  Linked list to To Array by using  toArray();


            LinkedList<Integer> list= new LinkedList<Integer>();
            list.add(123);
            list.add(12);
            list.add(11);
            list.add(1134);
            System.out.println("LinkedList: "+ list);
            Object[] a = list.toArray();
            System.out.print("After converted LinkedList to Array: ");
            for(Object element : a)
                System.out.print(element+" ");
            
        // 
    }
}
