import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=in.nextLine();
		int space=0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				space++;
			}
		}
		System.out.println("Space: "+space);
		String[] words=new String[space+1];
		String word="";
		for(int i=0,j=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				words[j]=word;
				j++;
				word="";
			}else {
				word=word+str.charAt(i);
			}
			words[j]=word;
		}
		String revstr="";
		for(int i=words.length-1;i>=0;i--) {
			revstr=revstr+words[i]+" ";
		}
		System.out.println("String after reverse: "+revstr.trim());
	}

}
