import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Main strig");
		String str= in.nextLine();
		
		System.out.println("Sub string");
		String sub=in.nextLine();
		/*if(str.contains(sub))
			System.out.println("Find sub string");*/
		int count=0;
		for(int i=0;i<str.length();i++) {
			int j;
			for(j=0;j<sub.length();j++) {
				if(str.charAt(i+j)!=sub.charAt(j)) {
					break;
				}
			}
			if(j==sub.length()) {
				System.out.println("string found");
				count++;
			}
		}
		

	}

}
