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
	double dy = a[0] * b[2] - b[0] * a[2];
	Double x = dx / d;
	Double y = dy / d;
	if ( d == 0 ) {
/*
0. нет решений
x + y = 0
x + y = 1

d = 0
x = (0 - 1) / 0 = -inf
y = (0 - 1) / 0 = -inf

x + 0y = 0
x + 0y = 1
*/
		if ( dx != 0 || dy != 0 )
			System.out.println( 0 );
		else if ( a[0] == 0 && a[1] == 0 && b[0] == 0 && b[1] == 0 ) {
/*
0x + 0y = 0
0x + 0y = 1
*/
			if ( a[2] != 0 || b[2] != 0 )
				System.out.println( 0 );
/*
5. любая пара чисел (x,y) является решением
0x + 0y = 0
0x + 0y = 0
*/
			else
				System.out.println( 5 );
		}
/* 1. бесконечно много решений вида y=kx+b,
значения k и b.
 x + 2y = 1
2x + 4y = 2

0x + 0y = 0
2x + 4y = 2

a1 y = -a0 x + a2
b1 y = -b0 x + b2

k = -a0 / a1 = - b0 / b1
b =  a2 / a1 =   b2 / b1
*/
		else if ( a[0] * a[1] != 0 )
			System.out.println("1 " + -a[0] / a[1] + " " + a[2] / a[1]);
		else if ( b[0] * b[1] != 0 )
			System.out.println("1 " + -b[0] / b[1] + " " + b[2] / b[1]);
/*
3. бесконечно много решений вида x=x0, y — любое,
значение x0.
x + 0y = 1
x + 0y = 1

0x + 0y = 0
2x + 0y = 1

x = a[2] / a[0] = b[2] / b[0]
*/
		else if ( a[0] != 0 )
				System.out.println("3 " + a[2] / a[0] );
		else if ( b[0] != 0 )
				System.out.println("3 " + b[2] / b[0] );

/* 4. бесконечно много решений вида y=y0, x — любое,
значение y0
0x + y = 1
0x + y = 1
*/
		else if ( a[1] != 0 )
				System.out.println("4 " + a[2] / a[1] );
		else if ( b[1] != 0 )
				System.out.println("4 " + b[2] / b[1] );

	}
/*2. единственное решение (x0,y0),
значения x0 и y0
x + 0y = 0
0x + y = 0

d = 1
x = 0
y = 0
*/
	else
		System.out.println("2 "	+ x + " " + y );
}

}
