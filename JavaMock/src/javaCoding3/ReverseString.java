/*1. Reverse a string.
 * input : java is easy
 * ouput: ysae si avaj*/
package javaCoding3;

public class ReverseString {
	public static String revString1(String s){
		String reverse="";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			reverse=reverse+c[i];
		}
		return reverse;
	}
	
	public static String revString2(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String s="java is easy";
		String reverse=revString1(s);
		System.out.println(reverse);
		System.out.println(revString2(s));
	}
}
