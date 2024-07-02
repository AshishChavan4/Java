class MyString {
	public static void main(String args[]){
		/*
		String st="WEB";
		System.out.println(st);
		String st1="WEB";
		System.out.println(st1);
		
	 	String str=new String("WORLD");
		System.out.println(str);
		String str1=new String("WORLD");
		System.out.println(str1);
		
		
		 StringBuffer sb=new StringBuffer("CNC");
		System.out.println(sb);
		
		 StringBuffer sb1=new StringBuffer("CNC");
		System.out.println(sb1);
		
		*/
		
		
		String st="WEB";
		String st1="WEB";
		
	 	String str=new String("WORLD");
		String str1=new String("WORLD");
		
		StringBuffer sb=new StringBuffer("CNC");
		StringBuffer sb1=new StringBuffer("CNC");
		
		System.out.println(st==st1);//t
		System.out.println(st.equals(st1));//t
		
		System.out.println(str==str1);//f
		System.out.println(str.equals(str1));//t
		
		System.out.println(sb==sb1);//f
		System.out.println(sb.equals(sb1));//f
		
		
		
		
		
		
		
		
		
		
		
		/*
		st=st.concat(st1);
		System.out.println(st);
	
		sb.append(sb1);
		System.out.println(sb);
		*/
		
		
		
		
		
		
	}
}