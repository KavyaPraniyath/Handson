import java.util.Scanner;

public class Test1 implements Interef1{
	
	public void run() {
		//Interef1.run();
		System.out.println("Inside Test1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Test1 t= new Test1();
			Interef1.run();
			t.run();
	}

}



