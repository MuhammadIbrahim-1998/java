package tutorial;
import java.util.Scanner;
public class Three_inputs_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Take three inputs from user  ");
		
		System.out.println("Enter the First Number :   ");
		int numb1 = src.nextInt();
		
		System.out.println("Enter the Second Number :   ");
		int numb2 = src.nextInt();
		
		System.out.println("Enter the Second Number :   ");
		int numb3 = src.nextInt();
		
		int sum = numb1+numb2+numb3;
		
		System.out.println("The sum of three inputs is =  " + sum    );
	    src.close();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
