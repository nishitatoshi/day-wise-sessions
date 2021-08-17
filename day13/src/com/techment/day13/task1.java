package com.techment.day13;

interface LargeNumber
{
	int Largest(int a,int b,int c);
}

class CalculationUtil3
{
	void FindLargest(int a,int b,int c);
}

public class task1 {

	public static void main(String[] args) {
		
		LargeNumber lar = (a,b,c)->
		{
			if(a>b && a>c)
				return a;
			if(b>c && b>a)
				return b;
			return c;
		};
		System.out.println(LargeNumber.FindLargest(22,33,44));
		
		CalculationUtil3 calu = new CalculationUtil3();
		LargeNumber l1 = calu::FindLargest();
		System.out.println();

	}

}
