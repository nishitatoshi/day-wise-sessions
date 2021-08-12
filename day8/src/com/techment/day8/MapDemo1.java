package com.techment.day8;
import java.util.HashMap;
import java.util.Map.Entry;
public class MapDemo1 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "sachin", 18);
		Student student2 = new Student(1, "sachin", 18);
		System.out.println(student1.hashCode());//generate hashmap and equals in student class to get equal hashcodes.
		System.out.println(student2.hashCode());
		HashMap<Student , String> hm= new HashMap<Student , String>();
		hm.put(new Student(1,"sachin",19), "cse");
		hm.put(new Student(1,"sachin",19), "cse");
		System.out.println("hashmap "+hm);
		for(Entry<Student ,String> stu:hm.entrySet())
		{
			System.out.println(stu);
		}




	}

}
