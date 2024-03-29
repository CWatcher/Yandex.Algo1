import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main( String[] args ) {
	new Main().solve();
}
Scanner sc = new Scanner( System.in );
int[] brick = scanInts( 3 );
int[] hole = scanInts( 2 );

int[] scanInts( int length ) {
	int[] a = new int[ length ];
	for ( int i = 0; i < a.length; i ++ )
		a[ i ] = sc.nextInt();
	Arrays.sort( a );
	return a;
}
void solve() {
	if ( brick[0] <= hole[0] && brick[1] <= hole[1] )
		System.out.println( "YES" );
	else
		System.out.println( "NO" );
}

}
/*
1 2 3
3 2
YES

4 2 3
3 2
YES

3 4 3
2 3
NO
*/
