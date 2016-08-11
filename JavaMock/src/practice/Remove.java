package mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		String removeElement = "Gmail";
        ArrayList<String> list = new ArrayList<String>();
        list.add("Facebook");
       list.add("Twitter");
        list.add("Pinterest");
        list.add("WhatsApp");
        list.add("Gmail");
        System.out.println("Before remove:");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(removeElement.equals(it.next())){
            	
            	
                it.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(list);

	}

}
