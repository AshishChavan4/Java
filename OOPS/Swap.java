class Swap{
	public static void main(String[]args){
		int a=12; 
		int b=67;
		System.out.println("Before swapping values of a :"+ a );
		System.out.println("Before swapping values of b :"+ b );
		
		// int temp=a;
		// a=b;
		// b=temp;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("After  swapping values of a :"+ a );
		System.out.println("After swapping values of b :"+ b );
	}
}