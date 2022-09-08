import java.util.Scanner;

public class ScannerdifferentDataTypesExample {

	public static void main(String[] args) {
		System.out.println("Enter your details....");
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please enter your name: ");
	    String employee_name = input.nextLine();
	    System.out.println("Name- " + employee_name);
	    System.out.println("Enter your age: ");
	    int age = input.nextInt();
	    System.out.println("Age- " + age);
	    System.out.println("Enter your salary: ");
	    double salary = input.nextDouble();
	    System.out.println("Salary- " + salary);
	    input.close();
	  }
	}