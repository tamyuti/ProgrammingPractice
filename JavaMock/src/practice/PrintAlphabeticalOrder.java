/*Write Java Program to print the name in alphabetical order:
Example: myname
Output: aemmny*/
package practice;

public class PrintAlphabeticalOrder {

	public static void main (String args[])
	{
		String s="Myname";
		String s1=s.toLowerCase();
		System.out.println("Original Content:" +s1);
		char[] c=s1.toCharArray();
		int ascii[]=new int[s.length()];
		for(int i=0;i<c.length;i++)
		{
			ascii[i]=c[i];
		}
		for(int j=0;j<(ascii.length);j++){
			for(int k=j+1;k<(ascii.length);k++){
				if(ascii[k]<ascii[j]){
					int temp=ascii[k];
					ascii[k]=ascii[j];
					ascii[j]=temp;
				}
			}
		}

		System.out.print("In alphabetical order:");
			for(int l=0;l<ascii.length;l++){
				char ch=(char)ascii[l];
				System.out.print(ch);
				
			}


		}

	
}








