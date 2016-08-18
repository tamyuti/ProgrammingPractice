/*3. Reverse only words in a string.
input: java is easy
output: avaj si ysae*/

package javaCoding3;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachWord {
	
	public static void rev1(String s){
		String[] words=s.split(" ");
		String reverseString="";
		String reverseWord = "";
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			for (int j = word.length()-1; j >= 0; j--) 
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			if(i==words.length-1){
				reverseString = reverseString + reverseWord; 
			}
			else{
				reverseString= reverseString+ reverseWord+" ";
			}
		}
		System.out.println(reverseString);
	}
	
	public static void rev2(String s){
		char[] c=s.toCharArray();
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<c.length;i++){
			if(c[i]!=' '){
				list.add(c[i]);
			}
			else{
				for(int j=list.size()-1;j>=0;j--){
					System.out.print(list.get(j));	
				}
				System.out.print(" ");
				list.clear();
			}
			
		}
		for(int j=list.size()-1;j>=0;j--)
				System.out.print(list.get(j));
	}
	public static void main(String[] args) {
		String s="java is easy";
		rev1(s);
		rev2(s);
	}



}
