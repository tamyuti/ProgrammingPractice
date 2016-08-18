//concat at middle of string
package practice;

public class StringConcat {
	public static void main(String[] args) {
		//using StringBuffer
		StringBuffer str=new StringBuffer("Webinars");
		str.insert(4, "My");
		System.out.println(str);
		
	}

}
