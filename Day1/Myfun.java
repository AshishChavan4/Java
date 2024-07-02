class Myfun{
	
	//static 
	//non static
	
	public static void add(int x,int y){
	System.out.println("add Call "+(x+y));	
	}
	public static void mul(int x,int y){
		System.out.println("Mul call "+(x*y));
	}
	public static int div(int x,int y){
		   return   (x/y);
	}
	public static String myname(String name){
		return name ;
	}
	public static String even(int x){
		if(x%2==0){
			return "even";
		}else{
			return "odd";
		}
	}
	public static void main(String args[]){	
	
	//add(2,10);
	mul(2,10);
	mul(3,10);
	mul(4,10);
	mul(5,10);
	
	int result=div(10,2);
	System.out.println("New value "+result);
	
	
	String newname = myname("cnc web");
	System.out.println("new name" +newname);
	
	
	
		String ans = even(9);
		System.out.println(ans);
	
	}
}


/*
A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.
*/