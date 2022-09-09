import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentExample {
Connection connect;
Statement State;
ResultSet resultset;
public StudentExample () {
	connect= MySqlConnection.getInstance();
	
}
public int insertstatement(Student St) {
	int result = 0;
	String query = "insert into Student values(" +St.getRollNo()+",'"+St.getName()+"','"+St.getSurName()+"',"+St.getFee()+")";
try {
	State= connect.createStatement();
	
	result= State.executeUpdate(query);
	
}
catch (SQLException E) {
	E.printStackTrace();}
return result;
}
public int deletedata(Student St) {
	int result=0;
	String query= "delete from Student where rollno="+ St.getRollNo();
	try {
		State= connect.createStatement();
		
		result= State.executeUpdate(query);
		
	}
	catch (SQLException E) {
		E.printStackTrace();}
	return result;
	}
	



public static void main(String[] args) {
	StudentExample se= new StudentExample();
	Student st= new Student();
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter your RollNo");
	st.setRollNo(sc.nextInt());
	sc.nextLine();
	
	System.out.println("Please enter your Name");
	st.setName(sc.nextLine());
	System.out.println("Please enter your SurName");
	st.setSurName(sc.nextLine());
	System.out.println("Please enter your Fee");
	st.setFee(sc.nextDouble());
	
sc.nextLine();
se.insertstatement(st);

}
}