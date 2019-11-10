
public class BinarySearch {
	
	static int search(int[] arr,int num, int l, int r) {
		
		if(l<r) {
			int mid= r-l/2;
			if(arr[mid]==num)
				return mid;
			else if(arr[mid]>num)
				return search(arr,num,l,mid-1);
			else if (arr[mid]<num)
				return search(arr,num,mid+1,r);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7,8};
		int num=9;
		int l=0;
		int r=arr.length-1;
		int result=search(arr,num,l,r);
		if(result==-1)
			System.out.println("Item not present");
		else
			System.out.println("Item present");
	}

}
