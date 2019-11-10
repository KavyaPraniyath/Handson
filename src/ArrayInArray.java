
// This is a sample program

public class ArrayInArray {
	static boolean isPresent(int[] arr, int[] arr1) {
		int len1=arr.length;
		int len2=arr1.length;
		int count=0;
		for (int i=0;i<len2;i++) {
			for(int j=0;j<len1;j++) {
				if(arr1[i]==arr[j]) {
					count++;
					break;
				}
			}	
		}
		if(count==len2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,2,8,7};
		int[] arr1= {1,4,6};
		boolean result=isPresent(arr,arr1);
		if(result) {
			System.out.println("array contains");
			
		}
		else
			System.out.println("no array");
			
	}

}
