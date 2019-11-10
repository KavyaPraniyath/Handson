
public class HeapSort {

	public void heapify(int arr[],int size, int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<size && arr[l]>arr[i])
			largest=l;
		
		if(r<size && arr[r]>arr[largest])
			largest=r;
		
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,size,largest);
		}
	}
	public void heapSort(int arr[], int size) {
		
		for(int i=size/2-1;i>=0;i--) {
			heapify(arr,size,i);
		}
		
		
		for(int i=size-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,i,0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,11,13,5,6,7};
		//System.out.println(Math.floor(3/2));
		HeapSort h= new HeapSort();
		h.heapSort(arr,arr.length);
		System.out.println("Heap");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");
	}

}
