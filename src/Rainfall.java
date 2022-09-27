import java.util.Scanner;
import java.text.DecimalFormat;
public class Rainfall
{
public static void main(String [] args)
{
// Declare constant to store size of both arrays
final int NUM_MONTH = 12;
Scanner scan = new Scanner(System.in);
// Declare array to store the rainfall data
double [] rain = new double [NUM_MONTH];
// Declare array to store the name of each month
// Use an initialization list here
String [] month = {"January","February","March","April","May","June",
"July","August","September","Octomber","November","December"};
// Get the rainfall for each month.
for (int i = 0; i < NUM_MONTH; i++)
{
System.out.print("Enter the rainfall(in inches) for "+ month[i] + ": ");
rain[i] = scan.nextDouble();
// Validate the input
while (rain[i]<0)
{
System.out.println("Error: Enter positive integer value.");
System.out.print("Enter the rainfall (in inches) for "+ month[i] + ": ");
rain[i] = scan.nextDouble();
}
}
// Calculate the running sum
double total = 0;
for (int i=0;i<NUM_MONTH;i++)
total+=rain[i];
// Format output to 2 decimal places
DecimalFormat fmt = new DecimalFormat("0.##");
// Display the total rainfall
System.out.println("Total rain fall "+fmt.format(total));
double average;
// Calculate the average
average=total/NUM_MONTH;
// Display the average
System.out.printf("Average rain fall : %.2f\n",average);
// Now determine the largest amount of rainfall
double largest = rain[0];
// holds largest value
// assume largest value is in first position
int index = 0;
for (int i=1;i<NUM_MONTH;i++)
{
if (rain[i]>largest)
{
//update largest value
largest = rain[i];
index = i;
}
}
//print largest rain fall and index of largest rain fall
System.out.printf("Largest rain fall %.2f in the month of %s\n",largest,month[index]);
/*Finding smallest rain fall*/
//Assume first element in rain array is smallest
double smallest = rain[0];
index = 0; // reset
for (int i=1;i<NUM_MONTH;i++)
{
if (rain[i]<smallest)
{
//update the smallest value
smallest = rain[i];
index =i;
}
}
//print largest rain fall and index of largest rain fall
System.out.printf("Smallest rain fall %.2f in the month of %s.",smallest,month[index]);
}
}