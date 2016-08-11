package mock;

import java.util.ArrayList;
import java.util.List;

public class CommonIndex {
	public static void main(String[] args) {
		int[] a={0,1,1,2,2,5};
		int[] b={0,1,2,2,2,6};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++){
			if(a[i]==b[i]){
				list.add(a[i]);
			}
		}
		System.out.println("c=" +list);
	}

}
