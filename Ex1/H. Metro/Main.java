import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner sc = new Scanner( System.in );
	int p = 1;
	int i1 = sc.nextInt() + p;
	int i2 = sc.nextInt() + p;
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int t1Min = (n1 - 1) * i1 + p;
	int t2Min = (n2 - 1) * i2 + p;
	int t1Max = n1 * i1 + p;
	int t2Max = n2 * i2 + p;
	int tMin = Math.max( t1Min, t2Min );
	int tMax = Math.min( t1Max, t2Max );
	if ( tMin < tMax )
		System.out.println( tMin + " " + tMax );
	else
		System.out.println( -1 );
}

}
