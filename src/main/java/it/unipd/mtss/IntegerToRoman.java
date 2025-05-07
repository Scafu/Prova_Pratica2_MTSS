//////////////////////////////////////////////////////////////////// 
// [Alessandro] [Mazzariol] [2101050] 
// [Marco] [Barbiero] [2101049] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
  
public class IntegerToRoman {
    private static final int[] values = {1};
    private static final String[] symbols = {"I"};
    
    public static String convert(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length && number >= 0; i++) {
            while (values[i] <= number) {
                number -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }
}