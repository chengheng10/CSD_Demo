package YatzyGroup;

import java.util.HashMap;
import java.util.Set;

public class DicePlayTwopairs implements IDicePlayWays {
    private int pairs = 0;

    public DicePlayTwopairs() {
        this.pairs = 2;
    }

    public int getPairs() {
        return pairs;
    }

    public void setPairs(int pairs) {
        this.pairs = pairs;
    }

    public int getYatzyResult(int[] rolls) {
        int result = 0;
        int count = 0;
        HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
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
                count += 1;
                result += temp * getPairs();
            }
        }
        return count == 2 ? result : 0;
    }
}
