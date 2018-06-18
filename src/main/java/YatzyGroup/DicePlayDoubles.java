package YatzyGroup;

import java.util.HashMap;
import java.util.Set;

public class DicePlayDoubles implements IDicePlayWays {
    private int pairs =0;
    HashMap<Integer,Integer> numberMap = new HashMap<Integer, Integer>();


    public int getPairs() {
        return pairs;
    }

    public void setPairs(int pairs) {
        this.pairs = pairs;
    }

    public DicePlayDoubles() {
        this.pairs = 2;
    }

    public int getYatzyResult(int[] rolls) {
        int result = 0;
        Set<Integer> numberSet = initialResultMap(rolls);
        for (Integer temp : numberSet) {
            if (numberMap.get(temp) == getPairs()) {
                result = temp * getPairs();
            }
        }
        return result;
    }

    private Set<Integer> initialResultMap(int[] rolls) {
        for (int i = 0; i < rolls.length; i++) {
            Integer tempNumber = new Integer(rolls[i]);
            if (numberMap.containsKey(tempNumber)) {
                numberMap.put(tempNumber, numberMap.get(tempNumber) + 1);
            } else {
                numberMap.put(tempNumber, 1);
            }
        }
        return numberMap.keySet();
    }
}
