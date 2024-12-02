package tutorial;
import java.util.Scanner;
public class Input_and_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter your name :  ");
		
		String name = src.nextLine();
		
		System.out.println("Enter your age :  ");
		
		int age = src.nextInt();
		
		System.out.println("Enter your height :  ");
		
		Double height = src.nextDouble();
		
		
		System.out.println("Your name is " + name +"." + "You are " + age + "years old" +"." + "Your height is " 
		
		                    + height + " feet"+".");
		
		src.close();
		
		
		
		
		
		
	
}
	
}
	
