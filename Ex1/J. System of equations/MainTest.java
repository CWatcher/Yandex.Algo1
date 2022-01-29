import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class MainTest {

//@org.junit.jupiter.api.Test
@Test
void main() {
	main("1 1 0    1 1 1", "0");
}

void main( String input, String output ) {
	System.setIn( new ByteArrayInputStream( input.getBytes() ) );
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut( new PrintStream( out ) );

	Main.main( null );
	assertEquals( output, out.toString().trim() );
}

}
