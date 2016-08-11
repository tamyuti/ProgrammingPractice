/*Output:koob si siht*/


package mock;

public class ReverseString {
public static void main(String[] args) {
	String s="this is book";
	String reverse="";
	char[] c=s.toCharArray();
	for(int i=c.length-1;i>=0;i--){
		reverse=reverse+c[i];
	}
	System.out.println(reverse);
	
}
}
