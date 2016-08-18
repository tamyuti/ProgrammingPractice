/*3.Display count of duplicate characters along 
with character in given string.
eg: hiiiihelllooooooo
h-2
i-4
l-3
0-7*/

package javaCoding4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateChar {
	public static void countDuplicateCharacter(String s){
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
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    System.out.println(entry);
		}	
	}
	public static void main(String[] args) {
		String s="hiiiihelllooooooo";
		countDuplicateCharacter(s);
	}

}
