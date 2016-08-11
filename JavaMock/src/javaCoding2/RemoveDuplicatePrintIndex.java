package javaCoding2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatePrintIndex {

	public static void removeDuplicates(List<String> list){
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(int i=0;i<list.size();i++){
			if(!hs.add(list.get(i))){
				System.out.println("Duplicate value in index: " +i);
			}
		}
	
	}
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("C");
		list.add("Python");
		list.add("Java");
		removeDuplicates(list);
		
	    }
	}
		


	



