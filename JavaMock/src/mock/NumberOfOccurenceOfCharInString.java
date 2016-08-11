package mock;

public class NumberOfOccurenceOfCharInString {
	public static void main(String[] args) {
		int count=0;
		String s="Hello! I am Java.I love Java";
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++){
			if(c[i]=='a'){
				count++;
			}
		}
		System.out.println("Number of a in String: "+count);
		
	}
}
