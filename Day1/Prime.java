class Prime{
	
	public static void main(String[]args){
		int num=12;
		boolean isPrime=false;
		
		if(num==1){
			System.out.println("Prime number cant either 0 or 1");
		}
		else{
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					isPrime=true;
					break;
				}
			}
			if(!isPrime){
				System.out.println(num +  "is a prime number");
			}
			else{
				System.out.println(num + "is a not prime number");
			}
		}
		
		
	}
}