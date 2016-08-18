package practice;

import java.util.ArrayList;

public class CopyList {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		
		
		list2.add("C");
		list2.add("D");
		ArrayList<String> list3=new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
	}

}
