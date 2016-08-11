package mock;

public class RemoveHTML {
public static void main(String[] args) {
	String s = "<B>I don't want to bold</B>";
    System.out.println(s);
    s = s.replaceAll("\\<.*?\\>", "");
    System.out.println(s);
}
}
