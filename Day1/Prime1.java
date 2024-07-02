class Prime1{
	public static void fun(int num){
	boolean isPrime=false;
	if(num==0 || num==1){
		System.out.println("0 or 1 cant prime numbers");
	}
	else{
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isPrime=true;
				break;
			}
		}
		if(isPrime){
		System.out.println(num +"is not a prime number");
	}
	else{
		System.out.println(num +"is a prime number");
	}
	}
	}
	public static void main(String args[]){
		fun(12);
		fun(3);
		
	}
}