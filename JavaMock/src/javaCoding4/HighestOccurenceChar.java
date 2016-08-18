package javaCoding4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HighestOccurenceChar{
	
	public static void printHighestOccurenceChar(String s){
		char[] c=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++){
			if(map.containsKey(c[i])){
				map.put(c[i],map.get(c[i])+1);
			}
			else{
				map.put(c[i], 1);
			}
		}
		
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(map.values());
		Collections.sort(list);
		Object largestValue;
		int size=list.size()-1;
		largestValue=list.get(size);
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    if(entry.getValue()==largestValue){
		    	System.out.println(entry.getKey() + " "+ entry.getValue());
		    }
		}	
		}
	
	public static void main(String[] args) {
		String s="hiiiihelllooooooo";
		printHighestOccurenceChar(s);
	}
	
	

}
