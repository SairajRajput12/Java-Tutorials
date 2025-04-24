//					HashSet vs TreeSet 
public class gtut_13{
	public static void main(String args[]){
		System.out.println("This is tutorial number 13: HashSet vs TreeSet"); 
	/*
	
		1] HashSet: 
			I] For operations like search, insert and delete. It takes constant time for these operations on average. HashSet is faster than TreeSet. HashSet is Implemented using a hash 
		   table. 
			II] Elements in HashSet are not ordered  
			
			III] HashSet allows the null object. 
			
			IV] HashSet uses equals() method to compare two objects in Set and for detecting duplicates.
			
			
	
	
		2] TreeSet: 
			I] TreeSet takes O(Log n) for search, insert and delete which is higher than HashSet. But TreeSet keeps sorted data. Also, it supports operations like higher() (Returns least 
			    higher element), floor(), ceiling(), etc. These operations are also O(Log n) in TreeSet and not supported in HashSet. TreeSet is implemented using a Self Balancing Binary 
			    Search Tree (Red-Black Tree). TreeSet is backed by TreeMap in Java.
	
		       II] TreeSet maintains objects in Sorted order defined by either Comparable or Comparator method in Java. TreeSet elements are sorted in ascending order by default. It offers 
		           several methods to deal with the ordered set like first(), last(), headSet(), tailSet(), etc.  
		           
		       III] TreeSet doesn’t allow null Object and throw NullPointerException, Why, because TreeSet uses compareTo() method to compare keys and compareTo() will throw 
		            java.lang.NullPointerException.  
		            
		       IV]  TreeSet uses compareTo() method for same purpose. If equals() and compareTo() are not consistent, i.e. for two equal object equals should return true while compareTo() 
		            should return zero, then it will break the contract of the Set interface and will allow duplicates in Set implementations like TreeSet       
	*/ 		
	}
}
