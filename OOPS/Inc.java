

class Bank{
	
	private int balance;
	
	public void getAmount(){
		System.out.println("balance is "+balance);
	}
	public void setammount(int num){
		this.balance=num;
		System.out.println("credited "+num);
	}
	
}


class Incap{
	public static void main(String args[]){
		 
				Bank karan=new Bank();
						karan.setammount(1000);
						//karan.balance=10000;
						karan.getAmount();
	}
}