import java.util.Scanner;

public class Main {

	public static int calcDetails( int A, int B, int C ) {
		int z = A / B;
		int d = B / C;
		int r = z * d;
		if ( r == 0 )
			return 0;
		return r + calcDetails( A % B + B % C * z, B, C );
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		System.out.println( calcDetails(N, M, K) );
	}

}
