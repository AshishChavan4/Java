abstract class Animal{
	public void eat(){
		System.out.println("eating...");
	}
	abstract public void walk();
}
class Horse extends Animal{
	public void walk(){
		System.out.println("Walking on 4 legs");
	}
}

class Chicken extends Animal{
	public void walk(){
		System.out.println("walking on 2 legs");
	}
}

class OOPS{
	public static void main(String [] args){
		
		
		Chicken c=new Chicken();
		c.eat();
		c.walk();
		
		Horse h=new Horse();
		h.eat();
		h.walk();
	}
}