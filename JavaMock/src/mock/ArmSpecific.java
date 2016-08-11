//print armstrong between 1 to 1000
package mock;

public class ArmSpecific {
	
	public static void main(String[] args) {
		int a,n,sum=0;
		for(int i=1;i<=1000;i++){
			n=i;
			while(n>0){
				a=n%10;
				n=n/10;
				sum=sum+a*a*a;
			}
			if(sum==i){
				System.out.println(i+" ");
			}
			sum=0;
			
		}
	}

}
