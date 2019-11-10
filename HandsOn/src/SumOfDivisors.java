import java.util.Scanner;

public class SumOfDivisors {

	static int properDivisor(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=in.nextInt();
		int sum=properDivisor(num);
		System.out.println("Sum "+sum);
	}

}
