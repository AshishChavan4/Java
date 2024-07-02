class Car{
	private int total;
	public void maintaince(){
		System.out.println("Maintaince of car is calculated"+ total);
	}
	public void servicing(int charges){
		this.total=charges;
		System.out.println("Servicing of car is calculated" + charges);
	}
}

class Encapsulation{
	public static void main(String [] args){
		Car c=new Car();
		c.servicing(1000);
		c.maintaince();
	}
}