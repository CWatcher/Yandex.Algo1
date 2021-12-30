import java.util.Scanner;

public class Main {
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ( c < 0 || ( a == 0 && b != c * c ) ) {
			System.out.println( "NO SOLUTION" );
			return;
		}
		if ( a == 0 ) {
			System.out.println( "MANY SOLUTIONS" );
			return;
		}
		if ( ( c * c - b ) % a != 0 ) {
			System.out.println( "NO SOLUTION" );
			return;
		}
		System.out.println( ( c * c - b ) / a );
	}
}