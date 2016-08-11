package javaCoding2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicate {
	
	public static void removeDup(List list){
		System.out.println("Before Removing Duplicate");
		System.out.println(list);
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		System.out.println("After Removing Duplicate");
		lhs.addAll(list);
		System.out.println(lhs);
	}
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("C");
		list.add("Java");
		
		removeDup(list);
		
	}

}
