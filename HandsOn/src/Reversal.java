import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter String");
		String str= in.nextLine();
		
		/*for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/
		String revstr="";
		String[] words=str.split("\\s");
		for(String word:words) {
			//System.out.println(word);
			String rev="";
			for(int i=word.length()-1;i>=0;i--) {
				rev=rev+word.charAt(i);
			}
			//System.out.println(rev);
			revstr=revstr+rev+" ";
		}
		System.out.println("String after rev: "+revstr.trim());
	}

}
