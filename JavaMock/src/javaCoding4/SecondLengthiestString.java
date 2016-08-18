package javaCoding4;

public class SecondLengthiestString {
	public static void stringLength(String str[]){
		int stringLength=str.length;
		for(int i=0;i<stringLength;i++){
			for(int j=i+1;j<stringLength;j++){
				String temp;
				if(str[i].length()<str[j].length()){
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("Second Lengthiest String:" +str[1]);
	}


	public static void main(String[] args) {
		String str[]={"Java","C","C++","Javascript"};
		stringLength(str);

	}

}
