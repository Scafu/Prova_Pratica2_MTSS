//////////////////////////////////////////////////////////////////// 
// [Alessandro] [Mazzariol] [2101050] 
// [Marco] [Barbiero] [2101049] 
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMainWithArgument() {
        new App(); 
        String[] args = {"User"};
        App.main(args);
    }

    @Test
    public void testMainWithoutArgument() {
        new App(); 
        String[] args = {};
        App.main(args);
    }
}