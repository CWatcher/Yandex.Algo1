import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	static Integer[] scanIntegers( int length ) {
		Scanner sc = new Scanner( System.in );
		Integer[] a = new Integer[ length ];
		for ( int i = 0; i < a.length; i ++ )
			a[ i ] = sc.nextInt();
		return a;
	}
	public static void main( String[] args ) {
		Integer[] brick = scanIntegers( 3 );
		Integer[] hole = scanIntegers( 2 );
		Arrays.sort( hole, Collections.reverseOrder() );
		Arrays.sort( brick, Collections.reverseOrder() );
		if ( brick[0] <= hole[0] && brick[1] <= hole[1] )
			System.out.println( "YES");
		else
			System.out.println( "NO");
	}
}
