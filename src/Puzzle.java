import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no: person");
		Scanner in= new Scanner(System.in);
		int num=in.nextInt();
		
		for (int i=0;i<=num;i++) {
			int k=(int)Math.pow(2, i);
			if(k>num) {
				k=(int)Math.pow(2, i-1);
				int m=num-k;
				int alive=2*m+1;
				System.out.println("Last Person: "+alive);
				break;
			}
		}
		
	}
	
	

}
