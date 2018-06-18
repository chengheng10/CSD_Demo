package YatzyGroup;

import java.util.HashMap;
import java.util.Set;

public class DicePlayDoubles implements IDicePlayWays {
    private int pairs = 0;
    HashMap<Integer, Integer> numberMap;
    Set<Integer> numberSet;


    public HashMap<Integer, Integer> getNumberMap() {
        return numberMap;
    }

    public void setNumberMap(HashMap<Integer, Integer> numberMap) {
        this.numberMap = numberMap;
    }

    public Set<Integer> getNumberSet() {
        return numberSet;
    }

    public void setNumberSet(Set<Integer> numberSet) {
        this.numberSet = numberSet;
    }

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
        initialResultMap(rolls);
        for (Integer temp : numberSet) {
            if (numberMap.get(temp) == getPairs()) {
                result = temp * getPairs();
            }
        }
        return result;
    }

    public void initialResultMap(int[] rolls) {
        numberMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < rolls.length; i++) {
            Integer tempNumber = new Integer(rolls[i]);
            if (numberMap.containsKey(tempNumber)) {
                numberMap.put(tempNumber, numberMap.get(tempNumber) + 1);
            } else {
                numberMap.put(tempNumber, 1);
            }
        }
        numberSet = numberMap.keySet();
    }
}
