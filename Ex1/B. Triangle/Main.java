import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SortedSet<Integer> sides = new TreeSet<>();
		for (int i = 0; i < 3; i++)
			sides.add(sc.nextInt());
		if (sides.last() > sides.headSet(sides.last()).stream().mapToInt(x -> x).sum())
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
