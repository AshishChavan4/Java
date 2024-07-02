class Myrunnable implements Runnable{
	
	public String name;
	
	Myrunnable(String name){
		this.name=name;
	}
	
	public void run(){
		try{
		for(int i=1;i<=10;i++){
				Thread.sleep(500);
				System.out.println(name+" => value is => "+i);
		}
		}catch(Exception error){
				System.out.println("error=>>>"+error);
		}
	}
	
}


class Run{
	public static void main(String args[]){
	
			Myrunnable runable1=new Myrunnable("Thread 1");
			Myrunnable runable2=new Myrunnable("Thread 2");
			
			
			Thread thread1=new Thread(runable1);
			Thread thread2=new Thread(runable2);
			
			
			thread1.start();
			thread2.start();
			
			try{
			thread1.join();
			thread2.join();
			
			}catch(Exception error){
			System.out.println(error)	
			}
			
			
			System.out.println("both thread are finished");
			
			
			
			
		
	}
}
