
public class SortGivenCount {
	static void sort(int[] arr, int count) {
		int len=arr.length;
		int n=count,i=0;
		while(i<len) {
			//System.out.println("i "+i);
			for(int j=i;j<count-1;j++) {
				//System.out.println("j "+j);
				int c=0;
				for (int k=i;k<count-c-1;k++) {
					//System.out.println("k "+k);
					if(arr[k]>arr[k+1]) {
						int temp=arr[k];
						arr[k]=arr[k+1];
						arr[k+1]=temp;
					}
				}c++;
				
			}
			count=count+n;
			//System.out.println("Count "+count);
			if(count<=len) {
				i=i+n;
				continue;
			}
		}
		
		for (int j=0;j<len;j++)
			System.out.print(arr[j]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,9,8,7,6,5,4,3,2,1};
		int count=3;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr,count);

	}

}
