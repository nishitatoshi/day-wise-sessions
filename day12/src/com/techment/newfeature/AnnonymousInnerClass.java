package com.techment.newfeature;

class Parent
{
	void phone()
	{
		System.out.println()"mi";
	}
}


public class AnnonymousInnerClass {

	public static void main(String[] args) {
		
		//Parent parent = new Parent();
		//parent.phone();
		//System.out.println("using annonymous way");
		Parent parent2 = new Parent()
				{
			void phone()
			{
				System.out.println("samsung");
			}
				};
				parent2.phone();

	}

}
