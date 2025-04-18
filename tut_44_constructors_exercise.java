
class cylinder{  
int radius; 
int height;
	
	public cylinder(int radius,int height){  
		System.out.println("Entering into cylinder constructor ");
		this.radius=radius; 
		this.height=height;
	}

	public void getRadius(){ 
		System.out.println("The radius of cylindrical constructor is "+radius);
	} 
	
	public void getHeight(){ 
		System.out.println("The height of a cylindrical constructor is "+height); 
		System.out.println("exiting into cylinder constructor");
	}
	
	public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
 	   }
        public double volume(){
        return Math.PI * radius * radius * height;
    }

}




class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class tut_44_constructors_exercise{ 
	public static void main(String args[]){ 
		cylinder obj=new cylinder(15,90); 
		obj.getRadius(); 
		obj.getHeight();
		/*
    	 	   // Problem 1
    		    Cylinder myCylinder = new Cylinder(9, 12);
               	//myCylinder.setHeight(12);
        	System.out.println(myCylinder.getHeight());
       		 //myCylinder.setRadius(9);
       		 System.out.println(myCylinder.getRadius());
       		 // Problem 2
       		 System.out.println(myCylinder.surfaceArea());
       		 System.out.println(myCylinder.volume());
         */


        // Problem 3
        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
	}
}
