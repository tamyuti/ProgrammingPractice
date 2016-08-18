package practice;

public class ReverseEachString {
	public static void main(String[] args) {
		String s="This is an example";
		String[] s1=s.split("\\s");
		for(int i=0;i<s1.length;i++){
			String word=s1[i];
			String reverse="";
			for(int j=word.length()-1;j>=0;j--){
				reverse=reverse+word.charAt(j);
				
			}
			System.out.print(reverse);
			System.out.print(" ");
		}
	}

}
