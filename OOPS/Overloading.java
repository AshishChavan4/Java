 class Animal{
	public void run(){
		System.out.println("Animal is running");
	}
}

class Rabbit extends Animal{
	public void run(){
		super.run();
		System.out.println("Rabbit is running");
	}
}

public class Overloading{
	public static void main(String [] args){
		Rabbit r=new Rabbit();
		r.run();
	}
} 
