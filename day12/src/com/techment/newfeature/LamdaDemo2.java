package com.techment.newfeature;

interface Calculation
{
	//void add(int a,int b);
	int add(int c,int d);
}

public class LamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calculation calc =(a,b)->System.out.println("result is: "+(a+b));
		//calc.add(2, 3);
		//calc.add(4, 5);
//single line body
		Calculation calc1 = (c+d)-> c+d;
		
		Calculation calc2 =(c+d)->
		{
			if(c>d)
				return c;
			return d;
		};
		
		System.out.println(calc1.add(2, 4));
	}

}
