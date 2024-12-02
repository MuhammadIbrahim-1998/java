package tutorial;
import java.util.Scanner;
public class Area_of_rectangle_inputs_from_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		
		System.out.println(" To calculate Area of rectangle First Take inputs from User :   ");
		System.out.println("Length of Rectangle = ");
		int Length = src.nextInt();
		
		System.out.println("Width of rectangle = ");
		int Width = src.nextInt();
		
		
		int area = Length * Width ;
		
		System.out.println("Area of rectangle =    " + area+"m2");
		
		
		src.close();

	}

}
