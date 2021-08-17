package com.techment.day13;

@FunctionalInterface
interface Calculatee
{
	int add(int a,int b);
}

class CalculateUtil2
{
	static int addition(int a,int b)
	{
		return a+b;
	}
	int subtract(int a,int b)
	{
		return a-b;
	}
}


public class MethodReference3 {

	public static void main(String[] args) {
		
		//lamda
		Calculate cal = (a,b)->a+b;
		System.out.println(cal.add(2, 4));
		
		Calculate cal2 = (a,b)->a-b;
		System.out.println(cal2.add(12, 4));
		
		//method reference
		//Add add = new Add();
		//Calculate c1 = add::addition;
		//System.out.println(c1.add(2, 4));
		
		//Sub sub = new Sub();
		//Calculate c2 = sub::subtract;
		//System.out.println(c2.add(4,1));
		
		CalculateUtil calutill = new CalculateUtil();
		Calculatee c1 = calutill::addition;		
		System.out.println(c1.add(1, 1)); //2
        
		Calculatee c2 = calutill::subtract;
		c2.add(2,2);
		


	}

}