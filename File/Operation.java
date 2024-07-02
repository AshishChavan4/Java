import beans.Arith;
import beans.assets.src.Arith2;
class Operation{
	public static void main(String args[]){
		
			Arith a=new Arith();
				a.add(2,2);
				System.out.println(a.mul(10,2));
	
		 Arith2	b=new Arith2();
				System.out.println(b.even(11));
	}	
}