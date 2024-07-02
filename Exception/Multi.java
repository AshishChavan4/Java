class Mythread extends Thread{	
	public void run(){
				try{
		for(int j=1;j<=10;j++){
			Thread.sleep(100);
				System.out.println("J = > "+j);
	     }	
	}catch(Exception error){
		System.out.println(error);
	}
	}
	
}

class Multi{

	public static void main(String args[]){
		
		Mythread mt=new Mythread();
					mt.start();
		for(int i=1;i<=10;i++){
			System.out.println("i = > "+i);
		}		
	}
}