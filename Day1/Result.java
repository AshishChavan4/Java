class Result{
	public static void main(String [] args){
		int marks=84;
		if(marks>=85 && marks<=100){
			System.out.println("Grade is A+");
		}
		else if(marks>=70 && marks<=85){
			System.out.println("Grade is A");
		}
		else if(marks>=60 && marks<=70){
			System.out.println("Grade is B+");
		}
		else if(marks>=50 && marks<=60){
			System.out.println("Grade is B");
		}
		else if(marks>=35 && marks<=50){
			System.out.println("Grade is c");
		}
		else if(marks>=0 && marks<35){
			System.out.println("Fail");
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}