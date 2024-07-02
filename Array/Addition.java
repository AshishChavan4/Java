class Addition{
	public static void main(String [] args){
		int count=0;
		int number[]={12,38,6,4,3,8,2,7};
		for(int i=0;i<number.length;i++){
			for(int j=0;j<number.length;j++){
				if(number[j]+number[i]==10){
					//System.out.println(number[i]);
					count++;
				}
			}
		}
		System.out.println( count + " Numbers addition is 10");
	}
}