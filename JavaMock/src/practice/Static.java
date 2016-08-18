package practice;

public class Static {
	public static String staticVar = "You can access me!!!";
	private String privateVar = "You cannot access me";

	public static class ChildClass{

		public void myMethod(){
		
			System.out.println(staticVar);
			
		}
	}

	public static void main(String a[]){
		Static.ChildClass cc = new Static.ChildClass();
		cc.myMethod();
	}

}


