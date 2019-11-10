import java.util.Scanner;

public class PrimeCheck {

	static boolean isPrime(int num) {
		//boolean flag=false;
		if(num==0 || num==1)
			return false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=in.nextInt();
		if(isPrime(num)) {
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");

	}

}
