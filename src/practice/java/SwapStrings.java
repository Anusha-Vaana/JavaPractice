package practice.java;

public class SwapStrings {

	public static void main(String[] args) 
	{
		String a="Hello";
		String b="World";
		
		a=a+b;
		System.out.println(a);
		b=a.substring(0, a.length()-b.length());
		System.out.println("b is "+b);
		a=a.substring(b.length());
		System.out.println("a is "+a);
		
//		String t;
//		t=a;
//		a=b;
//		b=t;
//		System.out.println(a);
//		System.out.println(b);
		
		
		
	}

}
