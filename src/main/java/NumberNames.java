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
    public HashMap<String, String> numberTeenHash = new HashMap<String, String>();
    public HashMap<String, String> numberTyHash = new HashMap<String, String>();
    public String result = "";

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
        this.numberTeenHash.put("11", "eleven");
        this.numberTeenHash.put("12", "twelve");
        this.numberTeenHash.put("13", "thirteen");
        this.numberTeenHash.put("14", "forteen");
        this.numberTeenHash.put("15", "fifteen");
        this.numberTeenHash.put("16", "sixteen");
        this.numberTeenHash.put("17", "seventeen");
        this.numberTeenHash.put("18", "eighteen");
        this.numberTeenHash.put("19", "nineteen");
        this.numberTyHash.put("2", "twenty");
        this.numberTyHash.put("3", "thirty");
        this.numberTyHash.put("4", "forty");
        this.numberTyHash.put("5", "fifty");
        this.numberTyHash.put("6", "sixty");
        this.numberTyHash.put("7", "seventy");
        this.numberTyHash.put("8", "eighty");
        this.numberTyHash.put("9", "ninety");
    }

    public String getNumberNames(long number) {
//        String result = "";
        if (number >= 1000000) {
            result = String.valueOf(getNumberNames(number / 1000000)) + " million" + ((number % 1000000 == 0) ? "" : ", ") + getNumberNames(number % 1000000);
        }else if (number >= 1000) {
            result = String.valueOf(getNumberNames(number / 1000)) + " thousand" + ((number % 1000 == 0) ? "" : ", ") + getNumberNames(number % 1000);
        } else if (number >= 100) {
            result = String.valueOf(getNumberNames(number / 100)) + " hundred" + ((number % 100 == 0) ? "" : " and " + getNumberNames(number % 100));
        } else if (number >= 20) {
            result = this.numberTyHash.get(String.valueOf(number / 10)) + " " + this.numberHash.get(String.valueOf(number % 10));
        } else if (number > 10) {
            result = this.numberTeenHash.get(String.valueOf(number));
        }else{
            result = this.numberHash.get(String.valueOf(number));
        }
        return result;
    }
}
