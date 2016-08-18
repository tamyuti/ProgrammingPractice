package practice;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationToListObject {
public static void main(String[] args) {
	Vector<String> vct = new Vector<String>();
    vct.add("Bob");
    vct.add("Dave");
    
    Enumeration<String> e = vct.elements();
    List<String> list = Collections.list(e);
    System.out.println("List elements: "+list);

}
}
