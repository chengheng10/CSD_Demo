/*
Spell out a number. For example

      99 --> ninety nine
     300 --> three hundred
     310 --> three hundred and ten
    1501 --> one thousand, five hundred and one
   12609 --> twelve thousand, six hundred and nine
  512607 --> five hundred and twelve thousand,
             six hundred and seven
43112603 --> forty three million, one hundred and
             twelve thousand,
             six hundred and three

[Source http://rosettacode.org]
   */


import java.util.HashMap;

public class NumberNames {
    public HashMap<String, String> numberHash = new HashMap<String, String>();

    public NumberNames() {
        this.numberHash.put("0", "");
        this.numberHash.put("1", "one");
        this.numberHash.put("2", "two");
        this.numberHash.put("3", "three");
        this.numberHash.put("4", "four");
        this.numberHash.put("5", "five");
        this.numberHash.put("6", "six");
        this.numberHash.put("7", "seven");
        this.numberHash.put("8", "eitht");
        this.numberHash.put("9", "nine");
        this.numberHash.put("10", "ten");
        this.numberHash.put("11", "eleven");
        this.numberHash.put("12", "twelve");
    }

    public String getNumberNames(long number) {
        String result = "";
        if (number < 12) {
            result = this.numberHash.get(String.valueOf(number));
        } else if (number < 100) {
            result = this.numberHash.get(String.valueOf(number / 10)) + "ty " + this.numberHash.get(String.valueOf(number % 10));
        } else if (number >= 100) {
            result = this.numberHash.get(String.valueOf(number / 100)) + " hundred" + ((number%100==0)?"":" and ")+getNumberNames(number % 100);
        }


        return result;
    }
}
