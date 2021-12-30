import java.util.Scanner;

public class Main {
	static String extractNum( String s ) {
		s = s.replaceAll("\\D+", "");
		if ( s.length() == 7 )
			return "495" + s;
		return s.substring(1);
	}

	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String num = extractNum(sc.next());
		while ( sc.hasNext() ) {
			if ( num.equals( extractNum(sc.next()) ) )
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
