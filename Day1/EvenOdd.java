class EvenOdd{
	public static void main(String args[]){
		int array[]={21,16,25,30,22};
		int even=0;
		int odd=0;
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}
		    System.out.println("Count of even numbers in the array"+ even);
			System.out.println("Count of odd numbers in the array"+ odd);
	}
}