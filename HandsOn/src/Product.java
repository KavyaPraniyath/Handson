import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner in =new Scanner(System.in);
		int num= in.nextInt();
		int rev=0;
		while(num>0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		System.out.println("Reversed number: "+rev);
		int r=0;
		while(rev>0) {
			r=rev%10;
			if(r==0) {
				
			}
		}
	}
	
}
