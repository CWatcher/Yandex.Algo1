import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Boolean, Integer> temp = new HashMap<>();
		temp.put(false, sc.nextInt());  // troom
		temp.put(true, sc.nextInt());   // tcond
		String mode = sc.next();
		System.out.println(temp.get(
			     mode.equals("auto")
			|| ( mode.equals("freeze") && temp.get(true) < temp.get(false) )
			|| ( mode.equals("heat")   && temp.get(true) > temp.get(false) )
		));
	}
}
