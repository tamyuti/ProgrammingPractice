package mock;

public class StringSpaceRemove {
	public static void main(String[] args) {
		String s="String      with  multiple   spaces";
		String withoutSpace=s.replaceAll("\\s+", " ").trim();
		System.out.println(withoutSpace);
		
		

	}

}
