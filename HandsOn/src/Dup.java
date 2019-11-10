import java.util.ArrayList;
import java.util.Scanner;

public class Dup {

	public static void main(String[] args) {
		ArrayList<Integer> arlist= new ArrayList<Integer>();
		arlist.add(6);
		arlist.add(7);
		arlist.add(6);
		arlist.add(6);
		arlist.add(7);
		arlist.add(9);
		int size=arlist.size();
		int act_size=arlist.size();
				int count=0;
				for(int i=0;i<size;i++) {
					for(int j=i+1;j<size;j++) {
						if(arlist.get(i)==arlist.get(j)) {
							arlist.set(j, arlist.size()-1);
							j--;
							size--;
						}
					}
					count=size;
				}
				System.out.println(act_size);
				System.out.println(count);
				System.out.println(act_size-count);
	}



}
