package YatzyGroup;

import java.util.HashMap;
import java.util.Set;

public class DicePlayFullhouse extends DicePlayDoubles implements IDicePlayWays {
    public int getYatzyResult(int[] rolls) {
        int result = 0;
        super.initialResultMap(rolls);
        if (numberSet.size() == 2) {
            for (Integer tempNumber : numberSet) {
                result += tempNumber * numberMap.get(tempNumber);
            }
        }
        return result;
    }
}
