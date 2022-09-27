import java.util.Scanner;
import java.text.*;
public class AverageRainfall {

	public static void main(String[] args) {
		
		int years;												// Variable to hold the amount of years
		
		final int MONTHS = 12; 									// Constant to hold the amount of months in a year
		
		int totalMonths = 0;									// Months accumulator variable
		
		double monthlyRain;										// Holds the amount of rain in inches for each month
		
		double totalRainfall = 0;								// Holds the total rainfall
		
		NumberFormat df = DecimalFormat.getInstance();		    // Decimal formating
		df.setMaximumFractionDigits(2);			
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the number of years
		System.out.println("Enter the number of years: ");
		years = input.nextInt();
		
		System.out.println("Enter the rainfall amount for each month ");
		// Construct for-loop for each year
		for(int i=0; i < years; i++){
			for(int j=1; j<MONTHS+1; j++){
				switch(j){
				case 1:
					System.out.print("January: ");
					break;
				case 2:
					System.out.print("February: ");
					break;
				case 3:
					System.out.print("March: ");
					break;
				case 4: 
					System.out.print("April: ");
					break;
				case 5:
					System.out.print("May: ");
					break;
				case 6:
					System.out.print("June: ");
					break;
				case 7:
					System.out.print("July: ");
					break;
				case 8:
					System.out.print("August: ");
					break;
				case 9:
					System.out.print("September: ");
					break;
				case 10:
					System.out.print("October: ");
					break;
				case 11:
					System.out.print("November: ");
					break;
				case 12:
					System.out.print("December: ");
				}
				monthlyRain = input.nextDouble();
				totalRainfall += monthlyRain;
			}
			totalMonths += MONTHS;
		}
		
		double avgRainfall = totalRainfall/totalMonths;		// Holds the average rainfall
		
		// Newline1
		System.out.println("");
		// Display rainfall data
		System.out.println("Total Months: " + totalMonths + "\nTotal Rainfall: " + df.format(totalRainfall) + " inches" +
				"\nAverage Rainfall: " + df.format(avgRainfall) + " inches");
	}
}