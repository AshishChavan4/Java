class Excep{
	public static void main(String [] args){
		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(5/0);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		
	}
}