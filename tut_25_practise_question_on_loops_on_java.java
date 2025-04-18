//Question 1: Write a program to print the following pattern : 
public class tut_25_practise_question_on_loops_on_java{ 
	public static void main(String args[]){ 
		//to print the pattern of
		//* * * * *
		//* * * * 
		//* * * 
		//* * 
		//* 

		for(int i = 5; i > 0; i --){
			for(int j = 0; j < i; j ++){
				System.out.print("*");
			}
			System.out.println();
		}
	
			
	} 
}
