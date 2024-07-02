class MyRun implements Runnable{
	public String name;
	MyRun(String name){
		this.name=name;
	}
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				Thread.sleep(100);
				System.out.println(name +" "+i);
			}
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}

class Runn{
	public static void main(String []args){
		MyRun r1=new MyRun("Thread1");
		MyRun r2=new MyRun("Thread2");
		
		Thread thread1=new Thread(r1);
		Thread thread2=new Thread(r2);
		
		thread1.start();
		thread2.start();
		
		try{
			thread1.join();
			thread2.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
		
		System.out.println("All threads Finished");
	}
}