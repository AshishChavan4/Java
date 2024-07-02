class ArrayAdd{
	public static void main(String[] args){
		int arr[]={12,83,12,33,6,3,7,4};
		int sum=arr[0];
		for(int i=0;i<arr.length;i++){
			if(sum+arr.length==10){
				System.out.println(arr[i]);
			}	
		}
	}
}