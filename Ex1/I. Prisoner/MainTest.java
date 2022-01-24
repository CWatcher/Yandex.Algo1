import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

@Test
@DisplayName("Prisoner")
void main() {
	main("1 2 3    3 2", "YES");
	main("4 2 3    3 2", "YES");
	main("3 4 3    2 3", "NO");
}
void main( String input, String output ) {
	final InputStream in0 = System.in;
	System.setIn( new ByteArrayInputStream( input.getBytes() ) );

	final ByteArrayOutputStream outByteArray = new ByteArrayOutputStream();
	final PrintStream	out0 = System.out;
	System.setOut( new PrintStream( outByteArray ) );

	Main.main( null );

	assertEquals( output,  outByteArray.toString().trim() );
	System.setIn( in0 );
	System.setOut( out0 );
}

}
