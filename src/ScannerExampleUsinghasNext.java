import java.util.Scanner;

public class ScannerExampleUsinghasNext {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int sum = 0;
	    while (input.hasNextInt()) {
	      int number = input.nextInt();
	      sum += number;
	    }
	    System.out.println("Sum: " + sum);
	  }
	}