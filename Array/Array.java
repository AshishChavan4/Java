class Array{
	public static void main(String[]args){
		int array[]={55,78,34,22,82};
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum=sum+array[i];
		}
		System.out.println("Total sum of array is: " + sum);
	}
}