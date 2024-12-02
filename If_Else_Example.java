package tutorial;
import java.util.Scanner;

public class If_Else_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Take input from user");
		
		
		int age = src.nextInt();
		src.close();
		
		if(age<18) {
			
			System.out.println("He cannot drive");
			
		}
		
		else {
			System.out.println("He can drive");
		}
		
		
	}

}
