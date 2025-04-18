class tut_34_recursion{  

	// creating method :Quick Quiz: Write a program to calculate (recursion must be used) factorial of a number in Java?
	static int factorial(int n){ 
		if(n==0 || n==1){ 
			return 1;
		} 
		
		else{ 
			return n*factorial(n-1);
		}
	} 
	
	
    static void pattern1_rec(int n) {
    int un=n-1;
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i <(un); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
	
	public static void main(String args[]){ 
		System.out.println(factorial(5));
		pattern1_rec(5);		
	}
}
