abstract class RBI{
	abstract public  int Getpercentage(); 
}
class SBI extends RBI{
	 int Getpercentage(){
		return 7;
	}
}
class PNB extends RBI{
	int Getpercentage(){
		return 9;
		
	}
}
class TestBank{
	public static void main(String [] args){
		SBI s=new SBI();
		System.out.println(s.Getpercentage());
		
		PNB p=new PNB();
		System.out.println(p.Getpercentage());
	}
}