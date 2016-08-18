package practice;

public class PrintWithoutLoop {
	static void printNum(int n){
		if(n>0){
			printNum(n-1);
			System.out.println(n);
			
		}
	}
	public static void main(String[] args) {
		printNum(10);
		
	}

}
