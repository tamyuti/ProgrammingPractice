//4.Write a java program to find the duplicate words(irrespective of case) and their number of occurrences in a string?

package javaCoding;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateWords {
	public static void findDuplicateWords(String s){
		String ls=s.toLowerCase();
		String[] splitString=ls.split("\\s");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String ch:splitString){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		Set<Map.Entry<String,Integer>> uniqueSet=map.entrySet();
		System.out.println("Duplicate words in String: ");
		for(Map.Entry<String,Integer> entry:uniqueSet){
			if(entry.getValue()>1){
				System.out.println(entry.getKey() +"=" +entry.getValue());
			}
		}
		
		}


	public static void main(String[] args) {
		String s="Java is a programming language Java is is object oriented language";
		findDuplicateWords(s);	
	}
}
