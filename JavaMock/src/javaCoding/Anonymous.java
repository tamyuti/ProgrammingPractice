package javaCoding;

public class Anonymous {
		public static int mulMethod(int[] n){
			int mul=1;;
			for(int i:n){
				mul=mul*i;
			}
			return mul;
		}
	    public static void main(String[] args) {
	       
	       int mul=mulMethod(new int[]{2,3,5,1});
	       System.out.println("Product is: " +mul);
	    }
	    
	   


	

}
