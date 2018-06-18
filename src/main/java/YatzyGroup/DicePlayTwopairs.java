package YatzyGroup;

import java.util.HashMap;
import java.util.Set;

public class DicePlayTwopairs extends DicePlayDoubles implements IDicePlayWays {
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
        super.initialResultMap(rolls);
        for (Integer temp : numberSet) {
            if (numberMap.get(temp) == getPairs()) {
                count += 1;
                result += temp * getPairs();
            }
        }
        return count == 2 ? result : 0;
    }
}
