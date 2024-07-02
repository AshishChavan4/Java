class MaxArray{
	public static void main(String [] args){
		
		int array[]={21,16,25,30,22};
		int max=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		System.out.println(max);
			
		
}
}