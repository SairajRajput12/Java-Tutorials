interface car{ 
    interface parameters{
        void speed(int sp); 
        void model_name(String name); 
        void model_price(int price); 
        void model_milege();  
        void type(); 
    }
}


class fortuner implements car.parameters{
    public void speed(int sp){
        System.out.println("The speed of the model is "+sp +"Km/Hr");
    } 
    
    public void model_name(String name){
        System.out.println("Name: "+name); 
    } 
    
    public void model_price(int price){
        System.out.println("price: "+price+" ismein tera ghar chala jayenga"); 
    } 
    
    public void model_milege(){
        System.out.println("milege is more than dug duga"); 
    }  
    
    public void type(){
        System.out.println("four wheeler"); 
    } 
}
public class tut_56_nested_interference
{
	public static void main(String[] args) {
// 		System.out.println("Hello World"); 
        fortuner fuck=new fortuner(); 
        fuck.type(); 
        fuck.model_name("562ETWQ"); 
        fuck.speed(45); 
        fuck.model_milege(); 
        fuck.model_price(80000); 
	}
}

