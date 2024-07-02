abstract class Root{
	
	public int number;
	
	Root(int num){
		this.number=num;
	}
	
  abstract public int findsquareroot();
  abstract public int findcuberoot();
  
  public void run(){
	  System.out.println("RUN");
  }
	
}
class SquareRoot extends Root{
	
	SquareRoot(int num){
		super(num);
	}
	public int findsquareroot(){
		return number*number;
	}
	public int findcuberoot(){
		return number*number*number;
	}
	
}

class Abstraction{
	public static void main(String args[]){
		
		SquareRoot sq=new SquareRoot(4);
			System.out.println(sq.findsquareroot());
			System.out.println(sq.findcuberoot());
				sq.run();
	
	}
}