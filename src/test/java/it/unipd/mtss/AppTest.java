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
        // Redirigi l'output della console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Esegui il metodo main con un argomento
        String[] args = {"User"};
        App.main(args);

        // Verifica se l'output è corretto
        assertEquals("Hello User", outContent.toString().trim());
    }

    @Test
    public void testMainWithoutArgument() {
        new App(); 
        // Redirigi l'output della console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Esegui il metodo main senza argomenti
        String[] args = {};
        App.main(args);

        // Verifica se l'output è corretto
        assertEquals("Hello World!", outContent.toString().trim());
    }
}