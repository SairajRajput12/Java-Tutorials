/*
class Base1{ 
	public int x; 
	
	Base1(){ 
		System.out.println("I am Base class constructor");
	}
	
	public int getX(){ 
		return x;
	} 
	
	public void setX(){ 
		this.x=x;
	}
}

class Derived extends Base1{ 
	public int y;  
	
	Derived(){ 
		System.out.println("I am derived class constructor");
	}
	
	public int getY(){ 
		return y;
	} 
	
	public void setY(){ 
		this.y=y;
	}
}

class tut_50_constructors_in_inheritance{ 
	public static void main(String args[]){ 
		//Base1 b=new Base1(); 
		Derived d=new Derived();
	}
}
*/ 
/* 
when derived class is extended from base class the constructor from base class is executed first followed by constructor of derived class. 
inheritance will be executed in order: 
	
	c1--->parent
	|			constructors execute in top to bottom order!
	c2---> Child 			
	| 
	c3----> GrandChild
*/



class Base1{ 
	public int x; 
	
	Base1(){ 
		System.out.println("I am Base class constructor");
	}
	
	Base1(int x){ 
		
		System.out.println("I am overloaded base class constructor with value of x as:"+x);
	}
}

class Derived1 extends Base1{ 
	Derived1(){ 
		System.out.println("I am derived class constructor");
	} 
	
	Derived1(int x,int y){  
		super(x);
		System.out.println("I am overloaded constructor of derived with value of y as:"+y);	
	}
}

class childDerived1 extends Derived1{ 
	childDerived1(){ 
		System.out.println("I am child derived class constructor");
	} 
	
	childDerived1(int x,int y,int z){  
		super(x,y);
		System.out.println("I am overloaded constructor of derived child class with value of y as:"+z);	
	}
}

class tut_50_constructors_in_inheritance{ 
	public static void main(String args[]){ 
		//Base1 b=new Base1(); 
		Derived1 d= new Derived1();
		childDerived1 cd = new childDerived1(12, 13, 15);
	}
}



/*
Constructors during constructor overloading :

    When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class.
    If we want to call the constructor with parameters from the parent class, we can use the super keyword.
    super(a, b) calls the constructor from the parent class which takes 2 variables


*/



























































