package mock;

import java.util.Vector;

public class CopyArray {
	public static void main(String a[]){
        Vector<String> v = new Vector<String>();
        v.add("Brad");
        v.add("John");
        v.add("Dave");
        System.out.println("Actual vector:"+v);
        String[] copyArray = new String[v.size()];
        v.copyInto(copyArray);
        System.out.println("Copied Array content:");
        for(String str:copyArray){
            System.out.println(str);
        }
	}

}
