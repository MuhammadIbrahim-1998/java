package tutorial;
import java.util.Scanner;

public class Boolean_and_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src =  new Scanner(System.in) ;
		System.out.println("Enter the age : " );
		
		int age = src.nextInt();
		
		System.out.println("The age entered is : " + age);
		src.close();
		
		boolean hasID = true ;
		
		if(age>=18 && hasID) {
			
			System.out.println("You can drive the car and go for picnic");
			
			}
		
		else {
			System.out.println("You cannot drive the car and go for picnic");
		}
		
		
		
		
		
		
		
		

	}

}
