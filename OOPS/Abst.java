
abstract class root{
	public int number;
	root(int num){
		this.number=num;
	}
	
	abstract public int findroot();
	
}

class SquareRoot extends root{
	SquareRoot(int num){
		super(num);
	}
	public int findroot(){
		return number+number;
	}
}



class Abst{
	public static void main(String [] args){
		SquareRoot sq=new SquareRoot(6);
		System.out.println(sq.findroot());
	}
}