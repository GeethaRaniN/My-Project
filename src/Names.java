import java.util.ArrayList;

public class Names {
String[] s= {"Geetha", "Rani", "Ammu"};
int randNum = (int)(Math.random()*2);
String chosenName = s[randNum];
public static void main(String[]args) {
	Names N=new Names();
	ArrayList<String> Name = new ArrayList<>();
	Name.add(N.chosenName);
	System.out.println(Name);
	
}
		}
