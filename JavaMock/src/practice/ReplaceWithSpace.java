/*replace %20 with ' '
 input:www.space%20.com
 Output:www.space .com*/

package practice;

public class ReplaceWithSpace {
	public static void main(String[] args) {
		String input="www.space%20.com";
		String replace=input.replaceAll("%20", " ");
		System.out.println(replace);
	}

}
