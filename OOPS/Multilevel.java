class A{	
	A(String yourname){
		System.out.println("A constructor is called . "+yourname);
	}
}


class B extends A{
	B(String myname){
		super(myname);
		System.out.println("B constructor is called . "+ myname);
	}
}


class C extends B{
	C(String name){
		super(name);
		System.out.println("C constructor is called."+ name);
	}	
}

class Multilevel{
	public static void main(String args[]){
		C c=new C("jay");
	}
}  
