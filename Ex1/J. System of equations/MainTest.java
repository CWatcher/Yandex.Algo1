import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class MainTest {

//@org.junit.jupiter.api.Test
@Test
void test() {
	test("1 1 0    1 1 1", "0");
	test("0 0 0    0 0 1", "0");
	test("0 0 0    0 0 0", "5");
	test("1 2 1    2 4 2", "1 -0.5 0.5");
	test("0 0 0   -2 1 3", "1 2.0 3.0");
}

void test( String input, String output ) {
	System.setIn( new ByteArrayInputStream( input.getBytes() ) );
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut( new PrintStream( out ) );

	Main.main( null );
	assertEquals( output, out.toString().trim() );
}

}
