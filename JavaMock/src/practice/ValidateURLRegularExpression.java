package mock;

public class ValidateURLRegularExpression {
	public static void main(String[] args) {
	String URL="https://www.google.com/";
	String urlPattern = "^http(s{0,1})://[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
	System.out.println(URL.matches(urlPattern));
	}
	

}
