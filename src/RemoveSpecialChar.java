
public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str="@$*J!av&a@";
		String plain=str.replaceAll("[^a-zA-z0-9]","");
		System.out.println(plain);
		
	}

}