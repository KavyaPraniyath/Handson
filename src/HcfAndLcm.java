import java.util.Scanner;

public class HcfAndLcm {

	static int findGCD(int num1, int num2) {
		
		if(num1==0) 
			return num2;
		if(num2==0)
			return num1;
		
		return findGCD(num2,num1%num2);
	}
	
	static int findGCDN(int[] arr, int n) {
		if(n<=1)
			return arr[0];
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			temp=findGCD(temp,arr[i]);
			
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner (System.in);
		//System.out.println("Enter the nums");
		//int num1=in.nextInt();
		//int num2=in.nextInt();
		int GCD=0; int LCM=0;
		/*for (int i=1;i<=num1 && i<=num2;i++) {
			if((num1%i==0)&&(num2%i==0)) {
				GCD=i;
			}
		}
		System.out.println("GCD "+GCD);
		
		LCM=num1*num2/GCD;
		System.out.println("LCM "+LCM);*/
		//GCD=findGCD(num1,num2);
		//System.out.println("GCD "+GCD);
		System.out.println("Enter the count ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		GCD=findGCDN(arr,n);
		System.out.println("GCD "+GCD);
	}

}
