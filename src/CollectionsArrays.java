import java.util.*;

public class CollectionsArrays {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("AA");
		names.add("BB");
		names.add("CC");
		names.add("BB");

		if (names.remove("BB")) {
		names.remove("DD");
		}

		System.out.println(names);
	}
}