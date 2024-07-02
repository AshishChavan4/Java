interface Doctor{
	public void treat();
	
}
interface SubDoc{
	public void medicin();
}
 
class Patients implements Doctor,SubDoc{
	public void  treat(){
		System.out.println("treatment done");
	}
	public void  medicin(){
		System.out.println("Medicin is taken");
	}
}

class Interface{
	public static void main(String [] args){
		Patients p=new Patients();
		p.treat();
		p.medicin();
	}
}