package mock;

import java.util.ArrayList;
import java.util.List;


public class Practice {
	public static void main(String[] args) {
		
		boolean isContain=false;
		String s="aabdceaaabbcd";
		System.out.println("Input:"+s);
		char[] c=s.toCharArray();
		List<Character> list=new ArrayList<Character>();
		for(int i=c.length-1;i>0;i--){
			if(list.contains(c[i])==isContain){
				list.add(c[i]);
			}
		}
		System.out.print("Output:");
		for(Character ch:list){
			System.out.print(ch);
		}
		
	}

}
