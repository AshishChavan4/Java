interface RBI{
	
	public void GST();
	public void CGST();
	public static void run(){
		System.out.println("register ..");
	}
}
interface GOV{
	
	public void subsidy();
}


class MasterCard {
	
	public void atm (){
		System.out.println("ATM ");
	}
	
}

class SBI extends MasterCard implements RBI,GOV{
	
	public void account(){
		System.out.println("ACCOUNT ");
	}
	
	public void GST(){
		System.out.println("GST ");
	}
	
	public void CGST(){
		System.out.println("CGST ");
	}
	public void subsidy(){
		System.out.println("ssubsidty");
	}
}



class Inter{
	public static void main(String args[]){
		
		SBI sam=new SBI();
			sam.account();
			sam.GST();
			sam.CGST();
			sam.subsidy();
			sam.atm ();
			
			
			RBI.run();
		
	}
}