class A{
	A(String myname,int myage){
		System.out.println("A constructur is called.. "+myname+myage);
	}
	
	public int balance;
	
	public void run(int num){
		this.balance=num;
	System.out.println("Run method called .. "+num);	
	}
}

class B extends A{
	B(String name,int age){
		super(name,age);
		System.out.println("B constructur is called.. "+name+age);
	}
	public void fun(){
	System.out.println("Fun method called .. "+balance);	
	}
}


class Inheritance{
	public static void main(String args[]){
	 B	b=new B("jay",21);
		b.run(100);
		b.fun();
	}
}