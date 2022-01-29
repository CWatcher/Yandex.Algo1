import java.util.Scanner;

public class Main {
public static void main( String args[] ) {
	new Main();
}

Scanner sc = new Scanner( System.in );
double[] a = scan();
double[] b = scan();

double[] scan() {
	double[] z = new double[3];
	for ( int i = 0; i < 3; i++ )
		z[i] = sc.nextDouble();
	return z;
}

public Main() {
/*
a0 x + a1 y = a2
b0 x + b1 y = b2

a0 b1 x + a1 b1 y = a2 b1
b0 a1 x + a1 b1 y = b2 a1

(a0 b1 - b0 a1) x = a2 b1 - b2 a1

x = (a2 b1 - b2 a1) / (a0 b1 - b0 a1) = dx / d
y = (a2 b0 - b2 a0) / (a0 b1 - b0 a1) = dy / d
*/
	double d  = a[0] * b[1] - b[0] * a[1];
	double dx = a[2] * b[1] - b[2] * a[1];
	double dy = a[2] * b[0] - b[2] * a[0];
	Double x = dx / d;
	Double y = dy / d;
/*
0. нет решений
x + y = 0
x + y = 1

d = 0
x = (0 - 1) / 0 = -inf
y = (0 - 1) / 0 = -inf
*/
	if ( x.isInfinite() || y.isInfinite() )
		System.out.println( 0 );
/*
1. бесконечно много решений вида y=kx+b,
значения k и b.
x + y = 1
x + y = 1

d = 0
x = (1 - 1) / 0 = nan
y = (1 - 1) / 0 = nan

3. бесконечно много решений вида x=x0, y — любое,
значение x0.
x + 0y = 1
x + 0y = 1

d = 0
x = (1*0 - 1*0) / 0 = nan
y = (1 - 1) / 0 = nan

4. бесконечно много решений вида y=y0, x — любое,
значение y0
0x + y = 1
0x + y = 1

d = 0
x = (1 - 1) / 0 = nan
y = (1*0 - 1*0) / 0 = nan

5. любая пара чисел (x,y) является решением
0x + 0y = 0
0x + 0y = 0

d = 0
x = nan
y = nan

2. единственное решение (x0,y0),
значения x0 и y0
x + 0y = 0
0x + y = 0

d = 1
x = 0
y = 0
*/
}

}
