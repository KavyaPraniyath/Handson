import java.util.Scanner;

public class SuperDigit {
	static int sumDigit(int m) {
		int sum=0, count=0;
		while(m>0) {
			sum=sum+m%10;
			count++;
			m=m/10;
		}
		return sum*count;
	}

	static int superDigit(int n) {
		if(n<10)
			return n;
		return superDigit(sumDigit(n));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		System.out.println(str);
		int num=Integer.parseInt(str);
		int len=str.length();
		int n=superDigit(num);
		System.out.println("Sum "+n);
	}

}
