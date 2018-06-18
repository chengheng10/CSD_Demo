package YatzyGroup;

import java.util.HashMap;
import java.util.Set;

public class DicePlayDoubles implements IDicePlayWays {
    public int getPairs() {
        return pairs;
    }

    public void setPairs(int pairs) {
        this.pairs = pairs;
    }

    private int pairs =0;

    public DicePlayDoubles() {
        this.pairs = 2;
    }

    public int getYatzyResult(int[] rolls) {
        int result = 0;
        HashMap<Integer,Integer> numberMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < rolls.length; i++) {
            Integer tempNumber = new Integer(rolls[i]);
            if (numberMap.containsKey(tempNumber)) {
                numberMap.put(tempNumber, numberMap.get(tempNumber) + 1);
            } else {
                numberMap.put(tempNumber, 1);
            }
        }
        Set<Integer> numberSet = numberMap.keySet();
        for (Integer temp : numberSet) {
            if (numberMap.get(temp) == getPairs()) {
                result = temp * getPairs();
            }
        }
        return result;
    }
}
