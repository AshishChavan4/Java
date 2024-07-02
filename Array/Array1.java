class Array1{
	public static void main(String [] args){
		int array[]={17,23,83,92,16,23,16};
		
		int count=0;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}