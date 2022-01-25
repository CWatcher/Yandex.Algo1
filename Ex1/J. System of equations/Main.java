import java.util.Scanner;

public class Main {
public static void Main( String args[] ) {
	new Main().solve();
}
Scanner		sc = new Scanner( System.in );
double[]	a = scan();
double[]	b = scan();
double 		x;
double 		y;
double[] scan() {
	double[] z = new double[3];
	for ( int i = 0; i < 3; i++ )
		z[i] = sc.nextDouble();
	return z;
}
void solve() {
/*
a0 x + a1 y = a2
b0 x + b1 y = b2

x = (a2 - a1 y)/a0
b0 (a2 - a1 y)/a0 + b1 y = b2

b0/a0 a2 - a1 a1/a0 y + b1 y = b2

y = (b2 - b0/a0 a2) / (b1 - a1 a1/a0)
x = (a2 - b1/a1 b2) / (a1 - b1 b1/b0)

0. нет решений
x + y = 0
x + y = 1

y = (1) / (1 - 1*1/1) = inf
x = (0 - 1 * inf ) / 1 = - inf

1. бесконечно много решений вида y=kx+b,
значения k и b.
x + y = 1
x + y = 1

y = 0 / 0 = nan
x = (1 - nan) / 1 = nan

3. бесконечно много решений вида x=x0, y — любое,
значение x0.
x + 0y = 1
x + 0y = 1

y = (1 - 1) / (0 - 0) = inf
x = (1 - 0 * inf) / 1 ~ 0 * inf = nan

4. бесконечно много решений вида y=y0, x — любое,
значение y0
0x + y = 1
0x + y = 1

y = (1 - 0/0*1) / (1 - 0/0) = nan
x = (1 - 1/0*1) / (1 - 1*1/0) = nan

5. любая пара чисел (x,y) является решением
0x + 0y = 0
0x + 0y = 0

y = (0/0*0) / (0*0/0) = nan?

2. единственное решение (x0,y0),
значения x0 и y0
0x + y = 0
x + 0y = 0

y =
*/

}

}
