#include <iostream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

void exitMe(string s) {
	cout << s;
	exit(0);
}
int ceilDiv(int m, int n) {
	return (m - 1) / n + 1;
}
int main() {
	int A1; // Apartment1
	int Ls; // Levels per section
	int A2; // Apartment2
	int S2; // Section2
	int L2; // Level2
	cin >> A1 >> Ls >> A2 >> S2 >> L2;
	int LT2 = (S2 - 1) * Ls + L2; // LevelTotal2
	if ( A2 < LT2 || L2 > Ls )
		exitMe("-1 -1");
	int AlL = ceilDiv( A2, LT2 ); // Apartments per level Low
	if ( LT2 == 1 ) {
		if (A1 <= A2 || A1 <= AlL * Ls )
			cout << 1 << " ";
		else
			cout << 0 << " ";
		if ( A1 <= A2 || Ls == 1 )
			cout << 1 << endl;
		else
			cout << 0 << endl;
		return 0;
	}
	int AlH = (A2 - 1) / (LT2 - 1);  // Apartments per level High
	if ( AlL > AlH )
		exitMe("-1 -1");
	int AsL = AlL * Ls; // Apartments per section Low
	int AsH = AlH * Ls; // Apartments per section High
	int S1L = ceilDiv( A1, AsL ); // Section1 Low
	int S1H = ceilDiv( A1, AsH ); // Section1 High
	if ( S1L == S1H )
		cout << S1L << " ";
	else
		cout << 0 << " ";
	int L1L = ceilDiv( A1 - (S1L - 1) * AsL, AlL ); // Leve1 Low
	int L1H = ceilDiv( A1 - (S1H - 1) * AsH, AlH ); // Leve1 High
	if ( L1L == L1H )
		cout << L1L << endl;
	else
		cout << 0 << endl;
}
