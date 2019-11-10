import java.util.Scanner;

public class DeleteNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the element to be delete");
		int ele=in.nextInt();
		
		//mothod 1 lat element replace the given elememt
		/*for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				arr[i]=arr[n-1];
				n--;
				i--;
			}
		}*/
		
		for (int i=0;i<n;i++) {
			if(arr[i]==ele) {
				for(int j=i+1;j<n;j++) {
					arr[i]=arr[j];
				}
				i--;
				n--;
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");

	}

}
