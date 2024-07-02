class Mythread extends Thread{
	public void run(){
		try{
			for(int i=1;i<=10;i++){
			Thread.sleep(100);
			System.out.println(" i is running ");
		}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		
	}
}
class MultiThread{
	public static void main(String [] args){
		
		Mythread m=new Mythread();
		m.start();
		for(int j=1;j<=10;j++){
			System.out.println("j is running");
		}
	}
}