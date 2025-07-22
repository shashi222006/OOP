package basic_j;
import java.util.Scanner;

public class Student_Details {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		  System.out.print("Enter student's name: ");
		  String name=inp.nextLine();
		  System.out.print("Enter roll number: ");
		  int roll=inp.nextInt();
		  System.out.print("Enter age: ");
		  int age=inp.nextInt();
		  System.out.print("Enter gender (M/F): ");
		  char gender=inp.next().charAt(0);
		  System.out.println("\nStudent Details");
	        System.out.printf("Name       : %s%n", name);
	        System.out.printf("Roll No    : %d%n", roll);
	        System.out.printf("Age        : %d years%n", age);
	        System.out.printf("Gender     : %c%n", gender);
	        
		  // TODO Auto-generated method stub

	}

}
