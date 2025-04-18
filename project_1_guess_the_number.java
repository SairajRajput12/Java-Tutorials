import java.util.Scanner; 
import java.util.Random; 



public class project_1_guess_the_number extends HHH{ 
	public static void main(String args[]){  
	
	 /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

		HHH triple_H=new HHH(); 
		System.out.println("Welcome to payback i am HHH the game giving you  opportunity to fight against wwe champion Randy Orton");    
     		   boolean b= false;
     		   while(!b){
        		triple_H.takeUserInput();
        		b = triple_H.IsCorrect();
       		   }
	}
}


class HHH{ 
// components of the game. 
public int no_matches=0; 
public int title; 
public int user_counter;

	public HHH(){ 
		Random r=new Random(); 
		this.title=r.nextInt(100);
	}
	
	// now making getter and setter for no_matches
	/*public int get_no_matches(){ 
		return no_matches;
	} 
	
	public void set_no_matches(int no_matches){ 
		this.no_matches=no_matches;
	}
	*/
	// creating methods which will take user input 
	
	public void takeUserInput(){
        	System.out.println("Guess the number");
        	Scanner sc = new Scanner(System.in);
        	user_counter = sc.nextInt();
    	} 
    	
    	public boolean IsCorrect(){ 
    		no_matches++; 
    		if(title==user_counter){ 
    			System.out.println("Congragulation you are the new wwe champion! \nYou won in your "+no_matches+" match");  
    			return true;
    		}
    		
    		else if(title>user_counter){ 
    			System.out.println("Please come with more preparation"); 
    		} 
    		
    		else if(title < user_counter){ 
    			System.out.println("You have go to far from us!");
    		} 
    		
    		return false; 
    	}
}

