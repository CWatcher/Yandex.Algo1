import java.util.Scanner;

public class Main {
	static	int Smin = Integer.MAX_VALUE;
	static int[] Tmin = { Integer.MAX_VALUE, Integer.MAX_VALUE };

	static void setMin(int a, int b) {
		int S = a * b;
		if ( S < Smin ) {
			Smin = S;
			Tmin[0] = a;
			Tmin[1] = b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int[] r1 = { sc.nextInt(), sc.nextInt() };
		int[] r2 = { sc.nextInt(), sc.nextInt() };

		setMin( r1[0] + r2[0], Math.max( r1[1], r2[1] ) );
		setMin( r1[0] + r2[1], Math.max( r1[1], r2[0] ) );
		setMin( r1[1] + r2[0], Math.max( r1[0], r2[1] ) );
		setMin( r1[1] + r2[1], Math.max( r1[0], r2[0] ) );
		System.out.println(Tmin[0] + " " + Tmin[1]);
	}
}
