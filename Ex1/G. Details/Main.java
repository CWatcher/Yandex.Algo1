import java.util.Scanner;

public class Main {
	public static int calcDetails( int A, int B, int C ) {
		int z = A / B;
		int d = B / C * z;
		if ( d == 0 )
			return 0;
		return d + calcDetails( A % B + B % C * z, B, C );
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		System.out.println( calcDetails(sc.nextInt(), sc.nextInt(), sc.nextInt()) );
	}
}
