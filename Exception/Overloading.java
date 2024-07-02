class Overloading{
	public static void main(String [] args){
		Calculator cal=new Calculator();
		System.out.println(cal.sum(12,12));
		System.out.println(cal.sum(12.5f,21.3f));
		System.out.println(cal.sum(20,3,7));
	}
}
class Calculator{
	public static int sum(int a, int b){
		return a+b;
	}
	public static float sum(float a, float b){
		return a+b;
	}
	public static int sum(int a, int b, int c){
		return a+b+c;
	}
}
