import java.util.Scanner;

public class DupArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter size:");
		int size=in.nextInt();
		System.out.println("Enter Array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		
		System.out.println("Elements are: ");
		for (int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[size-1];
					j--;
					size--;
				}
			}
			count=size;
		}
		System.out.println("After sort");
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
		}
	}

}
