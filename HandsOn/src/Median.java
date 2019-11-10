import java.util.Arrays;
import java.util.Scanner;

public class Median {
	
	static double[] findMedian(double[] arr, int n) {
		Arrays.sort(arr);
		double med[]=new double[n];
		if(n==1) {
			med[0]=arr[0];
			return med;
		}
		int j=0;
		for(int i=0;i<n;i++) {
			int count=i+1;
			if(count==1) {
				med[j]=arr[0];
				j++;
			}
			else if(count%2!=0) {
				med[j]=arr[count/2];
				j++;
			}
			else {
				med[j]=(arr[(count-1)/2]+arr[count/2])/2;
				j++;
			}
		}
		return med;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=in.nextInt();
		System.out.println("Enter the array");
		double arr[]=new double[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextDouble();
		
		double med[]=new double[n];
		med=findMedian(arr,n);
		System.out.println("Median");
		for(int i=0;i<n;i++)
			System.out.print(med[i]+" ");
	}

}
