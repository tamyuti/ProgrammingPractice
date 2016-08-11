package javaCoding;

public class Array {
	public static void singleDimensional(){
		int a[]={5,25,15,0,1};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static void multiDimensionalArray(){
		int b[][]={{2,5},{3,10},{8,20}};
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length-1;j++){
				System.out.print(b[i][j] +" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		singleDimensional();
		multiDimensionalArray();
	}
}
