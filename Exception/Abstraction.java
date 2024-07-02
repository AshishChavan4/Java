abstract class Root{
	public int number;
	Root(int num){
		this.number=num;
	}
    abstract public int findsquareroot();
}
class Findroot extends Root{
	Findroot(int num){
		super(num);
	}
	public int findsquareroot(){
		return number*number;
	}
}
			
class Abstraction{
	public static void main(String [] args){
		Findroot f=new Findroot(8);
		System.out.println(f.findsquareroot());
		
	}
}