import java.util.Scanner;

public class Main {
	static void exit(String s) {
		System.out.println(s);
		System.exit(0);
	}
	static int ceilDiv(int m, int n) {
		return (m - 1) / n + 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt(); // Apartment1
		int Ls = sc.nextInt(); // Levels per section
		int A2 = sc.nextInt(); // Apartment2
		int S2 = sc.nextInt(); // Section2
		int L2 = sc.nextInt(); // Level2

		int LT2 = (S2 - 1) * Ls + L2; // LevelTotal2
		if ( A2 < LT2 || L2 > Ls )
			exit("-1 -1");
		int AlL = ceilDiv( A2, LT2 ); // Apartments per level Low
		if ( LT2 == 1 ) {
			if (A1 <= A2 || A1 <= AlL * Ls )
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
			if ( A1 <= A2 || Ls == 1 )
				System.out.println(1);
			else
				System.out.println(0);
			return;
		}
		int AlH = (A2 - 1) / (LT2 - 1);  // Apartments per level High
		if ( AlL > AlH )
			exit("-1 -1");
		int AsL = AlL * Ls; // Apartments per section Low
		int AsH = AlH * Ls; // Apartments per section High
		int S1L = ceilDiv( A1, AsL ); // Section1 Low
		int S1H = ceilDiv( A1, AsH ); // Section1 High
		if ( S1L == S1H )
			System.out.print(S1L + " ");
		else
			System.out.print(0 + " ");
		int L1L = ceilDiv( (A1 - (S1L - 1) * AsL), AlL ); // Leve1 Low
		int L1H = ceilDiv( (A1 - (S1H - 1) * AsH), AlH ); // Leve1 High
		if ( L1L == L1H )
			System.out.println(L1L);
		else
			System.out.println(0);
	}
}
