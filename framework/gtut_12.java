//					HashSet vs HashMap 
public class gtut_12{
	public static void main(String args[]){
		System.out.println("This is tutorial number 12: HashSet vs HashMap"); 
	/*
			Hash Set													Hash Map
	1] HashSet implements Set interface.									1] HashMap implements Map interface. 
	
	2] HashSet doesn’t allow duplicate values.								2] HashMap store key, value pairs and it does not allow duplicate keys. If key is 
													   duplicate then the old key is replaced with the new value.
	
	3] HashSet requires only one object add(Object o) which acts as a key.			                3] HashMap requires two objects put(K key, V Value) to add an element to the HashMap 	
													           object.
													          
	4] HashSet internally uses HashMap to add elements. In HashSet, the argument 				4] HashMap does not have any concept of dummy value.
           passed in add(Object) method serves as key K. Java internally associates constant  
           variable (Also known as dummy value which will be same for all objects in Hashset)  
           value for each value passed in add(Object) method. 		
	
	5] HashSet internally uses the HashMap object to store or add the objects.                              5] It useds Hashing to store the object. 
	
	6] HashSet is slower than HashMap.									6] HashMap is faster than HashSet. 
	
	7] HashSet uses the add() method for add or storing data.						7] HashMap uses the put() method for storing data.
	
	HashSet is a set, e.g. {1, 2, 3, 4, 5, 6, 7}.								HashMap is a key -> value pair(key to value) map, e.g. {a -> 1, b -> 2, c -> 2, d -> 1}. 
	

	*/ 		
	}
}
