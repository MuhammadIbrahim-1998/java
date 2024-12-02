package tutorial;
import java.util.Scanner;

public class Else_If_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		
		
		
		System.out.println("Enter the marks of Noman : " );
		int noman = src.nextInt();
		System.out.println(" The marks of Noman are :  " + noman);
		System.out.println("The grade of Noman is :  "  + getGrade(noman));
		
		
		
		System.out.println("Enter the marks of Fahad : " );
		int fahad = src.nextInt();
		System.out.println("The marks of Fahad are : " + fahad );
		System.out.println("The grade of Fahad is  : " + getGrade(fahad) );
	
		
		
		System.out.println("Enter the marks of Saad : " );
		int saad = src.nextInt();
		System.out.println("The marks of Saad are  : " + saad);
		System.out.println("The grade of Saad is : " + getGrade(saad));
		
		
		System.out.println("Enter the marks of Ibrahim : " );
		int ibrahim = src.nextInt();
		System.out.println("The marks of Ibrahim are : " + ibrahim );
		System.out.println("The Grade of Ibrahim is  : " + getGrade(ibrahim) );
		
		
		src.close();
		
		}
	
	public static String getGrade(int marks) {
		
		if(marks >= 95) {
			
			return " A+ ";
		}
		
		else if (marks >= 90) {
			
			return " A ";
		}
		
       else if (marks >= 80) {
			
			return " B ";
		}
		
       else if (marks >= 70) {
			
			return " C ";
		}
		
       else if (marks >= 60) {
			
			return " C ";
		}
		
       else if (marks >= 50) {
			
			return " D ";
		}
		
       else   {
			
			return " Fail ";
		}
		
		
		
		
		
		
		
		
	
	}
	
} 
