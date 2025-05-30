package it.unipd.mtss;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertTimeout;
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
  * (Right): intergerToRomanTest_IVXL()
  * (Boundary): 
  *   (Conformance): absent
  *   (Order): absent
  *   (Range): intergerToRomanNegativeTest_IVXL()
  *   (Reference): absent
  *   (Existence): absent
  *   (Cardinality): absent
  *   (Time): absent
  * (Inverse): romanToIntegerTest_IVXL()
  * (Cross-check): absent
  * (Error): absent
  * (Performance): romanToIntegerTest_IVXL()
  */

/**
 * Unit test for simple App.
 */
public class IntegerToRomanTest 
{
    IntegerToRoman integerToRoman;

    @BeforeEach
    public void setUp(){
        integerToRoman = new IntegerToRoman();
    }
    
    @Test
    public void intergerToRomanTest_IVXL()
    {   
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XII", IntegerToRoman.convert(12));
        assertEquals("XVII", IntegerToRoman.convert(17));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XXIV", IntegerToRoman.convert(24));
        assertEquals("XXV", IntegerToRoman.convert(25));
        assertEquals("XXXVIII", IntegerToRoman.convert(38));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIV", IntegerToRoman.convert(44));
        assertEquals("XLVI", IntegerToRoman.convert(46));
        assertEquals("L", IntegerToRoman.convert(50));
    }


    @Test
    public void intergerToRomanNegativeTest_IVXL()
    {
        assertEquals("", IntegerToRoman.convert(-1));
        assertEquals("", IntegerToRoman.convert(0));
    }
    
    public int romanToInteger_IVXL(String romanNumeral) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
    
        int result = 0;
        int prevValue = 0;
    
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanValues.get(currentChar);
    
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
    
            prevValue = currentValue;
        }
    
        return result;
    }
    
    @Test
    public void romanToIntegerTest_IVXL(){
        assertTimeout(Duration.ofMillis(1000), () -> {
        for(int i = 1; i <= 50; i++){
            assertEquals(i, romanToInteger_IVXL(IntegerToRoman.convert(i)));
        }
    });
    }

    @Test
    public void IntergerToRomanTest_CDM() {
        assertEquals("C", IntegerToRoman.convert(100));
	    assertEquals("CC", IntegerToRoman.convert(200));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));
	    assertEquals("DCC", IntegerToRoman.convert(700));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    public int romanToInteger_CDM(String romanNumeral) {

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('C', 100);
 	    romanValues.put('D', 500);
        romanValues.put('M', 1000);
        

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    @Test
    public void romanToIntegerTest_CDM() {
        assertTimeout(Duration.ofMillis(1000), () -> {
        for (int i = 100; i <= 1000; i = i + 100) {
            assertEquals(i, romanToInteger_CDM(IntegerToRoman.convert(i)));
        }
        });
    }
}
