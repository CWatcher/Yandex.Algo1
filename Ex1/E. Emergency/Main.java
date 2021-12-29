import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k1 = sc.nextInt();
		int m = sc.nextInt();
		int k2 = sc.nextInt();
		int p2 = sc.nextInt();
		int n2 = sc.nextInt();

		double dk_n = (double)k2 / ((p2 - 1) * m + n2);
		if ( dk_n < 1 ) {
			System.out.println("-1\n-1");
			System.exit(1);
		};
		int k_n = (int) (int)Math.ceil( dk_n );
		int k_p = k_n * m;

		int p1 = (int)Math.ceil( (double)k1 / k_p );
		int n1 = (int)Math.ceil( (double)(k1 - (p1 - 1) * k_p) / k_n );

		System.out.printf("%d\n%d\n", p1, n1);
	}
}
