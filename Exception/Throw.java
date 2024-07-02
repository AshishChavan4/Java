 class Throw{
	public static void result(int a){
	if(a<36){
			throw new ArithmeticException("You are not pass");
		}
	}
	
	public static void main(String args[]){
		try{ 
			result(93);
			System.out.println("You are pass");
		}catch(ArithmeticException r){
			System.out.println(r.getMessage());
		}
	}
}

// class Vote{
	
	// public static void vote(int x){
		// if(x<18){
			// throw new ArithmeticException("user not allow");
		// };
	// }
	
	// public static void main (String args []){
		
		// try{
			// vote(17);
			// System.out.println("user allow");
		// }catch(Exception error){
			// System.out.println(error.getMessage());
		// }
		
	// }
// }