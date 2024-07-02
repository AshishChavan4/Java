class Pattern{
	public static void main(String []args){
		// 1
		// 23
		// 456
		// 78910
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				for(int k=j;k<=4;k++){
					System.out.print(k);
				}
				System.out.println("");
			}
		}
	}
}