class ArrayPrime{
	public static void main(String [] args){
	int array[]={12,29,44,29,34,19};
	
	for(int i=0;i<array.length;i++){
		boolean isPrime=false;
		if(array[i]==0||array[i]==1){
			System.out.println("0 or 1 cannot a prime number");
		}
		else{
			for(int j=2;j<array[i];j++){
				if(array[i]%j==0){
					isPrime=true;
					break;
				}
			}
		}
		if(isPrime){
		System.out.println(array[i] + " is a not a prime number");
	}
	else
	{
		System.out.println(array[i] + " is a  prime number");
	}
	}		
}
}