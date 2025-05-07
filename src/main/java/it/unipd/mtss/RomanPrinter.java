//////////////////////////////////////////////////////////////////// 
// [Alessandro] [Mazzariol] [2101050] 
// [Marco] [Barbiero] [2101049] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

  public static String print(int num) {
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber) {
    if (romanNumber == null || romanNumber.isEmpty()) {
      return "";
    }

    StringBuilder out = new StringBuilder();
    for (int i = 0; i < RomanNumber.lineHeight; i++) {
      for (String ch : romanNumber.split("")) {
        String line = getAsciiLine(ch, i);
        if (line.isEmpty()) {
          return "";
        }
        out.append(line).append(" ");
      }
      out.append("\n");
    }

    out.deleteCharAt(out.length() - 1); // Rimuove l'ultimo \n
    return out.toString();
  }

  //Metodo estratto per ridurre la complessità
  private static String getAsciiLine(String ch, int row) {
    switch (ch) {
      case "I": return RomanNumber.I[row]; 
      case "V": return RomanNumber.V[row];
      case "X": return RomanNumber.X[row];
      case "L": return RomanNumber.L[row];
      case "C": return RomanNumber.C[row];
      case "D": return RomanNumber.D[row];
      case "M": return RomanNumber.M[row];
      default: return "";
    }
  }
}


