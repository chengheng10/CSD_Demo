import java.util.HashMap;

/*
Given a positive integer number (eg 42) determine
its Roman numeral representation as a String (eg "XLII").

You cannot write numerals like IM for 999.
Wikipedia states "Modern Roman numerals are written by
expressing each digit separately starting with the
leftmost digit and skipping any digit with a value of zero."

Examples:

1 ->    "I" | 10 ->    "X" | 100 ->    "C" | 1000 ->    "M"
2 ->   "II" | 20 ->   "XX" | 200 ->   "CC" | 2000 ->   "MM"
3 ->  "III" | 30 ->  "XXX" | 300 ->  "CCC" | 3000 ->  "MMM"
4 ->   "IV" | 40 ->   "XL" | 400 ->   "CD" | 4000 -> "MMMM"
5 ->    "V" | 50 ->    "L" | 500 ->    "D" |
6 ->   "VI" | 60 ->   "LX" | 600 ->   "DC" |
7 ->  "VII" | 70 ->  "LXX" | 700 ->  "DCC" |
8 -> "VIII" | 80 -> "LXXX" | 800 -> "DCCC" |
9 ->   "IX" | 90 ->   "XC" | 900 ->   "CM" |

1990 -> "MCMXC"  (1000 -> "M"  + 900 -> "CM" + 90 -> "XC")
2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
  99 -> "XCIX"   (90 -> "XC" + 9 -> "IX")
  47 -> "XLVII"  (40 -> "XL" + 7 -> "VII")
*/
public class RomanNumerals {
    private static String result = "";
    private static HashMap<String, String> romanNumberalHS = new HashMap<String, String>();

    public RomanNumerals() {
        romanNumberalHS.put("1","I");
        romanNumberalHS.put("2","II");
        romanNumberalHS.put("3","III");
        romanNumberalHS.put("4","IV");
        romanNumberalHS.put("5","V");
        romanNumberalHS.put("6","VI");
        romanNumberalHS.put("7","VII");
        romanNumberalHS.put("8","VIII");
        romanNumberalHS.put("9","IX");
        romanNumberalHS.put("10","X");
        romanNumberalHS.put("20","XX");
        romanNumberalHS.put("30","XXX");
        romanNumberalHS.put("40","XL");
        romanNumberalHS.put("50","L");
        romanNumberalHS.put("60","LX");
        romanNumberalHS.put("70","LXX");
        romanNumberalHS.put("80","LXXX");
        romanNumberalHS.put("90","XC");
        romanNumberalHS.put("100","C");
        romanNumberalHS.put("200","CC");
        romanNumberalHS.put("300","CCC");
        romanNumberalHS.put("400","CD");
        romanNumberalHS.put("500","D");
        romanNumberalHS.put("600","DC");
        romanNumberalHS.put("700","DCC");
        romanNumberalHS.put("800","DCCC");
        romanNumberalHS.put("900","CM");
        romanNumberalHS.put("1000","M");
        romanNumberalHS.put("2000","MM");
        romanNumberalHS.put("3000","MMM");
        romanNumberalHS.put("4000","MMMM");


    }

    public static String romanNumeralRepresentation(int i) {
        return romanNumberalHS.get(String.valueOf(i));
    }
}
