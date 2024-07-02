class A{
	public void run(String myname){
		System.out.println("Method a is called"+ myname);
	}
}

class B extends A{
	super(name);
	B(String name){
		System.out.println("Constructor b is called"+name );
	}
	public void fun(){
		System.out.println("Method b is called");
	}
}

class Single{
	public static void main(String [] args){
		B b=new B("Ashish");
		b.run();
		b.fun();
	}
}