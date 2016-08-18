/*1.How to sort array of Strings based on their length in Java? */
package javaCoding4;

public class SortString {
	
	public static void sortStringLength(String s[]){
		int stringLength=s.length;
		for(int i=0;i<stringLength;i++){
			for(int j=i+1;j<stringLength;j++){
				String temp;
				if(s[i].length()<s[j].length()){
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int k=0;k<s.length;k++){
			System.out.println(s[k]);
		}
	}
	
	public static void main(String[] args) {
		String[] s={"Java","C","Java is programming language","Javascript"};
		sortStringLength(s);
	}

}
