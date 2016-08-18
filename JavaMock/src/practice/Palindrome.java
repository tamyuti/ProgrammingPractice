package practice;

public class Palindrome {
	public static void main(String[] args) {
		String original="JAVA";
		String reverse="";
		char[] c=original.toCharArray();
		
		int len=(c.length-1);
		for(int i=len;i>=0;i--){
			reverse=reverse+c[i];
		}
		if(original.equals(reverse)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}

}
