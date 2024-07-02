class DArray{
	public static void main(String args[]){
		int array[]={12,2,181,19,12,8,19};
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[j]==array[i]){
					System.out.println(array[i]);
				}
			}
		}
	}
}