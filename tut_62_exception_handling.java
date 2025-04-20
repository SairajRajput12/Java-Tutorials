/*there are 2 types of exception: 
				1] built-in exception-----------> 1] checked 
							|
						    |--------> 2] uncheked
				2] userdefined 
				
in case of user defined exception the methoods used are: 

1] printStackTrace(): it prints the all information about that exception ( name of exception,description and stack format). 

2] toString() – This method prints exception information in the format of Name of the exception: description of the exception. 

3] getMessage() -This method prints only the description of the exception. 
*/




class tut_62_exception_handling{ 
	public static void main(String args[]){
		int s=2;
		int b=0;  
		try{
			System.out.println(s/b);  
			
		}
		
		catch(ArithmeticException e){
			e.printStackTrace(); 
			e.printStackTrace(); 
			System.out.println(e.toString());
		}
	}
}


