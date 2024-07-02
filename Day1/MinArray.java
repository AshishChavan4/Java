class MinArray{
	public static void main(String []args){
		int array[]={21,34,83,22,10,67};
		int min=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<min){
				min=array[i];
			}
		}
		System.out.println("Minimum number of array is:" + min);
	}
}