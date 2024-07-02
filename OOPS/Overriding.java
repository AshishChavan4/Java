class Add{
	public void get(){
		System.out.println("get");
	}
	public void get(int a){
		System.out.println("on para"+ a);
	}
	public void get(int a, int b){
		System.out.println("on para"+ (a+b));
	}
}

public class Overriding{
	public static void main(String [] args){
		Add a=new Add();
		a.get();
		a.get(12);
		a.get(12,34);
	}
}