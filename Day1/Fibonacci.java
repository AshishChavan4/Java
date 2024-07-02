class Fibonacci{
	public static void Fibo(int n){
	int n1=0;
    int	n2=1;
	System.out.print(n1);
	System.out.print(n2);
	
	for(int i=2;i<=10;i++){
		int n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+ n3);
	}
	}
	public static void main(String[]args){
		Fibo(10);
	}
}