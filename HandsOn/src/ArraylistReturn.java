import java.util.ArrayList;

public class ArraylistReturn {

	public ArrayList<Integer> update(ArrayList<Integer> al){
		al.set(0, 9);
		return al;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(6);
		al.add(9);
		System.out.println(al);
		ArrayList<Integer> al1= new ArrayList<Integer>();
		ArraylistReturn ar= new ArraylistReturn();
		al1=ar.update(al);
		System.out.println(al1);
	}

}
