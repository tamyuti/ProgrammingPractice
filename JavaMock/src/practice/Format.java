/*5 5 5 5 5
 *4 5 5 5 5
 *3 4 5 5 5
 *2 3 4 5 5
 *1 2 3 4 5*/
package practice;

public class Format {
	public static void main(String[] args) {
	 for(int i=4;i>=0;i--){
		 for(int j=1;j<=5;j++){
			 if(i+j>5){
				 System.out.print("5");
				 System.out.print(" ");
			 }
			 else{
				 System.out.print(j+i);
				 System.out.print(" ");
			 } 
		 }
		 System.out.print("\n");
	 }
	}

}
