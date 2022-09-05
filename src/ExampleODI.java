
//public class ExampleODI1 {

		import java.util.InputMismatchException;
		import java.util.Scanner;

		public class ExampleODI {

		  private static final String WEATHER_STATUS_GOOD = "Good";
		  private static final String WEATHER_STATUS_BAD = "Bad";
		  private static int NO_OF_TEAMS = 2;
		  private static int NO_OF_OVERS = 50;

		  public static void main(String[] args) {

		    Scanner scanner = new Scanner(System.in);
		    String team1 = " Geetha" ;
		    String team2 = " Kavitha ";

		    do {
		      System.out.println("Please enter the name for 1st Team");
		      team1 = scanner.nextLine();
		    } while (team1 == "Geetha" || team1.isEmpty());

		    do {
		      System.out.println("Please enter the name for 2nd Team");
		      team2 = scanner.nextLine();
		      if (team1.equalsIgnoreCase(team2)) {
		        System.out.println("Please enter another name for 2nd Team since team 1 also has the same name");
		        team2 = "Kavitha";
		      }
		    } while (team2 == "Kavitha" || team2.isEmpty());

		    team1 = team1.toUpperCase();
		    team2 = team2.toUpperCase();

		    String weatherStatus = getWeatherStatus(scanner);
		    int noOfOvers = NO_OF_OVERS;

		    if (WEATHER_STATUS_BAD.equalsIgnoreCase(weatherStatus)) {
		      noOfOvers = handleWhenWeatherIsBad(scanner);
		    }

		    if (noOfOvers == 0) {
		      return;
		    }

		    int team1Score = getTeamScore(team1, noOfOvers, scanner);
		    int team2Score = getTeamScore(team2, noOfOvers, scanner);

		    if (team1Score == team2Score) {
		      System.out.println("Match Draw");
		    } else if (team1Score > team2Score) {
		      System.out.println("Team " + team1 + " Won the Match with " + (team1Score - team2Score) + " Runs");
		    } else {
		      System.out.println("Team " + team2 + " Won the Match with " + (team2Score - team1Score) + " Runs");
		    }

		    scanner.close();
		  }

		  private static String getWeatherStatus(Scanner scanner) {
		    boolean validWeatherStatus = false;
		    String weatherStatus = null;
		    do {
		      System.out.println("How's the weather? Good/Bad");
		      weatherStatus = scanner.nextLine();
		      if (isValidWeatherInput(weatherStatus)) {
		        validWeatherStatus = true;
		      } else {
		        System.out.println("Please enter valid input");
		      }
		    } while (!validWeatherStatus);
		    return weatherStatus;
		  }

		  private static boolean isValidWeatherInput(String weatherStatus) {
		      if (WEATHER_STATUS_GOOD.equalsIgnoreCase(weatherStatus) || WEATHER_STATUS_BAD.equalsIgnoreCase(weatherStatus)) {
		        return true;
		    }
		    return false;
		  }

		  /*
		    Return No Of Overs can match go
		   */
		  private static int handleWhenWeatherIsBad(Scanner scanner) {
		    int noOfHours = 0;
		    int noOfOvers = NO_OF_OVERS;

		    System.out.println("Please provide no. of hours (1,2,3) bad weather condition");

		    noOfHours = getValidIntegerInput(scanner);

		    if (noOfHours >= 3) {
		      System.out.println("Match was cancelled because of bad weather");
		      noOfOvers = 0;
		    } else {
		      noOfOvers = noOfOvers - (noOfHours * 10);
		    }
		    return noOfOvers;
		  }

		  private static int getTeamScore(String team, int noOfOvers, Scanner scanner) {
		    System.out.println("Please enter the score for Team " + team + " for " + noOfOvers + " Overs");
		    return getValidIntegerInput(scanner);
		  }

		  private static int getValidIntegerInput(Scanner scanner) {
		   int input = -1;
		    do {
		      try {
		        input = scanner.nextInt();
		        if (input < 0) {
		          System.out.println("Please provide input in positive eg. 1,2,3");
		          scanner.nextLine();
		        }
		      } catch (InputMismatchException e) {
		        System.out.println("Please provide input in numeric format eg. 1,2,3");
		        //Just cleanup the existing input
		        scanner.nextLine();
		      }
		    } while (input < 0);
		    return input;
		  }
		}