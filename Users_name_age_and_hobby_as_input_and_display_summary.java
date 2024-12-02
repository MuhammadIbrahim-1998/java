package tutorial;
import java.util.Scanner;
public class Users_name_age_and_hobby_as_input_and_display_summary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Name :  ");
		String name = src.nextLine();
		
		System.out.println("Age : ");
		int age = src.nextInt();
		
		src.nextLine();
		
		System.out.println("Hobby : ");
		String hobby = src.nextLine();
		
		
		System.out.println("Hi, My name is " + name +"." + "I am " + age + "years old .");
		System.out.println( hobby + " is my hobby. "  );
		
		src.close();
		
		
		
		
		

	}

}
