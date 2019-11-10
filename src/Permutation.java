import java.awt.print.Printable;
import java.util.Scanner;

public class Permutation {
	
	static void printPermutation(String str, String ans) {
		if(str.length()==0) {
			System.out.println("ans= "+ans+ " ");
			System.out.println("-----------------");
			return;
		}
		for(int i=0;i<str.length();i++) {
			System.out.println("when i= "+i+"str= "+str);
			char ch=str.charAt(i);
			System.out.println("ch= "+ch);
			String ros=str.substring(0, i)+str.substring(i+1);
			System.out.println("ros= "+ros+" "+ "partial= "+(ans+ch));
			printPermutation(ros, ans+ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=in.nextLine();
		//System.out.println(str.substring(0, 2));
		printPermutation(str, "");
	}

}
