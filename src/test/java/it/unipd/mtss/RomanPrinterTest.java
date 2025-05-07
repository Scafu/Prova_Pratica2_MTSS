package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.lang.reflect.Method;
import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A-TRIP Test
 * (Automatic): ok
 * (Thorough): ok
 * (Repeatable): ok
 * (Independent): ok
 * (Professional): ok
 */

 /**
  * Right - BICEP Test
  * (Right): checkRomanPrint()
  * (Boundary): 
  *   (Conformance): checkPrivateMethodOfPrintWithException()
  *   (Order): absent
  *   (Range): checkPrivateMethodOfPrint()
  *   (Reference): absent
  *   (Existence): checkPrivateMethodOfPrint()
  *   (Cardinality): absent
  *   (Time): absent
  * (Inverse): absent
  * (Cross-check): absent
  * (Error): absent
  * (Performance): absent
  */

/**
 * Unit test for simple App.
 */
public class RomanPrinterTest {

    RomanPrinter romanPrinter;
    Method printAsciiArt;

    // Set up the test
    @BeforeEach
    public void setUp() throws Exception {
        romanPrinter = new RomanPrinter();
        printAsciiArt = RomanPrinter.class.getDeclaredMethod("printAsciiArt", String.class);
        printAsciiArt.setAccessible(true);
    }

    // Make access to private method
    public String RomanPrinter_printAsciiArt(String romanNumber) {
        if(printAsciiArt != null){
            try {
                return (String) printAsciiArt.invoke(romanPrinter, romanNumber);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    // Check if the public method works
    @Test
    public void checkRomanPrint() {
        assertNotEquals("", RomanPrinter.print(1));
        assertEquals("", RomanPrinter.print(0));
        assertEquals("", RomanPrinter.print(-1));
    }

    // Check if the private method works
    @Test
    public void checkPrivateMethodOfPrint() {
        assertEquals("", RomanPrinter_printAsciiArt(""));
        assertEquals("", RomanPrinter_printAsciiArt(null));
        assertEquals("",RomanPrinter_printAsciiArt("A"));
    }

    // 
    @Test
    public void test() {
        assertTimeout(Duration.ofMillis(1000), () -> {
        for(int i = 1; i <= 20; i++) {
        String output = RomanPrinter.print(i);
        System.out.println(output); // STAMPA SU CONSOLE
        System.out.println("- " + i); // Mostra il numero corrispondente
    }
        });
    }
}