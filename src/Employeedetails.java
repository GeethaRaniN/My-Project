import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employeedetails {
Connection connect;
Statement State;
ResultSet resultset;
public Employeedetails () {
	connect= MySqlConnection.getInstance();
	
}
public int insertstatement(Employee Em) {
	int result = 0;
	String query = "insert into Employee values(" +Em.getID()+",'"+Em.getName()+"',"+Em.getSalary()+")";
try {
	State= connect.createStatement();
	
	result= State.executeUpdate(query);
	
}
catch (SQLException E) {
	E.printStackTrace();
	
}
return result;
}
public static void main(String[] args) {
	Employeedetails ed= new Employeedetails();
	Employee ee= new Employee();
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter your ID");
	ee.setID(sc.nextInt());
	sc.nextLine();
	
	System.out.println("Please enter your Name");
	ee.setName(sc.nextLine());
	System.out.println("Please enter your Salary");
	ee.setSalary(sc.nextDouble());
sc.nextLine();
ed.insertstatement(ee);

}
}
