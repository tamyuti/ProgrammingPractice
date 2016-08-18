package practice;

public class IgnoreWhiteSpaces {
	public static void main(String[] args) {
		String s1="This is my book";
		//using replaceAll
		String s2=s1.replaceAll("\\s", "");//replace whitespace with ""//String s2=s1.replaceAll("\\s", "&"); replace whitespace with &
		System.out.println(s2);
		
		//without using replaceAll
		String[] s=s1.split("\\s");
		String withoutspace="";
		for(int i=0;i<s.length;i++){
			withoutspace=withoutspace+s[i];
		}
		System.out.print(withoutspace);
	}

}
