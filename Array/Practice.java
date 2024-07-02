class Practice{
      
	public static void main(String [] args){
		int num[]={2,3,5,19,29,21};
		int count=0;
		for(int i=0;i<num.length;i++){
			boolean isPrime=false;
			for(int j=2;j<num[i];j++){
				if(num[i]%j==0){
					 isPrime=true;
					 count++;
					 break;
				}
				
		}
		if(!isPrime){
			System.out.println(num[i]+ count + " is prime number");
		}
		else{
			System.out.println(num[i]+ count + " is not prime number");
				
			}
			
			
		}
		
		
	}
}  