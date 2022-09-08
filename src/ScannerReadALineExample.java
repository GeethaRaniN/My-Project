import java.util.Scanner;

public class ScannerReadALineExample {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter your name: ");
	    String name = input.nextLine();
	    System.out.println("My name is " + name);
	    input.close();
	  }
	}