package practice;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]={25,2,3,18,9,36};
		for(int i=0;i<=arr.length;i++){
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[j]<arr[i]){
					int temp;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}

			}
		}
		for(int k=0;k<=arr.length-1;k++){
			System.out.println(arr[k]);
		}
	}

}
