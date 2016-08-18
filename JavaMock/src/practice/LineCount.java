package practice;

public class LineCount {
	public static int getLineCount(String text){
        
        return text.split("\\n").length;
    }
     
    public static void main(String a[]){
     
        String str = "line1\nline2\nline3\rline4";  
        int count = getLineCount(str);
        System.out.println("line count: "+count);
    }


}
