package javaCoding2;

import java.util.ArrayList;
import java.util.Iterator;


public class List {
	public static void printListOfList(){
		ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
		ArrayList<String> innerList1=new ArrayList<String>();
		ArrayList<String> innerList2=new ArrayList<String>();
		innerList1.add("Java");
		innerList1.add("C++");
		innerList1.add("C");
		innerList2.add("Python");
		innerList2.add("Ruby");
		list.add(innerList1);
		list.add(innerList2);
		Iterator it=list.iterator();
	
		while(it.hasNext()){
			Iterator innerIterator=((ArrayList<ArrayList<String>>) it.next()).iterator();
			while(innerIterator.hasNext()){
				System.out.println(innerIterator.next());
			}
		}

	}
	public static void main(String[] args) {
		printListOfList();
		

	}
}


