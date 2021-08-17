package com.techment.newfeature;

interface Large
{
	String Largest(int a,int b, int c);
}

public class LamdaLargest {

	public static void main(String[] args) {
		
		Large lar=(a,b,c)->
		{
			if(a>b && a>c)
				return a+"is largest";
			if(b>c && b>a)
				return b+"is largest";
			return c+"is largest";
		};
		System.out.println(lar.Largest(2,3,4));

	}

}
