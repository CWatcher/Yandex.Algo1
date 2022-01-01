import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner sc = new Scanner( System.in );
	int tTrain = 1;
	int tWait1 = sc.nextInt();
	int tWait2 = sc.nextInt();
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int t1Min = n1 * tTrain + (n1 - 1) * tWait1;
	int t2Min = n2 * tTrain + (n2 - 1) * tWait2;
	int t1Max = n1 * tTrain + (n1 + 1) * tWait1;
	int t2Max = n2 * tTrain + (n2 + 1) * tWait2;
	int tMin = Math.max( t1Min, t2Min );
	int tMax = Math.min( t1Max, t2Max );
	if ( tMin <= tMax )
		System.out.println( tMin + " " + tMax );
	else
		System.out.println( -1 );
}

}
/*
1s 3trains
min t-t-t = 5
max -t-t-t- = 7

3s 2trains
min t---t = 5
max ---t---t--- = 11
*/
