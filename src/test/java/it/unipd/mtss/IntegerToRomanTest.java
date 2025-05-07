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
        for(int i = 1; i <= 20; i++){
            assertEquals(i, romanToInteger_IVXL(IntegerToRoman.convert(i)));
        }
    });
    }
}
