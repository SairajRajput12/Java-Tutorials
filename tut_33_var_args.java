class tut_33_var_args{ 



    static int add(int ...arr){
        int result=0;
      		 for (int a : arr){
       		     result = result + a;
       		 }
        	return result;
	}

	public static void main(String args[]){ 
			System.out.println("\n This is var args tutorial number 33");
      		System.out.println(add(1,2));
	        System.out.println(add(2,3,4));
	        System.out.println(add(4,5,6));				
	}
}
