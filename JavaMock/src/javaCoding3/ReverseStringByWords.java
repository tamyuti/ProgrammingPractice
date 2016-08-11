/*2. Reverse string by words
	input : java is easy
	output: easy is java*/
	
package javaCoding3;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringByWords {
	
	public static void rev1(String s){
		String[] splittedWords=s.split(" ");
		int Stringlength=(splittedWords.length)-1;
		for(int i=Stringlength;i>=0;i--){
		System.out.print(splittedWords[i]);
		System.out.print(" ");
		}
		
	}
	public static void rev2(String s){
		//reverse the string
		String reverse="";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			reverse=reverse+c[i];
		}
		//convert reverse into reverseArray
		char[] revArray=reverse.toCharArray();
		List<Character> list=new ArrayList<Character>();
		//add in list
		for(int j=0;j<revArray.length;j++){
			if(revArray[j]!=' '){
				list.add(revArray[j]);
				
			}
			//reverse from list
			else{
				for(int i=list.size()-1;i>=0;i--){
					System.out.print(list.get(i));	
				}
				System.out.print(" ");
				list.clear();
			}
		}
		for(int i=list.size()-1;i>=0;i--)
		System.out.print(list.get(i));
	}
	
	
	
	public static void main(String[] args) {
		String s="java is easy";
		rev1(s);
		rev2(s);
	}

}
