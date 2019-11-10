import java.util.ArrayList;

public class BubbleSort {
	static ArrayList<Integer> sort(ArrayList<Integer> al){
		
		int len=al.size();
		System.out.println(len);
		for (int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(al.get(j)>al.get(j+1)) {
					int temp=al.get(j);
					al.set(j, al.get(j+1));
					al.set(j+1, temp);
					
				
				}
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(6);
		System.out.println(al);
		System.out.println(sort(al));

	}

}
