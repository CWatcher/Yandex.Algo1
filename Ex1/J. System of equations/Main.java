import java.util.Scanner;

public class Main {

public static void main( String[] args ) {
	new Main();
}

Scanner sc = new Scanner( System.in );
double	a1 = sc.nextDouble();
double	b1 = sc.nextDouble();
double	a2 = sc.nextDouble();
double	b2 = sc.nextDouble();
double	c1 = sc.nextDouble();
double	c2 = sc.nextDouble();

public Main() {
/*
a1 x + b1 y = c1
a2 x + b2 y = c2

a1 b2 x + b1 b2 y = c1 b2
a2 b1 x + b1 b2 y = c2 b1

(a1 b2 - a2 b1) x = c1 b2 - c2 b1

x = (c1 b2 - c2 b1) / (a1 b2 - a2 b1) = dx / d
y = (c1 a2 - c2 a1) / (a1 b2 - a2 b1) = dy / d
*/
	double d  = a1 * b2 - a2 * b1;
	double dx = c1 * b2 - c2 * b1;
	double dy = a1 * c2 - a2 * c1;
	double  x = dx / d;
	double  y = dy / d;
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
/* 1. бесконечно много решений вида y=kx+b,
значения k и b.
 x + 2y = 1
2x + 4y = 2

0x + 0y = 0
2x + 4y = 2

b1 y = -a1 x + c1
b2 y = -a2 x + c2

k = -a1 / b1 = - a2 / b2
b =  c1 / b1 =   c2 / b2
*/
		else if ( a1 * b1 != 0 )
			System.out.println("1 " + -a1 / b1 + " " + c1 / b1);
		else if ( a2 * b2 != 0 )
			System.out.println("1 " + -a2 / b2 + " " + c2 / b2);
/*
3. бесконечно много решений вида x=x0, y — любое,
значение x0.
x + 0y = 1
x + 0y = 1

0x + 0y = 0
2x + 0y = 1

x = c1 / a1 = c2 / a2
*/
		else if ( a1 != 0 )
				System.out.println("3 " + c1 / a1 );
		else if ( a2 != 0 )
				System.out.println("3 " + c2 / a2 );

/* 4. бесконечно много решений вида y=y0, x — любое,
значение y0
0x + y = 1
0x + y = 1
*/
		else if ( b1 != 0 )
				System.out.println("4 " + c1 / b1 );
		else if ( b2 != 0 )
				System.out.println("4 " + c2 / b2 );

/*
5. любая пара чисел (x,y) является решением
0x + 0y = 0
0x + 0y = 0
*/
		else if ( c1 == 0 && c2 == 0 )
			System.out.println( 5 );
/*
0. нет решений
0 0 0
0 0 1
*/
		else
			System.out.println( 0 );
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
