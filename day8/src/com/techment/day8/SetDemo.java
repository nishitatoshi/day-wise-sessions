package com.techment.day8;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs = new HashSet();
hs.add(1);
hs.add(2);
hs.add(2);
hs.add(7);
System.out.println("Hashset "+hs);

LinkedHashSet lhs=new LinkedHashSet();
lhs.add(1);
lhs.add(2);
lhs.add(2);
lhs.add(7);
System.out.println("Linked Hashset "+lhs);

TreeSet ts = new TreeSet();
ts.add(11);
ts.add(2);
ts.add(2);
ts.add(7);
System.out.println("Tree Set "+ts);



	}

}
