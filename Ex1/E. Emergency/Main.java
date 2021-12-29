import java.util.Scanner;

public class Main {
	static void exit(String s) {
		System.out.println(s);
		System.exit(0);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt();
		int Fs = sc.nextInt();
		int A2 = sc.nextInt();
		int S2 = sc.nextInt();
		int F2 = sc.nextInt();

		if ( A1 == 1 )
			exit("1\n1");
		int FT2 = (S2 - 1) * Fs + F2;
		if ( A2 < FT2 || F2 > Fs )
			exit("-1\n-1");
		if ( A1 == A2 )
			exit(S2 + "\n" + F2);
		int AfL = A2 / FT2;
		if ( A2 % FT2 != 0 )
			AfL++;
		int AfH = 1_000_001;
		if (FT2 > 1)
			AfH = (A2 - 1) / (FT2 - 1);
		if ( S2 == 1 && F2 == 1 ) {
			if (A1 <= A2 || A1 <= AfL * Fs )
				System.out.println(1);
			else
				System.out.println(0);
			if ( A1 <= A2 || Fs == 1 )
				System.out.println(1);
			else
				System.out.println(0);
			return;
		}
		if ( AfL != AfH )
			exit("-1\n-1");
		int Af = AfL;
		int As = Af * Fs;
		int S1 = (int)Math.ceil( (double)A1 / As );
		int F1 = (int)Math.ceil( (double)(A1 - (S1 - 1) * As) / Af );
		System.out.printf("%d\n%d\n", S1, F1);
	}
}
