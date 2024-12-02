package tutorial;
import java.util.Scanner;
public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks = src.nextInt();
		src.close();
		
		String grade = (marks >= 90) ? "A" :
			           (marks >= 80) ? "B" :
			           (marks >= 70) ? "C" :
			           (marks >= 50) ? "D" : "F";
		
		System.out.println("Your Grade is : " + grade);
			        	   
				

	}

}
