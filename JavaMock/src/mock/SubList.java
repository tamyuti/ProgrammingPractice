package mock;


import java.util.ArrayList;
import java.util.List;

public class SubList {
	public static void main(String a[]){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("four");
        arr.add("five");
        List<String> list = arr.subList(1, 4);
        System.out.println("Sub List: "+list);
	}

}
