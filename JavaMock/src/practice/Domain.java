package mock;

public class Domain {
	public static void main(String[] args) {
		/*Using split method
		String str = "admin@gmail.com";
		String[] temp;
		String delimiter = "@";
		temp = str.split(delimiter);
		System.out.println(temp[0]);*/
		
		//Without using split method
		String str = "admin@gmail.com";
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='@'){
				break;
			}
		System.out.print(c[i]);
		}
		
	}

}
