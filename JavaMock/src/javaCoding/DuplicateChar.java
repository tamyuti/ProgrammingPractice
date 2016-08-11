//5. Write a java program to find duplicate characters in a string
package javaCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
	public void findDuplicateChars(String str){
		String strLower=str.toLowerCase();
        char[] c = strLower.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(Character ch:c){
        	if(map.containsKey(ch)){
        		map.put(ch, map.get(ch)+1);
        	}
        	else{
        		map.put(ch, 1);
        	}
        }
        Set<Character> s=map.keySet();
        System.out.println("Duplicate characters in String: ");
        for(Character setchar:s){
        	if(map.get(setchar)>1){
        		System.out.println(setchar);
        	}
        }
	}
     
    public static void main(String a[]){
    	DuplicateChar dchar = new DuplicateChar();
        dchar.findDuplicateChars("WhiteboxLearning");
    }


}
