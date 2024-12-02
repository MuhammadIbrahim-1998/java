package tutorial;
import java.util.Scanner;
public class Print_full_name_from_first_and_last_name_as_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner src = new Scanner(System.in);
      
      System.out.println("Enter the First Name : ");
      String First_Name = src.nextLine();
      
      System.out.println("Enter your Last Name :   ");
      String Last_Name = src.nextLine();
      
      System.out.println("Your Full Name is : " + First_Name + Last_Name);
      src.close();
       
	}

}
